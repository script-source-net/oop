package com.company.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rechnung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("a = ");
            int a = sc.nextInt();
            System.out.println("b = ");
            int b = sc.nextInt();
            checkIfPositiv(a);
            checkIfPositiv(b);
            System.out.println("a/b = " + (a/b));
        } catch (IntIsNegativeException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException a) {
            System.out.println("Exception " + a.getMessage());
        }catch (InputMismatchException i){
            System.out.println("Nur Ganzzahlen erlaubt");
        }

    }
    private static void checkIfPositiv(int number) {
        if(number < 0){
            throw new IntIsNegativeException();
        }
    }
}
