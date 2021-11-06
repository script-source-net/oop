package com.company.zoo;

public interface Pet<Double> {
    boolean likesGoingForAWalk();
    String whoIsTheBoss();
    default void giveFood(){
        System.out.println("yummi");
    }

}
