package com.practice.services;

import com.practice.Bicycle;
import com.practice.entities.Address;
import com.practice.entities.User;
import com.practice.factory.BicycleFactory;
import org.jetbrains.annotations.NotNull;

public class BikeRentalService {
    public static void main(String[] args) {
        BicycleFactory bicycleFactory = new BicycleFactory();
        BikeRentalService bikeRentalService;
        Address address = new Address();
        address.setStreetNumber(1);
        address.setStreetName("Prashant Nagar");
        address.setLandMark("Behind Hanuman Temple");
        address.setCity("amravati");
        address.setPin(444606);
        address.setMobileNumber("8125727619");
        User user = new User();
        user.setUserName("Akshay");
        user.setLastName("Paturkar");
        user.setAge(29);
        user.setAddress(address);
        Bicycle bicycle = bicycleFactory.getBicycle("Other");
        user.setBicycle(bicycle);
        bikeRentalService = new BikeRentalService();
        user = bikeRentalService.rentBike(user);
        user = bikeRentalService.submitBike(user);
        double rental = bikeRentalService.calculateRent(user, bicycle);
        System.out.print(bicycle.getType() + " Bike rented by user " + user.getUserName() + " for time " + user.getRentDuration() + " and cost to be paid is " + rental);
    }

    User rentBike(User user) {
        user.setUserLoginTime(System.currentTimeMillis());
        return user;
    }

    User submitBike(User user) {
        user.setUserLogoutTime(System.currentTimeMillis() + 10);
        return user;
    }

    double calculateRent(@NotNull User user, Bicycle bicycle) {
        return user.calculateRental(user, bicycle);
    }


}
