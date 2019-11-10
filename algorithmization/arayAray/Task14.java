package com.epam.algorithmization.arayAray;

import java.util.Random;

/*14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/
public class Task14 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int count;
        int[][] matrixB = new int[m][n];
        Random random = new Random();
        int max = 1;
        int min = 0;
        int value = 0;

        for (int i = 0; i < matrixB.length; i++) {
            count = 0;
            for (int j = 0; j < matrixB[i].length; j++) {
                value = random.nextInt(((max - min) + 1) + min);

                matrixB[i][j] = value;

                if (matrixB[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println("Вывод матрицы:");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
     //   System.out.println("Номера строк в которых число 5 встречаеться больше 3 раз:");
    }

}
