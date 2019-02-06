/*package com.company;

import java.util.Random;

public class J21_DOMOWE {
    public static void main(String[] args) {
        Random random = new Random();

//zakres liczb w tablicy - przyjmuję losowe od 0 do 10


        int [][] bigTable = new int[5][5];
        int minimum = 10;
        int maximum = 0;
        int [] minTab;
        int [] maxTab;


        for (int i = 0; i < bigTable[i].length -1; i++) {
            for (int j = 0; j < bigTable[i].length -1; j++) {
                bigTable[i][j] = random.nextInt(10);
                System.out.print(bigTable[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("wyswietl rzędy w kolumnach: ");

        for (int i = 0; i<bigTable[i].length-1; i++){
            for (int j = 0; j < bigTable[i].length -1; j++){
                System.out.print(bigTable[j][i] + " ");

            if (bigTable[j][i] < minimum) {
               minTab[i][j] = bigTable[j][i];
            }
            if (bigTable[j][i] > maximum){
                maximum = bigTable[j][i];
            }
            }

            System.out.println();
            }

        System.out.println("minimum = " + minimum);
        System.out.println("maximum = " + maximum);



    }
}
*/
