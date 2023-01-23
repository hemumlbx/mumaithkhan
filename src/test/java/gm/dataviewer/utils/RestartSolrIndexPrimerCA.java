package gm.dataviewer.utils;

public class RestartSolrIndexPrimerCA {

    public static void main(String[] args) throws Exception {
        String sshUrl = FilePaths.SSH_URL_CA;

        System.out.println("Restarting Solr Index Primer - CA");
        SSHConnection ssh = new SSHConnection();
        SSHConnection.connectSSHWithRsaKey(FilePaths.RSA, "kettle", sshUrl, ssh);
        ssh.executeCommand("cd solr-index-primer-etl && sudo service solr-index-synchronizer restart");
        ssh.closeSession();
        System.out.println("Restarted Solr Index Primer - CA");
    }
}
