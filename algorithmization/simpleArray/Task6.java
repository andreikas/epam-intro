package com.epam.algorithmization.simpleArray;

/*6. Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых
являются простыми числами.*/
public class Task6 {
    public static void main(String[] args) {
        double[] a = new double[]{-1.2, -2.3, -3, 0, 5.2, 0, 7, 8, 9, 10};
        int simpleNumber;
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            simpleNumber = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i > 2) {
                    simpleNumber = 0;
                }
            }
            if (simpleNumber == 1 && i > 1) {
                System.out.println("i -  простое " + i);
                sum += a[i];

            } else {
                System.out.println("i - не простое " + i);
            }
        }
        System.out.println("Сумма чисел равна " + sum);
    }
}

