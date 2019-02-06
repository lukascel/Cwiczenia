package com.company;

import java.util.Scanner;

public class rownanie_kwadratowe {
    public static void main(String[] args) {
        double a;
        double b;
        double c;


        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj a: ");
        a = odczyt.nextDouble();

        System.out.println("podaj b: ");
        b = odczyt.nextDouble();

        System.out.println("podaj c: ");
        c = odczyt.nextDouble();


        double delta = Math.pow(b, 2) - (4*a*c);
        System.out.println("delta = " + delta);

        if (delta >0) {
            double x1 = (-b - Math.sqrt(delta))/2*a;
            double x2 = (-b + Math.sqrt(delta))/2*a;
            System.out.println("X1:" + x1 + " " + "X2" + x2);

        } else if (delta == 0){
            double x = (-b/(2*a));
            System.out.println("X: " + x);

        } else {
            System.out.println("brak rozwiazan");
        }
        odczyt.close();
    }

}
