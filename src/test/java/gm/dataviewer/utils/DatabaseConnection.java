package gm.dataviewer.utils;

import org.json.JSONException;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnection {
    private Connection connection;
    private String host;
    private String dbname;
    private String username;
    private String password;

    public DatabaseConnection(String host, String dbname, String username, String password) {
        this.host = host;
        this.dbname = dbname;
        this.username = username;
        this.password = password;
    }

    public boolean getConnection() throws SQLException, ClassNotFoundException {
        if (host.isEmpty() || dbname.isEmpty() || username.isEmpty() || password.isEmpty()) {
            throw new SQLException("Missing database credentials");
        }
        Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection(this.host + this.dbname, this.username, this.password);
        return true;

    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public ArrayList executeQueryForIncentiveDesc(String sqlQuery) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            ArrayList incentiveDescriptions = new DatabaseUtility().getDataFromMasterVehicle(resultSet);

            resultSet.close();
            statement.close();

            return incentiveDescriptions;
        } catch (SQLException sql) {
            sql.printStackTrace();
        } catch (JSONException js) {
            js.printStackTrace();
        }
        return null;
    }
}

