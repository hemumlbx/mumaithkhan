package gm.dataviewer.utils;

import io.restassured.path.json.JsonPath;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.URL;

public class JenkinsHelpers {
    public static String xmlHolderLocation = "src/test/resources/dataset/xmlHolder.xml";

    public static void triggerProgramLoad(String jenkinsCrumbUrl, String programLoadJenkinsUrl, String serverVal, String programLoadFile, String jenkinsRssUrl) throws IOException {
        waitForRunningJenkinsJob(jenkinsRssUrl);
        int oldJobNumber = getJenkinsJobNumber(jenkinsRssUrl);
        HttpGet crumbReq = new HttpGet(jenkinsCrumbUrl);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();

        JsonPath path = new JsonPath(responseHandler.handleResponse(httpClient.execute(crumbReq)));
        String crumbRequestField = path.getString("crumbRequestField");
        String crumb = path.getString("crumb");

        HttpPost buildPost = new HttpPost(programLoadJenkinsUrl);
        String json = "{" +
                "    \"parameter\": [" +
                "        {" +
                "            \"name\": \"server\"," +
                "            \"value\": \"" + serverVal + "\"" +
                "        }," +
                "        {" +
                "            \"name\": \"./iom-program-repository/src/main/resources/Setup.xml\"," +
                "            \"file\": \"loadScript\"" +
                "        }" +
                "    ]" +
                "}";

        MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
        entityBuilder.addBinaryBody(
                "loadScript",
                new FileInputStream(programLoadFile),
                ContentType.APPLICATION_OCTET_STREAM,
                new File(programLoadFile).getName()
        );
        entityBuilder.addTextBody("json", json, ContentType.TEXT_PLAIN);
        entityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        HttpEntity multipartEntity = entityBuilder.build();
        buildPost.setEntity(multipartEntity);
        buildPost.setHeader(crumbRequestField, crumb);
        HttpResponse triggerBuildResp = httpClient.execute(buildPost);
        int statusCode = triggerBuildResp.getStatusLine().getStatusCode();
        int newJobNumber = oldJobNumber + 1;
        if (statusCode == 201) {
            System.out.println("Jenkins job " + newJobNumber + " created successfully");
            while (getJenkinsJobNumber(jenkinsRssUrl) == oldJobNumber) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
            if (getJobBuildStatus(jenkinsRssUrl).equalsIgnoreCase("stable")) {
                System.out.println("Jenkins job " + getJenkinsJobNumber(jenkinsRssUrl) + " completed - STABLE");
            } else if (getJobBuildStatus(jenkinsRssUrl).equalsIgnoreCase("broken")) {
                System.out.println("Jenkins job " + getJenkinsJobNumber(jenkinsRssUrl) + " completed - BROKEN");
            }

            File xmlHolder = new File(xmlHolderLocation);
            xmlHolder.delete();
        } else {
            System.out.println("Failed to create Jenkins job\n Status Code: " + statusCode);
        }
    }

    public static void triggerOfferLoad(String jenkinsCrumbUrl, String offerLoadJenkinsUrl, String serverVal, String offerLoadFile, String jenkinsRssUrl) throws IOException {
        waitForRunningJenkinsJob(jenkinsRssUrl);
        int oldJobNumber = getJenkinsJobNumber(jenkinsRssUrl);
        HttpGet crumbReq = new HttpGet(jenkinsCrumbUrl);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();

        JsonPath path = new JsonPath(responseHandler.handleResponse(httpClient.execute(crumbReq)));
        String crumbRequestField = path.getString("crumbRequestField");
        String crumb = path.getString("crumb");

        HttpPost buildPost = new HttpPost(offerLoadJenkinsUrl);
        String json = "{" +
                "    \"parameter\": [" +
                "        {" +
                "            \"name\": \"server\"," +
                "            \"value\": \"" + serverVal + "\"" +
                "        }," +
                "        {" +
                "            \"name\": \"./iom-offer-repository/src/main/resources/Setup.xml\"," +
                "            \"file\": \"loadScript\"" +
                "        }" +
                "    ]" +
                "}";

        MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
        entityBuilder.addBinaryBody(
                "loadScript",
                new FileInputStream(offerLoadFile),
                ContentType.APPLICATION_OCTET_STREAM,
                new File(offerLoadFile).getName()
        );
        entityBuilder.addTextBody("json", json, ContentType.TEXT_PLAIN);
        entityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        HttpEntity multipartEntity = entityBuilder.build();
        buildPost.setEntity(multipartEntity);
        buildPost.setHeader(crumbRequestField, crumb);
        HttpResponse triggerBuildResp = httpClient.execute(buildPost);
        int statusCode = triggerBuildResp.getStatusLine().getStatusCode();
        int newJobNumber = oldJobNumber + 1;
        if (statusCode == 201) {
            System.out.println("Jenkins job " + newJobNumber + " created successfully");
            while (getJenkinsJobNumber(jenkinsRssUrl) == oldJobNumber) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
            if (getJobBuildStatus(jenkinsRssUrl).equalsIgnoreCase("stable")) {
                System.out.println("Jenkins job " + getJenkinsJobNumber(jenkinsRssUrl) + " completed - STABLE");
            } else if (getJobBuildStatus(jenkinsRssUrl).equalsIgnoreCase("broken")) {
                System.out.println("Jenkins job " + getJenkinsJobNumber(jenkinsRssUrl) + " completed - BROKEN");
            }

            File xmlHolder = new File(xmlHolderLocation);
            xmlHolder.delete();
        } else {
            System.out.println("Failed to create Jenkins job\n Status Code: " + statusCode);
        }
    }

    public static void waitForRunningJenkinsJob(String jenkinsRssUrl) {
        String jenkinsApiXmlUrl = jenkinsRssUrl.replace("rssAll", "api/xml");
        if (getRunningJobNumber(jenkinsApiXmlUrl) != getJenkinsJobNumber(jenkinsRssUrl)) {
            System.out.println("Jenkins job " + getRunningJobNumber(jenkinsApiXmlUrl) + " is already running");
            System.out.println("Waiting for Jenkins job " + getRunningJobNumber(jenkinsApiXmlUrl) + " to be completed");
            while (getRunningJobNumber(jenkinsApiXmlUrl) != getJenkinsJobNumber(jenkinsRssUrl)) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
            if (getJobBuildStatus(jenkinsRssUrl).equalsIgnoreCase("stable")) {
                System.out.println("Jenkins job " + getJenkinsJobNumber(jenkinsRssUrl) + " completed - STABLE");
            } else if (getJobBuildStatus(jenkinsRssUrl).equalsIgnoreCase("broken")) {
                System.out.println("Jenkins job " + getJenkinsJobNumber(jenkinsRssUrl) + " completed - BROKEN");
            }
        }
    }

    public static int getJenkinsJobNumber(String jenkinsRssUrl) {
        int jobNumber = 0;
        try {
            URL url = new URL(jenkinsRssUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            String xmlContent = "";
            while (line != null) {
                xmlContent = xmlContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            FileWriter writer = new FileWriter(xmlHolderLocation, false);
            writer.write(xmlContent);
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }
        try (InputStream inputStream = new FileInputStream(xmlHolderLocation)) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document xmlDoc = documentBuilder.parse(inputStream);
            NodeList listOfLinks = xmlDoc.getElementsByTagName("link");
            Node mostRecentLink = listOfLinks.item(1);
            Element link = (Element) mostRecentLink;
            String jobNumberString = link.getAttribute("href").replaceAll("\\D+", "");
            try {
                jobNumber = Integer.parseInt(jobNumberString);
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return jobNumber;
    }

    public static int getRunningJobNumber(String jenkinsApiXmlUrl) {
        int jobNumber = 0;
        try {
            URL url = new URL(jenkinsApiXmlUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            String xmlContent = "";
            while (line != null) {
                xmlContent = xmlContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            FileWriter writer = new FileWriter(xmlHolderLocation, false);
            writer.write(xmlContent);
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }
        try (InputStream inputStream = new FileInputStream(xmlHolderLocation)) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document xmlDoc = documentBuilder.parse(inputStream);
            NodeList listOfTitles = xmlDoc.getElementsByTagName("number");
            Node mostRecentTitle = listOfTitles.item(0);
            String jobNumberString = mostRecentTitle.getTextContent().replaceAll("\\D+", "");
            try {
                jobNumber = Integer.parseInt(jobNumberString);
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return jobNumber;
    }

    public static String getJobBuildStatus(String jenkinsRssUrl) {
        String status = "broken";
        try {
            URL url = new URL(jenkinsRssUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            String xmlContent = "";
            while (line != null) {
                xmlContent = xmlContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            FileWriter writer = new FileWriter(xmlHolderLocation, false);
            writer.write(xmlContent);
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }
        try (InputStream inputStream = new FileInputStream(xmlHolderLocation)) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document xmlDoc = documentBuilder.parse(inputStream);
            NodeList listOfTitles = xmlDoc.getElementsByTagName("title");
            Node mostRecentTitle = listOfTitles.item(1);
            String jobNumberString = mostRecentTitle.getTextContent();
            if (jobNumberString.contains("stable") || jobNumberString.contains("back to normal")) {
                status = "stable";
            }
        } catch (Exception e) {
        }
        return status;
    }
}
