package gm.dataviewer.utils;

import org.json.JSONException;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DatabaseUtility {

    public ArrayList<String> getDataFromMasterVehicle(ResultSet resultSet) throws SQLException, JSONException {
        ArrayList<String> arrayList = new ArrayList<String>();
        while (resultSet.next()) {
            System.out.println("----------------" + resultSet);
            arrayList.add(resultSet.getString(1));
        }
        return arrayList;
    }

    public DatabaseConnection getValidDbServer(String countryName) {
        ConfigDb configDb = new ConfigDb();
        DatabaseConnection databaseConnection = null;
        if (countryName.equals("CA")) {
            databaseConnection = new DatabaseConnection(
                    configDb.getCaHost(),
                    configDb.getCaDBName(),
                    configDb.getCaUsername(),
                    configDb.getCaPassword()
            );
        } else if (countryName.equals("US")) {
            databaseConnection = new DatabaseConnection(
                    configDb.getUsHost(),
                    configDb.getUsDBName(),
                    configDb.getUsUsername(),
                    configDb.getUsPassword()
            );
        }
        return databaseConnection;
    }
}
