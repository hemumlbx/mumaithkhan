package gm.dataviewer.utils;

import com.jcraft.jsch.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SSHConnection {
    private JSch jsch;
    private Session session;

    public SSHConnection() {
    }

    public static SSHConnection connectSSHWithRsaKey(String keyFile, String username, String uri, SSHConnection connection) throws JSchException {
        connection.connectWithRSA(keyFile, username, uri);
        return connection;
    }

    private void connectWithRSA(String keyFile, String username, String uri) throws JSchException {
        this.jsch = new JSch();
        this.jsch.addIdentity(keyFile);
        this.session = this.jsch.getSession(username, uri);
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        this.session.setConfig(config);
        this.session.connect();
    }

    public void uploadFile(String localPath, String remotePath) throws JSchException, SftpException {
        ChannelSftp channelSftp = (ChannelSftp) this.session.openChannel("sftp");
        channelSftp.connect();
        channelSftp.put(localPath, remotePath);
        channelSftp.exit();
    }

    public boolean executeCommand(String command) throws IOException, JSchException {
        int exitStatus;
        Channel channel = session.openChannel("exec");
        ((ChannelExec) channel).setCommand(command);

        channel.setInputStream(null);

        ((ChannelExec) channel).setErrStream(System.err);

        InputStream in = channel.getInputStream();

        channel.connect();

        byte[] tmp = new byte[1024];
        while (true) {
            while (in.available() > 0) {
                int i = in.read(tmp, 0, 1024);
                if (i < 0) break;
                System.out.print(new String(tmp, 0, i));
            }
            if (channel.isClosed()) {
                if (in.available() > 0) continue;
                exitStatus = channel.getExitStatus();
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
        }
        channel.disconnect();
        return exitStatus == 0;
    }

    public void closeSession() {
        this.session.disconnect();
    }
}
