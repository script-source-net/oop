package com.company;

public class RacingCar extends Car {
    String team;
    int number;
    int horsePower;

    public RacingCar(String brand, String color, double price) {
        super(brand, color, price);
    }

    @Override
    public void drive() {
        System.out.println("Ich fahre schnell.");
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
