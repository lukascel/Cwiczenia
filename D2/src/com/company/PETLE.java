package com.company;

import java.util.Scanner;

public class PETLE {
    public static void main(String[] args) {

        int a;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj liczbę całkowitą: ");
        a = odczyt.nextInt();

        odczyt.close();

      for (int i = 1; i<=a; i+=2) {
          System.out.println(i);
      }


    }
}
