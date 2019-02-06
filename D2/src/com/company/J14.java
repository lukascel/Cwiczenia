package com.company;

import java.util.Scanner;

public class J14 {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj wartość liczbę całkowitą, dodatnią ");

        int liczba = odczyt.nextInt();
        odczyt.close();

//        for (int i = 0; i<liczba; i+=2){
//            System.out.println(i);}

        for (int i = 0; i<liczba; i++){
            if (i%2 ==0)
                continue;

            System.out.println(i);}
    }
}
