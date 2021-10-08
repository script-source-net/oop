package com.company;

public class RaceCar extends Car{
    private String team;
    private int number;
    private int horsePower;

    public RaceCar(String team, int number, int horsePower){
        this.team = team;
        this.number = number;
        this.horsePower = horsePower;
    }

    public void drive(){
        System.out.println("Ich fahre für " + this.team + " mit der Nummer "
                + this.number+ " mit " + this.horsePower + " Pferdestärken!");
    }
}
