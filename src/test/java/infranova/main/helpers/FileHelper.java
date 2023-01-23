package infranova.main.helpers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class FileHelper {
    public static String getDownloadPath() {
        return Paths.get(System.getProperty("user.home"), "Downloads").toString();
    }

    public static File getDownloadedFile(String fileName) {
        Path filePath = Paths.get(getDownloadPath(), fileName);
        return new File(filePath.toUri());
    }

    /**
     * Attempts to download the given file from the remote download host, this is needed since when executing remotely
     * the files are saved to the Selenium Node, and in order to validate them, we need to download them from there
     * see selenium/README.md for more information
     */
    public static void getDownloadedFileFromRemoteServer(String fileName) throws IOException, InterruptedException {
        int retries = 3;

        // Attempt to download the file up to 3 times (in case it has not finished downloading initially)
        String remoteDownloadHost = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("remoteDownloadHost");
        Response response = RestAssured.get(remoteDownloadHost + fileName);
        while (retries > 0 && (response == null || response.getStatusCode() != 200)) {
            TimeUnit.SECONDS.sleep(5);
            response = RestAssured.get(remoteDownloadHost + fileName);
            retries--;
        }

        // If successful response, save the file on the current system, otherwise do nothing (let test fail)
        if (response != null && response.getStatusCode() == 200) {
            InputStream inputStream = response.getBody().asInputStream();
            File outputFile = getDownloadedFile(fileName);
            // Create output file (ensuring directory exists)
            if (!outputFile.exists()) {
                if (!outputFile.getParentFile().exists() && !outputFile.getParentFile().mkdirs()) {
                    throw new IOException("Unable to create new directory " + outputFile.getParentFile().getPath());
                } else if (!outputFile.createNewFile()) {
                    throw new IOException("Unable to create new file " + outputFile.getPath());
                }
            }

            OutputStream outputStream = new FileOutputStream(outputFile);
            IOUtils.copy(inputStream, outputStream);
            outputStream.close();
            inputStream.close();
            TimeUnit.SECONDS.sleep(2);
            RestAssured.delete(remoteDownloadHost + fileName);
        }
    }

    public static boolean deleteDownloadedFile(String fileName) {
        return getDownloadedFile(fileName).delete();
    }
}
