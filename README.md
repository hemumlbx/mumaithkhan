# Data Viewer Automation

QA Automation for the Data Viewer ETL and UI.  Uses screenplay pattern and serenity.

# 1.1 GRADLE Tool

    The Gradle management tool will be using to run the test
    . build.gradle
    . settings.gradle

# 1.2 Common Libraries

    Some common libraries will be imported by the dependency task in build.gradle 

### 1.2.1 Serenity lib

    net.serenity-bdd:serenity-core
    net.serenity-bdd:serenity-junit

### 1.2.2 Cucumber lib

    net.serenity-bdd:serenity-cucumber

### 1.2.3 RestAssured lib

    net.serenity-bdd:serenity-rest-assured

### 1.2.4 Assertion lib

    org.hamcrest:hamcrest-all

# 1.3 Configuration Properties

### 1.3.1 Config Properties

### 1.3.2 Serenity Properties

    serenity.properties

### 1.3.2 Serenity Conf File

    serenity.conf contains all the project related configuration URL's specific to each environment qa1, qa2, qa3 and qa4 which will be used in GitLab CI CD variables for the specific environment to run the Automation.

# 1.4 Resources folders

### 1.4.1 Feature directory

     resources/features/dealersummary contains the features that access Dealer Summary application to verify the programs created using Incentive Authoring
     resources/features/programsearchui contains the features that access Program Search application to verify the programs created using Incentive Authoring
     resources/features/programsummary contains the features that access Program Summary application to verify the programs created using Incentive Authoring
     resources/features/incentiveauthoring contains the features that access Incentive Authoring application to verify the vehicle descriptions in several places including pdf's published through Data Viewer
     resources/features/offerauthoring contains the features that access Offer Authoring application to verify the vehicle descriptions in several places including pdf's published through Data Viewer
     resources/features/layout contains scenarios related to general layout verification of dataviewer using different tabs
     resources/features/programsearchws contains scenarios related to verifying the programs created on Published Vehicles in Incentive Authoring for different versions and methods
     resources/features/publishws contains scenarios related to verifying the programs created on Published Vehicles in Incentive Authoring for different versions and methods
     resources/features/publishdescriptions contains scenarios related to Adding Vehicle Descriptions, Publishing Descriptions and Verying the Descriptions in Master Vehicle Database
     resources/features/staging contains scenarios related to Delta Tab data verification in Data Viewer after running the Staging ETL using QA Feed

### 1.4.2 Dataset directory

    resources/dataset/loadscripts directory contains the program and offer load scripts which will be used by specific Jenkins tasks in Automation to create New programs or offers after the Publish ETL job is complete.
    resources/dataset/staging contains the staging file that loads into dataviewer xet boc through Automation and before running Staging ETL
    resources/dataset/xet contains the RSA key needed to access xet box to upload any staging files or to trigger any ETL's
    resources/dataset/xray contains the xray configuration to create the Json files for Xray

# 1.5 How to Execute

### 1.5.1 Execute locally

    gradlew clean test aggregate

### 1.5.1.1 Hooks
    @resetCategoryFields
    This After hook, will reset the values back to original form.
    My scenario looks for a value with specific name and changes that name to another new name,
    so after hook will reset those values so that when we run the scenario again,
    the test does not fail looking for the required value.

### 1.5.2 Execute using CI/CD

either
- push a change to the project
- or go to the data viewer git link, from the left sidebar go to CI/CD, Pipelines, and click Run Pipeline

also, ensure that the CI/CD environment variable is set to the desired environment in gitlab (qa1, qa2, qa3, qa4)

# 1.6 Project Location

Project test cases can be found at:
Xray Test Repository: https://jira.autodata.net/secure/XrayTestRepositoryAction!default.jspa?entityKey=GMIOMSUS&path=%5Craven_all_tests
User Guide Location: https://jdpower.sharepoint.com/:w:/r/sites/engineering_ADS/Quality%20Assurance/Automation/User%20Guides/GM/QA%20Automation%20User%20Guide%20-%20Data%20Viewer.docx?d=w50b1ad6d9e38472ea41e8517167dfd3e&csf=1&web=1&e=QAHOeZ

# 1.7 Importing new features to Jira Xray

- create a zipped folder of the features folder - "features.zip"
- run the following command in the location of "features.zip" using the command prompt:
    - `curl -H "Content-Type:multipart/form-data" -u GM_Auto:P@sswordGM -F "file=@features.zip" https://jira.autodata.net/rest/raven/1.0/import/feature?projectKey=GMIOMSUS`
- add the ticket number created for each scenario from Xray as a tag to each scenario - e.g. @TEST:GMIOMSUS-11111
    - tag background step IDs at the feature level
- in Jira, add the tests to their appropriate Test Sets - the tests in the repository can be filtered using the path tag

# 1.8 Automatically Exporting Pipeline Test Results to Xray

- make sure that the following CI/CD variables are set for the project in gitlab:
    - environment - (qa1, qa2, qa3, qa4)
    - test_plan_key - (id of the Test Plan ticket - eg. GMIOMSUS-12345)
    - fix_version - (full name of the fix version - eg. QA Automation Test)
    - jira_user - (jira username - eg. GM_Auto)
    - jira_pass - (jira password - eg. P@sswordGM)
    - jira_url - (jira url - jira.autodata.net)

The results will be exported as a Test Execution that links to the specified Test Plan

# 1.9 YML Stages

- run_data_viewer_add_descriptions stage:
  - This stage runs the specific runners "DVAddDescriptionsUS" and "DVAddDescriptionsCA" to add descriptions in Data Viewer using Edge Browser
- run_data_viewer_publish_descriptions stage:
  - This stage runs the specific runners "DVPublishDescriptionsUS" and "DVPublishDescriptionsCA" to publish the added descriptions from the previous stage in Data Viewer using Edge Browser
  - Runs Data Viewer Publish ETL using tasks "RunDataViewerPublishETLUS" and "RunDataViewerPublishETLCA"
  - Runs Solr Index Primer restart job using tasks "RestartSolrPrimerUS" and "RestartSolrPrimerCA" since the Data Viewer Publish ETL shuts down the solr index primer
- run_data_viewer_master_vehicle_database stage:
  - This stage verifies the Published Descriptions in Master vehicle Database using runner "DVMasterVehicleDB" for both US and CA
- run_data_viewer_incentive_authoring stage:
  - Triggers Jenkins Program Load Script in US first and CA later using "RunAfterProgramLoadJenkinsUS" and "RunAfterProgramLoadJenkinsCA" to have the New Programs
  - It uses Programs created in previous step and Runs "DVIncentiveAuthoring" runner for both US and CA to verify the vehicle descriptions in several places including pdf's and publish the Programs to production
- run_data_viewer_offer_authoring stage:
   - Triggers Jenkins Offer Load Script in US first and CA later using "RunAfterOfferLoadJenkinsUS" and "RunAfterOfferLoadJenkinsCA" to have the New Offers
   - It uses Offers created in previous step and Runs "DVOfferAuthoring" runner for both US and CA to verify the vehicle descriptions in several places including pdf's and publish the Offers to production
- run_data_viewer_hosted_reports stage:
  - Triggers the runners "DVDealerSummary", "DVProgramSearchUI" and "DVProgramSummaryUI" using edge browser to verify the vehicle descriptions and programs added from the Incentive Authoring stage
- run_data_viewer_webservices stage:
  - Triggers the runners "DVPublishWS", "DVProgramSearchWS" to verify the vehicle descriptions and programs / Offers added from the Incentive Authoring and Offer Authoring stage for different methods and endpoints
- run_data_viewer_layout_verification stage:
  - This stage runs all the runners specific to layout verification in parallel using edge browser
