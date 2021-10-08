package com.company;

public class USDollar extends Waehrung{
    private double betrag;

    public USDollar(double betrag){
        this.betrag= betrag;
    }
    @Override
    public double dollarBetrag() {
        return betrag;
    }
}
