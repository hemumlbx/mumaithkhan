package gm.dataviewer.utils;

public class GVDPermutationRequestInformation {
    private String requestFVD;
    private String requestGVD;
    private String programID;
    private String programGVD;
    private String programFVD;
    private String incentiveValue;
    private String header;

    private String programReturned;
    public GVDPermutationRequestInformation(String requestFVD, String requestGVD, String programID, String programGVD, String programFVD,
                                            String incentiveValue, String programReturned) {
        this.requestFVD = requestFVD;
        this.requestGVD = requestGVD;
        this.programID = programID;
        this.programGVD = programGVD;
        this.programFVD = programFVD;
        this.incentiveValue = incentiveValue;
        this.programReturned = programReturned;
    }

    public GVDPermutationRequestInformation(String requestFVD, String requestGVD, String programID, String programGVD, String programFVD,
                                            String incentiveValue, String programReturned, String header) {
        this.requestFVD = requestFVD;
        this.requestGVD = requestGVD;
        this.programID = programID;
        this.programGVD = programGVD;
        this.programFVD = programFVD;
        this.incentiveValue = incentiveValue;
        this.programReturned = programReturned;
        this.header = header;
    }

    public String getIncentiveValue() {
        return incentiveValue;
    }

    public void setIncentiveValue(String incentiveValue) {
        this.incentiveValue = incentiveValue;
    }

    public String getProgramFVD() {
        return programFVD;
    }

    public void setProgramFVD(String programFVD) {
        this.programFVD = programFVD;
    }

    public String getProgramReturned() {
        return programReturned;
    }

    public void setProgramReturned(String programReturned) {
        this.programReturned = programReturned;
    }

    public String getProgramGVD() {
        return programGVD;
    }

    public void setProgramGVD(String programGVD) {
        this.programGVD = programGVD;
    }

    public String getRequestFVD() {
        return requestFVD;
    }

    public void setRequestFVD(String requestFVD) {
        this.requestFVD = requestFVD;
    }

    public String getRequestGVD() {
        return requestGVD;
    }

    public void setRequestGVD(String requestGVD) {
        this.requestGVD = requestGVD;
    }

    public String getProgramID() {
        return programID;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getHeader() { return header; }

    public void setHeader(String header) { this.header = header; }
}
