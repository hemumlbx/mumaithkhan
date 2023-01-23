package gm.dataviewer.tasks;

import java.time.Year;

public class GetPreviousAndCurrentYear {
    public static String getPreviousYear() {
        String lastYear = Year.now().minusYears(1).toString();
        return lastYear;
    }

    public static String getCurrentYear() {
        String currentYear = Year.now().toString();
        return currentYear;
    }
}
