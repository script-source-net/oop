package com.company;

public class Euro extends Waehrung{
    public static double kurs = 1;
    private double wert;

    public Euro(double wert){
        this.wert=wert;
    }
    @Override
    public double dollarBetrag() {
        return wert*kurs;
    }

    public double euroBetrag(){
        return wert;
    }

    public static void setEuroKurs(double Kurs){
        kurs =Kurs;
    }
}
