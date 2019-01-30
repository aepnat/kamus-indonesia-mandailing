package com.saepul.kamus_indonesia_mandailing;

public class MyObject {

    public String objectName;

    public String subtitle;

    // constructor for adding sample data
    public MyObject(String objectName, String subtitle){

        this.objectName = objectName;
        this.subtitle = subtitle;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getSubtitle() {
        return subtitle;
    }
}
