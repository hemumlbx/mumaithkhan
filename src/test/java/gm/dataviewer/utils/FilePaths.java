package gm.dataviewer.utils;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class FilePaths {
    final static EnvironmentSpecificConfiguration environmentVariables = EnvironmentSpecificConfiguration.from(SystemEnvironmentVariables.createEnvironmentVariables());

    public final static String REMOTE_DATA_PATH = environmentVariables.getProperty("filepaths.dataRemotePath");
    public final static String SSH_URL_CA = environmentVariables.getProperty("etl.box.ssh.ca.host");
    public final static String SSH_URL_US = environmentVariables.getProperty("etl.box.ssh.us.host");
    public final static String RSA = environmentVariables.getProperty("filepaths.rsa");
    public final static String DATAVIEWER_STAGING_ZIP_US = environmentVariables.getProperty("filepaths.staging.us");
    public final static String DATAVIEWER_STAGING_ZIP_CA = environmentVariables.getProperty("filepaths.staging.ca");
    public final static String DATAVIEWER_STAGING_FOLDER_US = environmentVariables.getProperty("filepaths.staging.folder.us");
    public final static String DATAVIEWER_STAGING_FOLDER_CA = environmentVariables.getProperty("filepaths.staging.folder.ca");
}
