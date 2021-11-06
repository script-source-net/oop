package com.company.zoo;

public class Dog extends Animal implements Pet<Double>{
    @Override
    public void defend() {
        System.out.println("i bite");
    }


    @Override
    public boolean likesGoingForAWalk() {
        return true;
    }

    @Override
    public String whoIsTheBoss() {
        return "The Owner";
    }
}
