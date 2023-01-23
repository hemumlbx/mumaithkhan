package infranova.main.helpers;

import net.thucydides.core.util.SystemEnvironmentVariables;

public class RemoteUtils {
    public static boolean isRunningRemotely() {
        String driver = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.remote.driver");
        return driver != null;
    }
}
