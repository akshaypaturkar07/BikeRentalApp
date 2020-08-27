package com.practice.entities;

import com.practice.Bicycle;
import com.practice.IUser;

public class User implements IUser {
    private String userName;
    private String lastName;
    private int age;
    private Address address;
    private Bicycle bicycle;
    private long userLoginTime;
    private long userLogoutTime;




    public long getRentDuration() {
        return rentDuration;
    }

    public void setRentDuration(long rentDuration) {
        this.rentDuration = rentDuration;
    }

    private long rentDuration;

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public long getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(long userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public long getUserLogoutTime() {
        return userLogoutTime;
    }

    public void setUserLogoutTime(long userLogoutTime) {
        this.userLogoutTime = userLogoutTime;
    }

    @Override
    public double calculateRental(User user, Bicycle bicycle) {
        long duration = user.getUserLogoutTime() - user.getUserLoginTime();
        user.setRentDuration(duration);
        return bicycle.calculateRental(duration);
    }
}
