package com.company;

import java.util.Random;

public class J19 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];
        int min = 10; // uwaga - bo potrzebujemy tutaj max, żeby od tego odejmować i szukac minimum
        int max = 0;
        int suma = 0;


        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10);
            System.out.print(tab[i]);

            if (tab[i] < min) {
                min = tab[i];
            }

            if (tab[i] > max) {
                max = tab[i];
            }
        suma += tab[i];

        }
        int srednia = (suma/tab.length);

        System.out.println("minimum: " + min);
        System.out.println("maximum: " + max);
        System.out.println("suma = " + suma);
        System.out.println("średnia = " + srednia);

        int mniejOdSredniej = 0;
        int wiecejOdSredniej = 0;

        for (int elem : tab) {
            if (elem < srednia) {
                mniejOdSredniej++;
            } else if (elem > srednia) {
                wiecejOdSredniej++;
            }
            }
        System.out.println("ilość elementów mniejszych od średniej = " + mniejOdSredniej);
        System.out.println("ilość elementów większych od średniej = " + wiecejOdSredniej);

        for (int i = tab.length-1; i>=0; i--) {
            System.out.print(tab[i]);
        }
    }
    }

