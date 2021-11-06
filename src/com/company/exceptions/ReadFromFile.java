package com.company.exceptions;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dateiname: ");
        String filename = sc.nextLine();

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filename);
            while(true) {
                int read = fileReader.read();
                if (read == -1) {
                    break;
                }
                System.out.println((char) read);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei exisitiert nicht!");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Datei kann nicht ausgelesen werden");
            e.printStackTrace();
        }


    }
}
