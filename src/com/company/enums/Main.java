package com.company.enums;

public class Main {
    public static void main(String[] args) {
        Year year = new Year();
        year.printTemparature(Season.SUMMER);
        year.printTemparature(Season.FALL);
        year.printTemparature(Season.WINTER);
        year.printTemparature(Season.SPRING);

        Season seasons[] = Season.values();
        for(Season s : seasons){
            System.out.println("Temparaturen: " + s.name() + " / " + s.getTemparature());
        }
    }
}
