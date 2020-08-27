package com.practice.entities;

public class Address {
    private int streetNumber;
    private String streetName;
    private String landMark;
    private String city;
    private String mobileNumber;
    private int pin;

    /*public Address(int streetNumber, String streetName, String landMark, String city, long mobileNumber, int pin) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.landMark = landMark;
        this.city = city;
        this.mobileNumber = mobileNumber;
        this.pin = pin;
    }*/

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
