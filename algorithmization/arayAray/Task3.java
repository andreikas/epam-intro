package com.epam.algorithmization.arayAray;

/*3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/
public class Task3 {
    public static void main(String[] args) {
        int[][] matrixB = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int k = 2;
        int p = 3;

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                if (i == k || j == p) {
                    System.out.print(matrixB[i][j] + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
}
