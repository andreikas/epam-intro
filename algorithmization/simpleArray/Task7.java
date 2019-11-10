package com.epam.algorithmization.simpleArray;

/*7. Даны действительные числа a1,a2...an. Найти max a(a1+a2n,a2+a2n-1...an+an-1)*/
//??? Непонятны индексы
public class Task7 {
    public static void main(String[] args) {
        int s = 0;
        double[] a = new double[]{-1.2, -2.3, -3, 0, 5.2, 0, 7, 8, 9, 10};
        for (int i = 0; i < a.length; i++) {
            // s = a[i] + a[2 * a.length - i + 1];
            System.out.println(i + "==" + (2 * a.length - i + 1));
        }

        System.out.println("Сумма чисел равна " + s);
    }
}

