package com.company;

public class TABLICE {
    public static void main(String[] args) {
        String[] firstNames = {"Karol", "Basia", "Kasia"};
        String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};
        String[][] firstLast = {firstNames, lastNames};

        System.out.println("Pierwsza osoba to: " + "\n");
        System.out.print(firstLast[0][0] + " " + firstLast[1][0] + "\n");
        System.out.println("Druga osoba to: " + "\n");
        System.out.println(firstLast[0][1] + " " + firstLast[1][1] + "\n");
        System.out.println("Trzecia osoba to: ");
        System.out.println(firstLast[0][2] + " " + firstLast[1][2] + "\n");
    }

}
