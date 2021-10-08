package com.company;

import java.util.Scanner;

public class WaehrungsKalkulator {
    public static void main(String[] args) {
        double betrag;
        DM dm;
        Lire l;
        Franc f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Wähle die Währung!\n" +
                "1 -> Deutschemark\n" +
                "2 -> Italienische Lire\n" +
                "3 -> Französische Franc\n");
        switch (sc.nextInt()){
            case 1:
                System.out.print("DM Betrag -> ");
                betrag=sc.nextDouble();
                dm = new DM(betrag);
                l = new Lire(dm);
                f = new Franc(dm);
                System.out.printf("%.2f DM sind %.2f Euro, %.2f Lire und %.2f Franc! \n"
                        ,dm.waehrungsBetrag(), dm.euroBetrag(), l.waehrungsBetrag(), f.waehrungsBetrag());
                break;
            case 2:
                System.out.print("Lire Betrag -> ");
                betrag=sc.nextDouble();
                l = new Lire(betrag);
                dm = new DM(l);
                f = new Franc(l);
                System.out.printf("%.2f Lire sind %.2f Euro, %.2f DM und %.2f Franc! \n"
                        ,l.waehrungsBetrag(), l.euroBetrag(), dm.waehrungsBetrag(), f.waehrungsBetrag());
                break;
            case 3:
                System.out.print("Franc Betrag -> ");
                betrag=sc.nextDouble();
                f = new Franc(betrag);
                dm = new DM(f);
                l = new Lire(f);
                System.out.printf("%.2f Franc sind %.2f Euro, %.2f DM und %.2f Lire! \n"
                        ,f.waehrungsBetrag(), f.euroBetrag(), dm.waehrungsBetrag(), l.waehrungsBetrag());
                break;
            default:
                System.out.print("DM Betrag -> ");
                betrag=sc.nextDouble();
                dm = new DM(betrag);
                l = new Lire(dm);
                f = new Franc(dm);
                System.out.printf("%.2f DM sind %.2f Euro, %.2f Lire und %.2f Franc! \n"
                        ,dm.waehrungsBetrag(), dm.euroBetrag(), l.waehrungsBetrag(), f.waehrungsBetrag());
                break;
        }
    }
}
