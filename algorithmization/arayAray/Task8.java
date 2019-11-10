package com.epam.algorithmization.arayAray;

/*8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/
public class Task8 {
    public static void main(String[] args) {
        int[][] matrixB = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        int k = 2;
        int l = 3;

        int value;


        System.out.println("Начальная матрица");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matrixB.length; i++) {
            value = matrixB[i][k];
            matrixB[i][k] = matrixB[i][l];
            matrixB[i][l] = value;
        }
        System.out.println("Изменённая матрица");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}