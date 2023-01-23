package gm.dataviewer.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RunStagingETLUS {

    public static void main(String[] args) throws Exception {
        String sshUrl = FilePaths.SSH_URL_US;
        String folder = FilePaths.DATAVIEWER_STAGING_FOLDER_US;
        String dataRemotePath = FilePaths.REMOTE_DATA_PATH;

        System.out.println("Running Data Viewer Staging ETL - US");
        SSHConnection ssh = new SSHConnection();
        SSHConnection.connectSSHWithRsaKey(FilePaths.RSA, "kettle", sshUrl, ssh);
        ssh.executeCommand("rm " + dataRemotePath + "/*");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String finalFilename = "gmiommvd_" + formatter.format(new Date()) + ".zip";
        createImportFileFromOriginal(folder, finalFilename);
        ssh.uploadFile(finalFilename, dataRemotePath);
//        ssh.executeCommand("cd dataviewer-etl && ./staging.sh");
        ssh.closeSession();
        System.out.println("Finished Data Viewer Staging ETL - CA");
    }

    private static void createImportFileFromOriginal(String folder, String finalFilename) {

        File originalFile = new File(folder + "/gmiommvd_Original.zip");
        boolean success = originalFile.renameTo(new File(finalFilename));
        if (success) {
            System.out.println("US File was successfully renamed");
        } else {
            System.out.println("US File was not successfully renamed");
        }
    }
}
