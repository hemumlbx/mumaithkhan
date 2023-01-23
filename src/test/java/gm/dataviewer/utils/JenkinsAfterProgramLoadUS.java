package gm.dataviewer.utils;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.io.IOException;

public class JenkinsAfterProgramLoadUS {
    private static final EnvironmentSpecificConfiguration environmentVariables = EnvironmentSpecificConfiguration.from(SystemEnvironmentVariables.createEnvironmentVariables());
    private static final String jenkinsCrumbUrl = environmentVariables.getProperty("jenkins.crumb.url");
    private static final String programLoadJenkinsUrl = environmentVariables.getProperty("jenkins.programLoad.url");
    private static final String serverVal = environmentVariables.getProperty("jenkins.server.us.value");
    private static final String programLoadJenkinsRssUrl = environmentVariables.getProperty("jenkins.programLoad.rss.url");
    private static final String programLoadFileAfterCA = environmentVariables.getProperty("filepaths.programLoadFile.afterProgramLoad.us");

    public static void main(String[] args) throws IOException {
        JenkinsHelpers.triggerProgramLoad(jenkinsCrumbUrl, programLoadJenkinsUrl, serverVal, programLoadFileAfterCA, programLoadJenkinsRssUrl);
    }
}
