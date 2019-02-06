package com.company;

import java.util.Scanner;

public class J11 {
    public static void main(String[] args) {
        float liczba1;
        float liczba2;
        String dzialanie;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę: ");

        liczba1 = odczyt.nextFloat();

        System.out.println("podaj działanie ");
        dzialanie = odczyt.next();

        System.out.println("podaj drugą liczbę: ");
        liczba2 = odczyt.nextFloat();

            switch (dzialanie) {
            case "+":
            System.out.println(liczba1 + liczba2);
            break;
            case "-":
            System.out.println(liczba1-liczba2);
            break;
            case "*":
            System.out.println(liczba1*liczba2);
            break;
            case "/":
            System.out.println(liczba1/liczba2);
            break;
            default:
            System.out.println("Błędna operacja");
            break;
        }
        odczyt.close();
    }
}
