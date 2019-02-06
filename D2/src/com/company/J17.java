package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J17 {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();
        int pobrane;
        int suma = 0;
        int srednia;
        int max = 0;
        int min = 0;

        do {

            System.out.println("podaj wartość: ");
            pobrane = odczyt.nextInt();
            lista.add(pobrane);

        } while (pobrane !=0);

        lista.remove(lista.size()-1);
        System.out.println("Lista pobranych wartości: " + lista);

        for (int elem : lista) {
            suma += elem;
        }
        System.out.println("Suma elementów z listy: " + suma);

        srednia = suma/lista.size();
        System.out.println("Srednia elementów z listy: " + srednia);

        for (int i=0; i<=lista.size(); i++) {
            if (lista.indexOf(i) < i++){
                min += i;
                System.out.println("wartośc min w liscie: " + min);
            }
            if (i > i++) {
                max += i;
                System.out.println("wartośc max w liście: " + max);
            }
        }
        System.out.println();

    }
}
