package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TESTY {
    public static void main(String[] args) {
        Random random = new Random();

        int [] tablica = new int [20];
        int [] tablicaWystapien = new int [10];

        for (int i = 0; i < tablica.length; i++ ) {
            tablica[i] = random.nextInt(10);
        }
        for (int elem : tablica) {
            System.out.print(elem + " ");
        }

        for (int i=0; i<tablicaWystapien.length; i++) {
            tablicaWystapien[tablica[i]] ++;

            System.out.println(i + " ->" + tablicaWystapien[i] + " razy");
        }
    }
}

