package gm.dataviewer.utils;

public class GVDRequestInformation {
    private String requestFVD;
    private String requestFGD;
    private String programID;
    private String programGVD;
    private String programFVD;
    private String incentiveFVD;
    private String incentiveValue;
    private String programReturned;
    private String header;


    public GVDRequestInformation(String requestFVD, String requestFGD, String programID, String programGVD, String programFVD, String incentiveFVD, String incentiveValue, String programReturned) {
        this.requestFVD = requestFVD;
        this.requestFGD = requestFGD;
        this.programID = programID;
        this.programGVD = programGVD;
        this.programFVD = programFVD;
        this.incentiveFVD = incentiveFVD;
        this.incentiveValue = incentiveValue;
        this.programReturned = programReturned;
    }

    public GVDRequestInformation(String requestFVD, String requestFGD, String programID, String programGVD, String programFVD, String incentiveFVD, String incentiveValue, String programReturned, String header) {
        this.requestFVD = requestFVD;
        this.requestFGD = requestFGD;
        this.programID = programID;
        this.programGVD = programGVD;
        this.programFVD = programFVD;
        this.incentiveFVD = incentiveFVD;
        this.incentiveValue = incentiveValue;
        this.programReturned = programReturned;
        this.header = header;
    }

    public String getRequestFVD() {
        return requestFVD;
    }

    public void setRequestFVD(String requestFVD) {
        this.requestFVD = requestFVD;
    }

    public String getRequestFGD() {
        return requestFGD;
    }

    public void setRequestFGD(String requestFGD) {
        this.requestFGD = requestFGD;
    }

    public String getProgramID() {
        return programID;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getProgramGVD() {
        return programGVD;
    }

    public void setProgramGVD(String programGVD) {
        this.programGVD = programGVD;
    }

    public String getIncentiveFVD() {
        return incentiveFVD;
    }

    public void setIncentiveFVD(String incentiveFVD) {
        this.incentiveFVD = incentiveFVD;
    }

    public String getIncentiveValue() {
        return incentiveValue;
    }

    public void setIncentiveValue(String incentiveValue) {
        this.incentiveValue = incentiveValue;
    }

    public String getProgramReturned() {
        return programReturned;
    }

    public void setProgramReturned(String programReturned) {
        this.programReturned = programReturned;
    }


    public String getProgramFVD() {
        return programFVD;
    }

    public void setProgramFVD(String programFVD) {
        this.programFVD = programFVD;
    }

    public void setHeader(String header) { this.header = header; }

    public String getHeader() { return header; }
}
