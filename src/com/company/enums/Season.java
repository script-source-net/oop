package com.company.enums;

public enum Season {
    SPRING("warm"),
    SUMMER("hot"),
    WINTER("cold"),
    FALL("cool");

    private String temparature;

    Season(String temparature){
        this.temparature = temparature;
    }

    public String getTemparature() {
        return temparature;
    }
}
