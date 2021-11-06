package com.company.exceptions;

public class Exueb8 {
    public static double gibZufallszahlBiEinhalb() throws Exception {
         {
            double res = Math.random();
            if(res > 0.5){
                throw new Exception("Zahl zu gross");
            }
            return res;
        }
    }

    public static void main(String[] args) {
        try
        {
            double zahl = gibZufallszahlBiEinhalb();
            System.out.println(zahl);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
