package com.company;

public class Main {
    public static void main(String[] args) {

        USDollar dollar = new USDollar(5000.0);
        System.out.println(dollar.dollarBetrag());

        Yen yen = new Yen(3403002.0, 0.0089);
        System.out.printf("%.2f$ \n",yen.dollarBetrag());

        Waehrung[] waehrungen = new Waehrung[2];
        waehrungen[0] = dollar;
        waehrungen[1] = yen;

        Double steuern = Waehrung.berechneSteuer(waehrungen);
        System.out.printf("Steuern %.2f$",steuern);
    }
}
