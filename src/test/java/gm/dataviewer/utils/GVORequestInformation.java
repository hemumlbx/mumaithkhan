package gm.dataviewer.utils;

public class GVORequestInformation {
    private String requestFVD;
    private String requestFGD;
    private String offerName;
    private String offerReturned;
    private String offerHeader;
    private String programName;

    public GVORequestInformation(String requestFVD, String requestFGD, String offerName, String offerReturned, String offerHeader, String programName) {
        this.requestFVD = requestFVD;
        this.requestFGD = requestFGD;
        this.offerName = offerName;
        this.offerReturned = offerReturned;
        this.offerHeader = offerHeader;
        this.programName = programName;
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

    public String getOfferName() {
        return offerName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramName() {
        return programName;
    }

    public String getOfferHeader() {
        return offerHeader;
    }

    public void setOfferHeader(String offerHeader) {
        this.offerHeader = offerHeader;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getProgramReturned() {
        return offerReturned;
    }

    public void setProgramReturned(String offerReturned) {
        this.offerReturned = offerReturned;
    }
}
