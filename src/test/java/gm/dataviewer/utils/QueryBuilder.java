package gm.dataviewer.utils;

public class QueryBuilder {
    public static String getQueryForIncentiveDesc(String language, String division, String year, String model, String category, String categoryType) {
        if (language.equalsIgnoreCase("English")) {
            return String.format("SELECT IncentiveDesc FROM Descriptors " +
                    "WHERE Division = '%s' AND YEAR = '%s' AND BRAND = '%s' AND ATTRIBUTE = '%s' AND CODE = '%s' AND LangUID = '1';", division, year, model, category, categoryType);
        } else {
            return String.format("SELECT IncentiveDesc FROM Descriptors " +
                    "WHERE Division = '%s' AND YEAR = '%s' AND BRAND = '%s' AND ATTRIBUTE = '%s' AND CODE = '%s' AND LangUID = '2';", division, year, model, category, categoryType);
        }
    }

    public static String getQueryForOfferDesc(String language, String division, String year, String model, String category, String categoryType) {
        if (language.equalsIgnoreCase("English")) {
            return String.format("SELECT OfferDesc FROM Descriptors " +
                    "WHERE Division = '%s' AND YEAR = '%s' AND BRAND = '%s' AND ATTRIBUTE = '%s' AND CODE = '%s' AND LangUID = '1';", division, year, model, category, categoryType);
        } else {
            return String.format("SELECT OfferDesc FROM Descriptors " +
                    "WHERE Division = '%s' AND YEAR = '%s' AND BRAND = '%s' AND ATTRIBUTE = '%s' AND CODE = '%s' AND LangUID = '2';", division, year, model, category, categoryType);
        }
    }

    public static String getQueryForChromeDesc(String language, String division, String year, String model, String category, String categoryType) {
        if (language.equalsIgnoreCase("English")) {
            return String.format("SELECT ChromeDesc FROM Descriptors " +
                    "WHERE Division = '%s' AND YEAR = '%s' AND BRAND = '%s' AND ATTRIBUTE = '%s' AND CODE = '%s' AND LangUID = '1';", division, year, model, category, categoryType);
        } else {
            return String.format("SELECT ChromeDesc FROM Descriptors " +
                    "WHERE Division = '%s' AND YEAR = '%s' AND BRAND = '%s' AND ATTRIBUTE = '%s' AND CODE = '%s' AND LangUID = '2';", division, year, model, category, categoryType);
        }
    }
}
