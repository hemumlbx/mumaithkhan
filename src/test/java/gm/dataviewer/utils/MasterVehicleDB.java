package gm.dataviewer.utils;

import net.thucydides.core.annotations.Step;

import java.sql.SQLException;
import java.util.List;

public class MasterVehicleDB {

    @Step("Get build query for values from master vehicle incentive description database")
    public List getMasterVehicleIncentiveDescription(String countryName, String language, String division, String year, String model, String category, String categoryType) {
        List incentiveDescription = null;

        QueryBuilder queryBuilder = new QueryBuilder();
        DatabaseUtility dbUtil = new DatabaseUtility();
        try {
            DatabaseConnection dbConnect = dbUtil.getValidDbServer(countryName);
            if (dbConnect.getConnection()) {
                incentiveDescription = dbConnect.executeQueryForIncentiveDesc(QueryBuilder.getQueryForIncentiveDesc(language, division, year, model, category, categoryType));
            }
            dbConnect.closeConnection();
            return incentiveDescription;
        } catch (ClassNotFoundException classEx) {
            classEx.printStackTrace();
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return incentiveDescription;
    }

    @Step("Get build query for values from master vehicle offer description database")
    public List getMasterVehicleOfferDescription(String countryName, String language, String division, String year, String model, String category, String categoryType) {
        List offerDescription = null;

        QueryBuilder queryBuilder = new QueryBuilder();
        DatabaseUtility dbUtil = new DatabaseUtility();
        try {
            DatabaseConnection dbConnect = dbUtil.getValidDbServer(countryName);
            if (dbConnect.getConnection()) {
                offerDescription = dbConnect.executeQueryForIncentiveDesc(QueryBuilder.getQueryForOfferDesc(language, division, year, model, category, categoryType));
            }
            dbConnect.closeConnection();
            return offerDescription;
        } catch (ClassNotFoundException classEx) {
            classEx.printStackTrace();
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return offerDescription;
    }
    @Step("Get build query for values from master vehicle chrome description database")
    public List getMasterVehicleChromeDescription(String countryName, String language, String division, String year, String model, String category, String categoryType) {
        List chromeDescription = null;

        QueryBuilder queryBuilder = new QueryBuilder();
        DatabaseUtility dbUtil = new DatabaseUtility();
        try {
            DatabaseConnection dbConnect = dbUtil.getValidDbServer(countryName);
            if (dbConnect.getConnection()) {
                chromeDescription = dbConnect.executeQueryForIncentiveDesc(QueryBuilder.getQueryForChromeDesc(language, division, year, model, category, categoryType));
            }
            dbConnect.closeConnection();
            return chromeDescription;
        } catch (ClassNotFoundException classEx) {
            classEx.printStackTrace();
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        return chromeDescription;
    }
}
