package com.epam.algorithmization.arayAray;

import java.util.Random;

/*12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/
public class Task12 {
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
                System.out.print(matrixB[i][j] + "/t");
            }
            System.out.println();
        }
        boolean sorted = false;
        int temp;
        for (int i = 0; i < matrixB.length; i++) {

            while (!sorted) {
                sorted = true;
                for (int j = 0; j < matrixB.length - j; j++) {
                    if (matrixB[i][j] > matrixB[i][j + 1]) {
                        temp = matrixB[i][j];
                        matrixB[i][j] = matrixB[i][j + 1];
                        matrixB[i][j + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }


        System.out.println("Вывод матрицы:");
        int count;

        for (int i = 0; i < matrixB.length; i++) {
            count = 0;
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "/t");
            }
            System.out.println();
        }
    }
}
