package com.company;

import java.util.logging.SocketHandler;

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

    @Override
    public String toString() {
        return "" + euroBetrag() + " Euro";
    }

    public static void main(String[] args) {
        System.out.println(new Euro(1.23));
        System.out.println(new Lire(1000));
        Euro euro = new Euro(1023);
        DM dm = new DM(1234.00);
        System.out.println(euro instanceof DM);
        System.out.println(euro instanceof Waehrung);
        System.out.println(euro instanceof Euro);
        System.out.println(euro instanceof Object);
        System.out.println(dm instanceof DM);
        System.out.println(dm instanceof Euro);
        System.out.println(dm instanceof Waehrung);
        System.out.println(dm instanceof Object);
    }
}
