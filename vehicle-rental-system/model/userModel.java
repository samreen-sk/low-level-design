package model;

public class userModel {
    private String name;
    private boolean isLicensed;
    private int pincode;

    public userModel(String name, boolean isLicensed, int pincode) {
        this.name = name;
        this.isLicensed = isLicensed;
        this.pincode = pincode;
    }

    public String getName(){
        return name;
    }
    public boolean isLicensed(){
        return isLicensed;
    }
    public int getPincode(){
        return pincode;
    }
}
