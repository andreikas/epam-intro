package com.epam.algorithmization.arayAray;

/*10. Найти положительные элементы главной диагонали квадратной матрицы.*/
public class Task10 {
    public static void main(String[] args) {
        int[][] matrixB = {{-1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        System.out.println("Положительные элементы главной диагонали матрицы");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                if (j == i && matrixB[i][j] > 0) {
                    System.out.println(matrixB[i][j] + "\t");
                }
            }
        }
    }
}