package com.epam.algorithmization.simpleArray;

/*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/
public class Task1 {
    public static void main(String[] args) {
        int n = 10;
        int k = 2;
        int[] a;
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
