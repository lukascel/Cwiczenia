/* package com.company;

import com.sun.xml.internal.stream.Entity;

import java.util.Random;
import java.util.Scanner;

public class J13 {
    public static void main(String[] args) {
        Random random = new Random();

        int low = 1;
        int high = 5;
        int v1 = random.nextInt(high-low) + low;
        int v2 = random.nextInt(high-low) + low;
        int v3 = random.nextInt(high-low) + low;
        int v4 = random.nextInt(high-low) + low;
        int v5 = random.nextInt(high-low) + low;

        System.out.println("" + v1 + " " + v2 + " " + v3 + " " + v4 + " " + v5);

        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj wartośc - próg akceptowalności, w zakresie <1-5>: ");

        int prog = odczyt.nextInt();
        odczyt.close();

        if (v1 > prog) {

            System.out.println("wartości równe progowi: ");
        }


    }
}
*/