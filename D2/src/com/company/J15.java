package com.company;

import java.util.Scanner;

public class J15 {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);

        System.out.println("poda text1: ");
        String text1 = odczyt.nextLine();

        System.out.println("podaj text2: ");
        String text2 = odczyt.nextLine();


        char separator = (text2.charAt(text2.length()-3));
        System.out.println(separator);

        for(String temp : text1.split("" + separator)) { //Pętla foreach. uwaga! - split zwraca tablicę!! Bez fora wyświetliłyby się jakieś dziwne cyferki...
            System.out.println(temp);
            //drugi sposób - w materiałach od Wojtka
        }
    }
}