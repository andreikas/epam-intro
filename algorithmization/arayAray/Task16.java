package com.epam.algorithmization.arayAray;


/*15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/
public class Task16 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];

        System.out.println("Исходный массив");
        Task16.GenerateArray(matrix);

        Task16.PrintArray(matrix);
        System.out.println("Магический квадрат");
        Task16.ReverseArray1(matrix);
        Task16.ReverseArray2(matrix);
        Task16.PrintArray(matrix);

    }

    public static void GenerateArray(int matrixA[][]) {
        int k = 1;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                matrixA[i][j] = k;
                k++;
            }
        }
    }

    public static void PrintArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void ReverseArray1(int a[][]) {
        int t;
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length / 2; j++) {
                if (i == j) {
                    t = a[i][j];
                    a[i][j] = a[a.length - 1 - i][a.length - 1 - j];
                    a[a.length - 1 - i][a.length - 1 - j] = t;
                }
            }
        }
    }

    public static void ReverseArray2(int a[][]) {
        int t;
        for (int i = 0, j = a.length - 1 - i; i <= (a.length / 2) - 1; ++i, --j) {
            t = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = t;
        }
    }
}
