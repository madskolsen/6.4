package com.company;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        String ord = "abcdefg";
        if (isAbecedarian(ord)) {
            System.out.println("Ordet er i abc-rækkefølge");
        } else {
            System.out.println("Ordet er ikke i abc-rækkefølge");
        }

    }
    public static boolean isAbecedarian(String ord) {
        //Pseudokode
        //Importere et ord
        //Tjekke bogstaverne ordet indeholder
        //Sætte dem op mod hinanden for at finde rækkefølge
        //return true eller false
        boolean rækkefølge = true;
        for (int i = 1; i < ord.length(); i++) {
            System.out.println("Bogstav " + i + " er " + ord.charAt(i));
            if (ord.charAt(i)>=ord.charAt(i-1)){
                System.out.println("Dette bogstav er i abc-rækkefølge.");
            } else {
                System.out.println("Dette bogstav er ikke i abc-rækkefølge.");
                rækkefølge = false;
            }

        }
        return rækkefølge;

    }
}
