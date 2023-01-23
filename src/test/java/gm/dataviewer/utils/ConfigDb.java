package gm.dataviewer.utils;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class ConfigDb {

    final static EnvironmentSpecificConfiguration environmentVariables = EnvironmentSpecificConfiguration.from(SystemEnvironmentVariables.createEnvironmentVariables());

    public String getUsHost() {
        return environmentVariables.getProperty("gm.iom.db.us.host");
    }

    public String getUsDBName() {
        return environmentVariables.getProperty("gm.iom.db.us.dbname");
    }

    public String getUsUsername() {
        return environmentVariables.getProperty("gm.iom.db.us.username");
    }

    public String getUsPassword() {
        return environmentVariables.getProperty("gm.iom.db.us.password");
    }

    public String getCaHost() {
        return environmentVariables.getProperty("gm.iom.db.ca.host");
    }

    public String getCaDBName() {
        return environmentVariables.getProperty("gm.iom.db.ca.dbname");
    }

    public String getCaUsername() {
        return environmentVariables.getProperty("gm.iom.db.ca.username");
    }

    public String getCaPassword() {
        return environmentVariables.getProperty("gm.iom.db.ca.password");
    }

}
