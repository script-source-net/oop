package com.company.zoo;

public class Cat extends Animal implements Pet{
    @Override
    public void defend() {
        System.out.println("i scratch");
    }

    @Override
    public boolean likesGoingForAWalk() {
        return false;
    }

    @Override
    public String whoIsTheBoss() {
        return "MySelf";
    }
}
