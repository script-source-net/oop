package com.company;

public class CarFactory {

    public static void main(String[] args) {
        var bmw = new Car();
        bmw.setBrand("BMW");
        bmw.setColor("Black");
        bmw.setPrice(50000);
        bmw.drive();

        //todo: aktivieren diesen code:
        var racingCar = new RacingCar();
        racingCar.drive();
    }
}
