package com.company;

public class J18 {
    public static void main(String[] args) {
        int [] tab1 = {1,2,3};
        int [] tab2 = {4,5,6};

        int suma = 0;

        for (int i = 0; i< tab1.length; i++)
            {suma += tab1[i] + tab2[i];}

        System.out.println(suma);
    }

}
//gdyby były różne rozmiary tablic to trzeba byłoby zrobić dwie pętle i na koniec suma.
