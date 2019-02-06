package com.company;

import java.util.Scanner;

public class J16 {
    public static void main(String[] args) {

        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj napis:");
        String text = odczyt.nextLine();

        System.out.println("podaj krok: ");
        int krok = odczyt.nextInt();

    char [] tablicaPodzielonyText = text.toCharArray(); //funkcja robiąca ze stringa znaki

    for (int i = krok-1; i < tablicaPodzielonyText.length; i+=krok) { // krok - 1 bo tablica numeruje się od 0 więc tak naprawdę policzyłby mi od następnej po kroku.
        System.out.println(tablicaPodzielonyText[i]);
        }
    }
}
