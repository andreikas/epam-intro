package com.epam.algorithmization.simpleArray;

/*3. Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/
public class Task3 {
    public static void main(String[] args) {
        int countP = 0;
        int countM = 0;
        int countO = 0;
        double[] a;
        a = new double[]{-1.2, -2.5, -3.2, 0, 5, 0, 7, 8, 9, 10};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                countP++;

            } else if (a[i] < 0) {
                countM++;
            } else {
                countO++;
            }
        }
        System.out.println("Количество положительных чисел = " + countP);
        System.out.println("Количество отрицательных чисел = " + countM);
        System.out.println("Количество нулевых чисел = " + countO);
    }
}
