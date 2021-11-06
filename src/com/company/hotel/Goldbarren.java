package com.company.hotel;

public class Goldbarren implements Wertgegenstand{
    private double gewichtInKg;
    public static double preisProKg = 30000;

    public Goldbarren(double gewichtInKg) {
        this.gewichtInKg = gewichtInKg;
    }

    @Override
    public Waehrung berechneWert() {
        return new USDollar(gewichtInKg*preisProKg);
    }
}
