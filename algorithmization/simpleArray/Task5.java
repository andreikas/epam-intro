package com.epam.algorithmization.simpleArray;

/*5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.*/
public class Task5 {
    public static void main(String[] args) {
        int[] a = new int[]{-1, -2, -3, 0, 5, 0, 7, 8, 9, 10};

        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                System.out.println("i = " + i + "; a[" + i + "] = " + a[i]);
            }
        }
    }
}
