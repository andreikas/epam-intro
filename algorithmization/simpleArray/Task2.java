package com.epam.algorithmization.simpleArray;

/*2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/
public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        int z = 5;
        int j = 0;
        int[] a;
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < n; i++) {
            if (a[i] > z) {
                a[i] = z;
                j++;
            }
        }
        System.out.println("Количество замен = " + j);
    }
}
