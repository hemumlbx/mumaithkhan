package gm.dataviewer.utils;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.io.IOException;

public class JenkinsAfterOfferLoadCA {
    private static final EnvironmentSpecificConfiguration environmentVariables = EnvironmentSpecificConfiguration.from(SystemEnvironmentVariables.createEnvironmentVariables());
    private static final String jenkinsCrumbUrl = environmentVariables.getProperty("jenkins.crumb.url");
    private static final String offerLoadJenkinsUrl = environmentVariables.getProperty("jenkins.offerLoad.url");
    private static final String serverVal = environmentVariables.getProperty("jenkins.server.ca.value");
    private static final String offerLoadJenkinsRssUrl = environmentVariables.getProperty("jenkins.offerLoad.rss.url");
    private static final String offerLoadFileAfterCA = environmentVariables.getProperty("filepaths.programLoadFile.afterOfferLoad.ca");

    public static void main(String[] args) throws IOException {
        JenkinsHelpers.triggerOfferLoad(jenkinsCrumbUrl, offerLoadJenkinsUrl, serverVal, offerLoadFileAfterCA, offerLoadJenkinsRssUrl);
    }
}
