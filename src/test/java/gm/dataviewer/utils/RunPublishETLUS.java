package gm.dataviewer.utils;

public class RunPublishETLUS {

    public static void main(String[] args) throws Exception {
        String sshUrl = FilePaths.SSH_URL_US;

        System.out.println("Running Data Viewer Publish ETL - US");
        SSHConnection ssh = new SSHConnection();
        SSHConnection.connectSSHWithRsaKey(FilePaths.RSA, "kettle", sshUrl, ssh);
        ssh.executeCommand("cd dataviewer-etl && ./publish.sh");
        ssh.closeSession();
        System.out.println("Finished Data Viewer Publish ETL - US");
    }
}
