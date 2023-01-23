package domain;

public class Tab {

    public enum SelectTab {

        SET_UP("Setup"),
        DATE_NUMERIC("Date-Numeric"),
        GEOGRAPHY("Geography"),
        DEALERS("Dealers"),
        MANAGED_LIST("Managed List"),
        ELIGIBLE_VALUES("Eligible Values"),
        VEHICLES("Vehicles"),
        STACKABILITY("Stackability"),
        TEN_POINT("10 Point"),
        REVIEW("Review");

        private String value;

        SelectTab(String value) {
            this.value = value;
        }

        public String selectTabValue() {
            return this.value;
        }
    }
}
