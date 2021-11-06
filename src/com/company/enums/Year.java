package com.company.enums;

public class Year {
    String temparature;
    public void printTemparature(Season a){
        if(a == Season.SPRING){
            temparature = "warm";
        } else if(a == Season.SUMMER){
            temparature = "hot";
        } else if(a == Season.FALL){
            temparature = "cool";
        } else {
            temparature = "cold";
        }
        System.out.println("It's " + temparature);
    }
}
