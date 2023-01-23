package gm.dataviewer.model;

public enum ModelEndPoints {

    GETVALIDDEAL_ENDPOINT {
        public String toString() {
            return "/json/getValidDeal.json";
        }
    },

    GETVALIDDEALPERM_ENDPOINT {
        public String toString() {
            return "/json/getValidDealPermutations.json";
        }
    },

    GETVALIDDEALMULTIPLE_ENDPOINT {
        public String toString() {
            return "/json/getValidMultipleVehicleIncentive.json";
        }
    },
    GETVALIDDEALOFFER_ENDPOINT {
        public String toString() {
            return "/json/getValidOffer.json";
        }
    },
    GETPROGRAMSEARCHDETAILS_ENDPOINT {
        public String toString() {
            return "/json/getIncentiveProgramDetails.json";
        }
    }
}
