package gm.dataviewer.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProcessDates {

    private String todayDate;

    public ProcessDates() {
    }

    public String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
        //return "2019-06-07";
    }

}
