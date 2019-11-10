package com.epam.algorithmization.arayAray;

/*1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/
public class Task1 {
    public static void main(String[] args) {
        int[][] matrixB = {{6, 2, 3, 4, 5}, {11, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < matrixB.length; i++) {
            if (matrixB[i][0] > matrixB[i][matrixB[i].length -1]) {

                for (int j = 0; j < matrixB[i].length; j++) {
                     if (j % 2 == 0)
                    {
                        System.out.print(matrixB[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }
    }
}
