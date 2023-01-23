package gm.dataviewer.model;

import java.util.*;

public class BuildRequestObject {

    public Map<String, Object> requestProgramDetails(String countryName, String language, String programID, Integer revisionNo) {

        Map<String, Object> localizationObj = new HashMap<>();
        localizationObj.put("isoCountryCode", countryName);
        localizationObj.put("isoLanguageCode", language);

        Map<String, Object> headerObj = new HashMap<>();
        headerObj.put("localization", localizationObj);

        Map<String, Object> requestTag = new HashMap<>();
        requestTag.put("programID", programID);
        requestTag.put("programRevisionNumber", revisionNo);

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("requestHeader", headerObj);
        jsonAsMap.put("requestTags", requestTag);

        return jsonAsMap;
    }

    public Map<String, Object> createJsonRequestBuilderSearchList(String countryName, String language, String vehicleValue, String geograpgyValue, String audience, String consumerVisibility,
                                                                  String displayRegion, String recipient, String programType, String purchaseType,
                                                                  String deliveryType, String inventoryStatus, String orderType, String financialProvider,
                                                                  String tieredRateList, String modelYears, String customerType, String conquestVehicleList,
                                                                  String loyaltyVehicleList) {

        // Create object for localizationObj
        Map<String, Object> headerObj = new HashMap<>();
        Map<String, Object> localizationObj = new HashMap<>();
        headerObj.put("localization", localizationObj);
        localizationObj.put("isoCountryCode", countryName);
        localizationObj.put("isoLanguageCode", language);

        // Create object for filterSelectionListObj
        List<Map<String, Object>> filterSelectionListObjList = new ArrayList<>();

        String[] delTypeStr = deliveryType.split(",");
        for (String delTyp : delTypeStr) {
            Map<String, Object> deliveryTypeObj = new HashMap<>();
            deliveryTypeObj.put("filterSelectionType", "Delivery type");
            deliveryTypeObj.put("filterSelectionValue", delTyp);
            filterSelectionListObjList.add(deliveryTypeObj);
        }

        String[] invStaStr = inventoryStatus.split(",");
        for (String invSta : invStaStr) {
            Map<String, Object> invStatusObj = new HashMap<>();
            invStatusObj.put("filterSelectionType", "Inventory Status");
            invStatusObj.put("filterSelectionValue", invSta);
            filterSelectionListObjList.add(invStatusObj);
        }

        String[] orderTypeStr = orderType.split(",");
        for (String orderTyp : orderTypeStr) {
            Map<String, Object> orderTypeObj = new HashMap<>();
            orderTypeObj.put("filterSelectionType", "Order Type");
            orderTypeObj.put("filterSelectionValue", orderTyp);
            filterSelectionListObjList.add(orderTypeObj);
        }

        String[] purcTypeStr = purchaseType.split(",");
        for (String purcTyp : purcTypeStr) {
            Map<String, Object> purchaseTypeObj = new HashMap<>();
            purchaseTypeObj.put("filterSelectionType", "Purchase Type");
            purchaseTypeObj.put("filterSelectionValue", purcTyp);
            filterSelectionListObjList.add(purchaseTypeObj);
        }

        String[] finProvStr = financialProvider.split(",");
        for (String finProv : finProvStr) {
            Map<String, Object> finProviderObj = new HashMap<>();
            finProviderObj.put("filterSelectionType", "Financial provider");
            finProviderObj.put("filterSelectionValue", finProv);
            filterSelectionListObjList.add(finProviderObj);
        }

        String[] recpStr = recipient.split(",");
        for (String recp : recpStr) {
            Map<String, Object> payeeObj = new HashMap<>();
            payeeObj.put("filterSelectionType", "Payee");
            payeeObj.put("filterSelectionValue", recp);
            filterSelectionListObjList.add(payeeObj);
        }

        String[] custTypeStr = customerType.split(",");
        for (String custTyp : custTypeStr) {
            Map<String, Object> custTypeObj = new HashMap<>();
            custTypeObj.put("filterSelectionType", "Customer Type");
            custTypeObj.put("filterSelectionValue", custTyp);
            filterSelectionListObjList.add(custTypeObj);
        }

        String[] disRegStr = displayRegion.split(",");
        for (String disReg : disRegStr) {
            Map<String, Object> dispRegionObj = new HashMap<>();
            dispRegionObj.put("filterSelectionType", "Display Region");
            dispRegionObj.put("filterSelectionValue", disReg);
            filterSelectionListObjList.add(dispRegionObj);
        }

        String[] audiStr = audience.split(",");
        for (String audi : audiStr) {
            Map<String, Object> intAudNameObj = new HashMap<>();
            intAudNameObj.put("filterSelectionType", "Intended Audience Name");
            intAudNameObj.put("filterSelectionValue", audi);
            filterSelectionListObjList.add(intAudNameObj);
        }


        String[] conVisStr = consumerVisibility.split(",");
        for (String conVis : conVisStr) {
            Map<String, Object> conVisObj = new HashMap<>();
            conVisObj.put("filterSelectionType", "Consumer Visibility");
            conVisObj.put("filterSelectionValue", conVis);
            filterSelectionListObjList.add(conVisObj);
        }

        String[] proTypeStr = programType.split(",");
        for (String proTyp : proTypeStr) {
            Map<String, Object> proTypObj = new HashMap<>();
            proTypObj.put("filterSelectionType", "Program Type");
            proTypObj.put("filterSelectionValue", proTyp);
            filterSelectionListObjList.add(proTypObj);
        }

        String[] modYearStr = modelYears.split(",");
        for (String modYear : modYearStr) {
            Map<String, Object> modYearObj = new HashMap<>();
            modYearObj.put("filterSelectionType", "Model Years");
            modYearObj.put("filterSelectionValue", modYear);
            filterSelectionListObjList.add(modYearObj);
        }

        String[] tierRateStr = tieredRateList.split(",");
        for (String tierRate : tierRateStr) {
            Map<String, Object> tierRateObj = new HashMap<>();
            tierRateObj.put("filterSelectionType", "Tiered Rate List");
            tierRateObj.put("filterSelectionValue", tierRate);
            filterSelectionListObjList.add(tierRateObj);
        }

        String[] conqVehStr = conquestVehicleList.split(",");
        for (String conqVeh : conqVehStr) {
            Map<String, Object> conqVehObj = new HashMap<>();
            conqVehObj.put("filterSelectionType", "Conquest Vehicle List");
            conqVehObj.put("filterSelectionValue", conqVeh);
            filterSelectionListObjList.add(conqVehObj);
        }

        String[] loyVehStr = loyaltyVehicleList.split(",");
        for (String loyVeh : loyVehStr) {
            Map<String, Object> loyVehObj = new HashMap<>();
            loyVehObj.put("filterSelectionType", "Loyalty Vehicle List");
            loyVehObj.put("filterSelectionValue", loyVeh);
            filterSelectionListObjList.add(loyVehObj);
        }

        List<Map<String, Object>> filterListObjList = new ArrayList<>();

        // Create object for filterDateListObj
        ProcessDates currentDate = new ProcessDates();
        List<Map<String, Object>> filterDateListObjList = new ArrayList<>();
        Map<String, Object> filterDateListObj = new HashMap<>();
        filterDateListObj.put("filterDateType", "DLVY");
        filterDateListObj.put("filterBeginDate", currentDate.getCurrentDate());
        filterDateListObj.put("filterEndDate", currentDate.getCurrentDate());
        filterDateListObjList.add(filterDateListObj);

        // Create object for filterFlexibleStringListObj
        Map<String, Object> filterFlexibleVehicleStringListObj = new HashMap<>();
        filterFlexibleVehicleStringListObj.put("filterStringType", "Vehicle");
        filterFlexibleVehicleStringListObj.put("filterStringValue", vehicleValue);

        Map<String, Object> filterFlexibleGeographyStringListObj = new HashMap<>();
        filterFlexibleGeographyStringListObj.put("filterStringType", "Geography");
        filterFlexibleGeographyStringListObj.put("filterStringValue", geograpgyValue);

        List<Map<String, Object>> filterFlexibleStringListObjList = new ArrayList<>();
        filterFlexibleStringListObjList.add(filterFlexibleVehicleStringListObj);
        filterFlexibleStringListObjList.add(filterFlexibleGeographyStringListObj);

        // Create object for tagsObj
        Map<String, Object> tagsObj = new HashMap<>();
        tagsObj.put("filterSelectionList", filterSelectionListObjList);
        tagsObj.put("filterList", filterListObjList);
        tagsObj.put("filterDateList", filterDateListObjList);
        tagsObj.put("filterFlexibleStringList", filterFlexibleStringListObjList);

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("requestHeader", headerObj);
        jsonAsMap.put("requestTags", tagsObj);

        return jsonAsMap;
    }
    public Map<String, Object> createJsonRequestBuilder(String startDate, String endDate, String countryName, String language, String vehicleValue, String geograpgyValue) {
        // Create object for localizationObj
        Map<String, Object> localizationObj = new HashMap<>();
        localizationObj.put("isoCountryCode", countryName);
        localizationObj.put("isoLanguageCode", language);

        // Create object for dealManagementObj
        Map<String, Object> dealManagementObj = new HashMap<>();
        dealManagementObj.put("topOfDealOnlyInd", true);
        dealManagementObj.put("alwaysStackableOnlyInd", false);
        dealManagementObj.put("bestDealOnlyInd", false);
        dealManagementObj.put("ignoreGeoConflictInd", true);
        dealManagementObj.put("calculateSamplePaymentInd", false);

        Map<String, Object> headerObj = new HashMap<>();
        headerObj.put("localization", localizationObj);
        headerObj.put("dealManagement", dealManagementObj);
        headerObj.put("returnIncentiveProgramTagsInd", false);

        // Create object for filterSelectionListObj
        List<Map<String, Object>> filterSelectionListObjList = new ArrayList<>();
        Map<String, Object> deliveryTypeObj = new HashMap<>();
        deliveryTypeObj.put("filterSelectionType", "Delivery type");
        deliveryTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(deliveryTypeObj);

        Map<String, Object> invStatusObj = new HashMap<>();
        invStatusObj.put("filterSelectionType", "Inventory Status");
        invStatusObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(invStatusObj);

        Map<String, Object> orderTypeObj = new HashMap<>();
        orderTypeObj.put("filterSelectionType", "Order Type");
        orderTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(orderTypeObj);

        Map<String, Object> dealerObj = new HashMap<>();
        dealerObj.put("filterSelectionType", "Dealer");
        dealerObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(dealerObj);

        Map<String, Object> purchaseTypeObj = new HashMap<>();
        purchaseTypeObj.put("filterSelectionType", "Purchase Type");
        purchaseTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(purchaseTypeObj);

        Map<String, Object> finProviderObj = new HashMap<>();
        finProviderObj.put("filterSelectionType", "Financial provider");
        finProviderObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(finProviderObj);

        Map<String, Object> payeeObj = new HashMap<>();
        payeeObj.put("filterSelectionType", "Payee");
        payeeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(payeeObj);

        Map<String, Object> custTypeObj = new HashMap<>();
        custTypeObj.put("filterSelectionType", "Customer Type");
        custTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(custTypeObj);

        Map<String, Object> dispRegionObj = new HashMap<>();
        dispRegionObj.put("filterSelectionType", "Display Region");
        dispRegionObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(dispRegionObj);

        Map<String, Object> intAudNameObj = new HashMap<>();
        intAudNameObj.put("filterSelectionType", "Intended Audience Name");
        intAudNameObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(intAudNameObj);

        Map<String, Object> timezoneObj = new HashMap<>();
        timezoneObj.put("filterSelectionType", "TimeZone");
        timezoneObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(timezoneObj);

        Map<String, Object> invLevelObj = new HashMap<>();
        invLevelObj.put("filterSelectionType", "Inventory Level");
        invLevelObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(invLevelObj);

        Map<String, Object> conVisObj = new HashMap<>();
        conVisObj.put("filterSelectionType", "Consumer Visibility");
        conVisObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(conVisObj);

        // Create object for filterListObj
        Map<String, Object> filterListObj = new HashMap<>();
        filterListObj.put("filterListType", "VIN");
        filterListObj.put("filterListValue", "All");
        List<Map<String, Object>> filterListObjList = new ArrayList<>();
        filterListObjList.add(filterListObj);

        // Create object for filterDateListObj
        Map<String, Object> filterDateListObj = new HashMap<>();
        filterDateListObj.put("filterDateType", "DLVY");
        filterDateListObj.put("filterBeginDate", startDate);
        filterDateListObj.put("filterEndDate", endDate);
        List<Map<String, Object>> filterDateListObjList = new ArrayList<>();
        filterDateListObjList.add(filterDateListObj);

        // generate loop if the size of the date is larger than 1

        // Create object for filterFlexibleStringListObj
        Map<String, Object> filterFlexibleVehicleStringListObj = new HashMap<>();
        filterFlexibleVehicleStringListObj.put("filterStringType", "Vehicle");
        filterFlexibleVehicleStringListObj.put("filterStringValue", vehicleValue);

        Map<String, Object> filterFlexibleGeographyStringListObj = new HashMap<>();
        filterFlexibleGeographyStringListObj.put("filterStringType", "Geography");
        filterFlexibleGeographyStringListObj.put("filterStringValue", geograpgyValue);

        List<Map<String, Object>> filterFlexibleStringListObjList = new ArrayList<>();
        filterFlexibleStringListObjList.add(filterFlexibleVehicleStringListObj);
        filterFlexibleStringListObjList.add(filterFlexibleGeographyStringListObj);

        // Create object for tagsObj
        Map<String, Object> tagsObj = new HashMap<>();
        tagsObj.put("filterSelectionList", filterSelectionListObjList);
        tagsObj.put("filterList", filterListObjList);
        tagsObj.put("filterDateList", filterDateListObjList);
        tagsObj.put("filterFlexibleStringList", filterFlexibleStringListObjList);

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("requestHeader", headerObj);
        jsonAsMap.put("requestTags", tagsObj);
        jsonAsMap.put("requestSamplePayment", null);

        return jsonAsMap;

    }
    public Map<String, Object> createJsonRequestMultipleVehicleBuilder(String startDate, String endDate, String countryName, String language, String vehicleValue, String geograpgyValue) {


        // Create object for localizationObj
        Map<String, Object> localizationObj = new HashMap<>();
        localizationObj.put("isoCountryCode", countryName);
        localizationObj.put("isoLanguageCode", language);

        // Create object for dealManagementObj
        Map<String, Object> dealManagementObj = new HashMap<>();
        dealManagementObj.put("alwaysStackableOnlyInd", false);
        dealManagementObj.put("bestDealOnlyInd", false);
        dealManagementObj.put("topOfDealOnlyInd", true);

        Map<String, Object> headerObj = new HashMap<>();
        headerObj.put("dealManagement", dealManagementObj);
        headerObj.put("localization", localizationObj);
        headerObj.put("returnIncentiveProgramTagsInd", false);

        // Create object for filterSelectionListObj
        List<Map<String, Object>> filterSelectionListObjList = new ArrayList<>();

        Map<String, Object> purchaseTypeObj = new HashMap<>();
        purchaseTypeObj.put("filterSelectionType", "Purchase Type");
        purchaseTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(purchaseTypeObj);

        Map<String, Object> finProviderObj = new HashMap<>();
        finProviderObj.put("filterSelectionType", "Financial provider");
        finProviderObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(finProviderObj);

        Map<String, Object> payeeObj = new HashMap<>();
        payeeObj.put("filterSelectionType", "Payee");
        payeeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(payeeObj);


        Map<String, Object> dispRegionObj = new HashMap<>();
        dispRegionObj.put("filterSelectionType", "Display Region");
        dispRegionObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(dispRegionObj);

        Map<String, Object> conVisObj = new HashMap<>();
        conVisObj.put("filterSelectionType", "Consumer Visibility");
        conVisObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(conVisObj);

        Map<String, Object> intAudNameObj = new HashMap<>();
        intAudNameObj.put("filterSelectionType", "Intended Audience Name");
        intAudNameObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(intAudNameObj);

        // Create object for filterDateListObj
        Map<String, Object> filterDateListObj = new HashMap<>();
        filterDateListObj.put("filterBeginDate", startDate);
        filterDateListObj.put("filterDateType", "DLVY");
        filterDateListObj.put("filterEndDate", endDate);
        List<Map<String, Object>> filterDateListObjList = new ArrayList<>();
        filterDateListObjList.add(filterDateListObj);


        Map<String, Object> filterFlexibleGeographyStringListObj = new HashMap<>();
        filterFlexibleGeographyStringListObj.put("filterStringType", "Geography");
        filterFlexibleGeographyStringListObj.put("filterStringValue", geograpgyValue);

        // Create object for filterFlexibleStringListObj
        Map<String, Object> filterFlexibleVehicleStringListObj = new HashMap<>();
        filterFlexibleVehicleStringListObj.put("filterStringType", "Vehicle");
        filterFlexibleVehicleStringListObj.put("filterStringValue", vehicleValue);

        List<Map<String, Object>> filterFlexibleStringListObjList = new ArrayList<>();
        filterFlexibleStringListObjList.add(filterFlexibleVehicleStringListObj);
        filterFlexibleStringListObjList.add(filterFlexibleGeographyStringListObj);

        // Create object for tagsObj
        Map<String, Object> tagsObj = new HashMap<>();
        tagsObj.put("filterDateList", filterDateListObjList);
        tagsObj.put("filterFlexibleStringList", filterFlexibleStringListObjList);
        tagsObj.put("filterNumericList", null);
        tagsObj.put("filterSelectionList", filterSelectionListObjList);

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("requestTags", tagsObj);
        jsonAsMap.put("requestHeader", headerObj);

        return jsonAsMap;
    }

    public Map<String, Object> createJsonRequestPermutationBuilder(String startDate, String endDate, String countryName, String language, String vehicleValue, String geograpgyValue) {


        // Create object for localizationObj
        Map<String, Object> localizationObj = new HashMap<>();
        localizationObj.put("isoCountryCode", countryName);
        localizationObj.put("isoLanguageCode", language);

        // Create object for dealManagementObj
        Map<String, Object> dealManagementObj = new HashMap<>();
        dealManagementObj.put("topOfDealOnlyInd", true);
        dealManagementObj.put("alwaysStackableOnlyInd", false);
        dealManagementObj.put("bestDealOnlyInd", false);
        dealManagementObj.put("ignoreGeoConflictInd", true);

        Map<String, Object> headerObj = new HashMap<>();
        headerObj.put("localization", localizationObj);
        headerObj.put("dealManagement", dealManagementObj);
        headerObj.put("returnIncentiveProgramTagsInd", false);

        // Create object for filterSelectionListObj
        List<Map<String, Object>> filterSelectionListObjList = new ArrayList<>();

        Map<String, Object> orderTypeObj = new HashMap<>();
        orderTypeObj.put("filterSelectionType", "Order Type");
        orderTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(orderTypeObj);

        Map<String, Object> dealerObj = new HashMap<>();
        dealerObj.put("filterSelectionType", "Dealer");
        dealerObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(dealerObj);

        Map<String, Object> purchaseTypeObj = new HashMap<>();
        purchaseTypeObj.put("filterSelectionType", "Purchase Type");
        purchaseTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(purchaseTypeObj);

        Map<String, Object> finProviderObj = new HashMap<>();
        finProviderObj.put("filterSelectionType", "Financial provider");
        finProviderObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(finProviderObj);

        Map<String, Object> payeeObj = new HashMap<>();
        payeeObj.put("filterSelectionType", "Payee");
        payeeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(payeeObj);

        Map<String, Object> custTypeObj = new HashMap<>();
        custTypeObj.put("filterSelectionType", "Customer Type");
        custTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(custTypeObj);

        Map<String, Object> dispRegionObj = new HashMap<>();
        dispRegionObj.put("filterSelectionType", "Display Region");
        dispRegionObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(dispRegionObj);

        Map<String, Object> intAudNameObj = new HashMap<>();
        intAudNameObj.put("filterSelectionType", "Intended Audience Name");
        intAudNameObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(intAudNameObj);

        Map<String, Object> conVisObj = new HashMap<>();
        conVisObj.put("filterSelectionType", "Consumer Visibility");
        conVisObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(conVisObj);

        // Create object for filterDateListObj
        Map<String, Object> filterDateListObj = new HashMap<>();
        filterDateListObj.put("filterDateType", "DLVY");
        filterDateListObj.put("filterBeginDate", startDate);
        filterDateListObj.put("filterEndDate", endDate);
        List<Map<String, Object>> filterDateListObjList = new ArrayList<>();
        filterDateListObjList.add(filterDateListObj);

        // generate loop if the size of the date is larger than 1
        Map<String, Object> filterFlexibleVehicleStringListObj = new HashMap<>();
        filterFlexibleVehicleStringListObj.put("filterStringType", "Vehicle");
        filterFlexibleVehicleStringListObj.put("filterStringValue", vehicleValue);

        Map<String, Object> filterFlexibleGeographyStringListObj = new HashMap<>();
        filterFlexibleGeographyStringListObj.put("filterStringType", "Geography");
        filterFlexibleGeographyStringListObj.put("filterStringValue", geograpgyValue);

        List<Map<String, Object>> filterFlexibleStringListObjList = new ArrayList<>();
        filterFlexibleStringListObjList.add(filterFlexibleVehicleStringListObj);
        filterFlexibleStringListObjList.add(filterFlexibleGeographyStringListObj);

        // Create object for tagsObj
        Map<String, Object> tagsObj = new HashMap<>();
        tagsObj.put("filterSelectionList", filterSelectionListObjList);
        tagsObj.put("filterDateList", filterDateListObjList);
        tagsObj.put("filterFlexibleStringList", filterFlexibleStringListObjList);

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("requestHeader", headerObj);
        jsonAsMap.put("requestTags", tagsObj);
        jsonAsMap.put("requestSamplePayment", null);

        return jsonAsMap;
    }

    public Map<String, Object> createJsonRequestGVOBuilder(String startDate, String endDate, String countryName, String language, String vehicleValue, String geograpgyValue) {
        // Create object for localizationObj
        Map<String, Object> localizationObj = new HashMap<>();
        localizationObj.put("isoCountryCode", countryName);
        localizationObj.put("isoLanguageCode", language);

        List<String> offerTypeListObj = new ArrayList<>();
        offerTypeListObj.add("PRC");

        Map<String, Object> listManagementObj = new HashMap<>();
        listManagementObj.put("multipleResultRule", "return all");
        listManagementObj.put("returnAllMaximumRecords", 97);
        listManagementObj.put("listManagementRule", "No sort");

        Map<String, Object> headerObj = new HashMap<>();
        headerObj.put("offerTypeList", offerTypeListObj);
        headerObj.put("localization", localizationObj);
        headerObj.put("listManagement", listManagementObj);
        headerObj.put("ignoreGeoConflictInd", true);
        headerObj.put("returnTagsInd", false);
        headerObj.put("returnPayloadInd", false);
        headerObj.put("returnParsedDetailInd", false);
        headerObj.put("viewVehicleLevel", "CONTAINS");

        // Create object for filterSelectionListObj
        List<Map<String, Object>> filterSelectionListObjList = new ArrayList<>();
        Map<String, Object> deliveryTypeObj = new HashMap<>();
        deliveryTypeObj.put("filterSelectionType", "Delivery type");
        deliveryTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(deliveryTypeObj);

        Map<String, Object> invStatusObj = new HashMap<>();
        invStatusObj.put("filterSelectionType", "Inventory Status");
        invStatusObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(invStatusObj);

        Map<String, Object> orderTypeObj = new HashMap<>();
        orderTypeObj.put("filterSelectionType", "Order Type");
        orderTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(orderTypeObj);

        Map<String, Object> dealerObj = new HashMap<>();
        dealerObj.put("filterSelectionType", "Dealer");
        dealerObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(dealerObj);

        Map<String, Object> purchaseTypeObj = new HashMap<>();
        purchaseTypeObj.put("filterSelectionType", "Purchase Type");
        purchaseTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(purchaseTypeObj);

        Map<String, Object> finProviderObj = new HashMap<>();
        finProviderObj.put("filterSelectionType", "Financial provider");
        finProviderObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(finProviderObj);

        Map<String, Object> payeeObj = new HashMap<>();
        payeeObj.put("filterSelectionType", "Payee");
        payeeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(payeeObj);

        Map<String, Object> custTypeObj = new HashMap<>();
        custTypeObj.put("filterSelectionType", "Customer Type");
        custTypeObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(custTypeObj);

        Map<String, Object> dispRegionObj = new HashMap<>();
        dispRegionObj.put("filterSelectionType", "Display Region");
        dispRegionObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(dispRegionObj);

        Map<String, Object> intAudNameObj = new HashMap<>();
        intAudNameObj.put("filterSelectionType", "Intended Audience Name");
        intAudNameObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(intAudNameObj);

        Map<String, Object> timezoneObj = new HashMap<>();
        timezoneObj.put("filterSelectionType", "TimeZone");
        timezoneObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(timezoneObj);

        Map<String, Object> invLevelObj = new HashMap<>();
        invLevelObj.put("filterSelectionType", "Inventory Level");
        invLevelObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(invLevelObj);

        Map<String, Object> conVisObj = new HashMap<>();
        conVisObj.put("filterSelectionType", "Consumer Visibility");
        conVisObj.put("filterSelectionValue", "All");
        filterSelectionListObjList.add(conVisObj);

        // Create object for filterListObj
        Map<String, Object> filterListObj = new HashMap<>();
        filterListObj.put("filterListType", "Promotion");
        filterListObj.put("filterListValue", "All");
        List<Map<String, Object>> filterListObjList = new ArrayList<>();
        filterListObjList.add(filterListObj);

        // Create object for filterDateListObj
        Map<String, Object> filterDateListObj = new HashMap<>();
        filterDateListObj.put("filterDateType", "EFF");
        filterDateListObj.put("filterBeginDate", startDate);
        filterDateListObj.put("filterEndDate", endDate);
        List<Map<String, Object>> filterDateListObjList = new ArrayList<>();
        filterDateListObjList.add(filterDateListObj);

        // generate loop if the size of the date is larger than 1

        // Create object for filterFlexibleStringListObj
        Map<String, Object> filterFlexibleVehicleStringListObj = new HashMap<>();
        filterFlexibleVehicleStringListObj.put("filterStringType", "Vehicle");
        filterFlexibleVehicleStringListObj.put("filterStringValue", vehicleValue);

        Map<String, Object> filterFlexibleGeographyStringListObj = new HashMap<>();
        filterFlexibleGeographyStringListObj.put("filterStringType", "Geography");
        filterFlexibleGeographyStringListObj.put("filterStringValue", geograpgyValue);

        List<Map<String, Object>> filterFlexibleStringListObjList = new ArrayList<>();
        filterFlexibleStringListObjList.add(filterFlexibleVehicleStringListObj);
        filterFlexibleStringListObjList.add(filterFlexibleGeographyStringListObj);

        // Create object for tagsObj
        Map<String, Object> tagsObj = new HashMap<>();
        tagsObj.put("filterSelectionList", filterSelectionListObjList);
        tagsObj.put("filterNumericList", null);
        tagsObj.put("filterList", filterListObjList);
        tagsObj.put("filterDateList", filterDateListObjList);
        tagsObj.put("filterFlexibleStringList", filterFlexibleStringListObjList);

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("requestHeader", headerObj);
        jsonAsMap.put("requestTags", tagsObj);

        return jsonAsMap;

    }
}