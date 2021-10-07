package com.company;

public class CarFactory {

    public static void main(String[] args) {
        var bmw = new Car("BMW", "Black", 50000);
        bmw.drive();
        var racingCar = new RacingCar("Ferrari", "Red", 1000000);
        racingCar.drive();

        var taxi = new Taxi(5, "Alptaxi", true);
        taxi.drive();
    }
}
