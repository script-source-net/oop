package com.company.hotel;

public class Yen extends Waehrung{
    private double betrag;
    private double kurs;

    public Yen(double betrag, double kurs){
        this.betrag = betrag;
        this.kurs = kurs;
    }

    public Yen setKurs(double kurs) {
        this.kurs = kurs;
        return this;
    }

    @Override
    public double dollarBetrag() {
        return (betrag*kurs);
    }

}
