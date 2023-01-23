package gm.dataviewer.dataTableTypes;

public class DataviewerDeltaBrandsList {
    String status;
    String newField;
    String original;

    public DataviewerDeltaBrandsList(String status, String newField, String original) {
        if (status == null) {
            throw new IllegalArgumentException("Status should not be null");
        }
        if (newField == null) {
            throw new IllegalArgumentException("newField should not be null");
        }
        if (original == null) {
            throw new IllegalArgumentException("Original should not be null");
        }

        this.status = status;
        this.newField = newField;
        this.original = original;
    }

    public String status() {
        return status;
    }

    public String newField() {
        return newField;
    }

    public String original() {
        return original;
    }
}


