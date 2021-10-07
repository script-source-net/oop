package com.company;

public class CarFactory {

    public static void main(String[] args) {
        var bmw = new Car();
        bmw.setBrand("BMW");
        bmw.setColor("Black");
        bmw.setPrice(50000);
        bmw.drive();

    /*
        todo: implementiere ein RacingCar mit folgenden Eigenschaften:
        - team (String)
        - number (int)
        - horsepower (int)
        und der Methode drive, welche drive von Car überschreibt und "Ich fahre schnell." ausgibt,
        ohne Car anzupassen!
    */

        //todo: aktivieren diesen code:
//        var racingCar = new RacingCar();
//        racingCar.drive();
    }
}
