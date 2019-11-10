package com.epam.algorithmization.arayAray;

import java.util.Random;

/*11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/
public class Task11 {
    public static void main(String[] args) {
        int[][] matrixB = new int[10][20];
        Random random = new Random();
        int max = 15;
        int min = 0;

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = random.nextInt(((max - min) + 1) + min);

            }
        }
        System.out.println("Вывод матрицы:");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Номера строк в которых число 5 встречаеться больше 3 раз:");
        int count;

        for (int i = 0; i < matrixB.length; i++) {
            count = 0;
            for (int j = 0; j < matrixB[i].length; j++) {
                if (matrixB[i][j] == 5) {
                    count++;
                }
            }
            if (count > 3) {
                System.out.println(i+1);
            }
        }
    }

}
