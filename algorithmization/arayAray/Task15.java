package com.epam.algorithmization.arayAray;


/*15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/
public class Task15 {
    public static void main(String[] args) {
        int[][] matrixB = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 50}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int maxElement = matrixB[0][0];

        for (int i = 0; i < matrixB.length; i++)
            for (int j = 0; j < matrixB[i].length; j++) {
                if (matrixB[i][j] > maxElement) {
                    maxElement = matrixB[i][j];
                }
            }
        System.out.println("Максимальный элемент матрицы:" + maxElement);
        for (int i = 0; i < matrixB.length; i++)
            for (int j = 0; j < matrixB[i].length; j++) {
                if (j % 2 == 0) {
                    matrixB[i][j] = maxElement;
                }
            }

        System.out.println("Вывод матрицы:");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
