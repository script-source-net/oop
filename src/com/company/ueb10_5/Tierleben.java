package com.company.ueb10_5;

public class Tierleben {
    /*
    public static void gibAus(Object tier) {
        System.out.println("Objekt: " + tier);
    }
     */
    /*
    public static void gibAus (Katze tier) {
        System.out.println("Katze: " + tier);
     }
     */
    public static <T> void gibAus(T tier) {
        System.out.println("Unbekannt: " + tier);
    }
    public static <T extends Tier> void gibAus(T tier) {
        System.out.println("Tier: " + tier);
    }
    public static <T extends Haustier> void gibAus(T tier) {
        System.out.println("Haustier: " + tier);
    }
    public static <T extends Wildtier> void gibAus(T tier) {
        System.out.println("Wildtier: " + tier);
    }

    public static void main(String[] args) {
        gibAus("Amoebe");
        gibAus(new Katze());
        gibAus(new Hauskatze());
        gibAus(new Wildkatze());
    }
}
