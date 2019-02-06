/* dorobic w domu
package com.company;


import java.util.Random;

public class J20 {
    public static void main(String[] args) {
        Random rand = new Random();

        int [] tablicaLiczb = new int [20];
        int [] tablicaWystapien = new int[10];


        for (int i = 0; i <tablicaLiczb.length; i++) {
            tablicaLiczb[i] = rand.nextInt(10);
            System.out.print(tablicaLiczb[i] + " ");

        }
        for (int i = 0; i<tablicaWystapien.length; i++) {
            tablicaWystapien[tablicaLiczb[i]]++; //odczytuje wystąpienie liczby z tablicy liczb i dodaje do kolejnego miejsca w drugiej tablicy
            //to co wyzej tylko inaczej: tablicaWystapien... - sprawdzić w prezentacji od Wojtka
            System.out.println(i + " ->" + tablicaWystapien[i] + " razy");
        }

    }
}
*/