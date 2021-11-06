package com.company.hotel;

public abstract class Waehrung {
    public abstract double dollarBetrag();

    public static double berechneSteuer(Waehrung[] geld){
        double summe = 0.0;
        for (Waehrung w : geld){
            summe+=w.dollarBetrag();
        }
        return summe*0.08;
    }

    public static double berechneGesamtwert(Wertgegenstand[] wertgegenstaende){
        double summe = 0.0;
        for(Wertgegenstand w : wertgegenstaende){
            summe += w.berechneWert().dollarBetrag();
        }
        return summe;
    }
}
