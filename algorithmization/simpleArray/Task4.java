package com.epam.algorithmization.simpleArray;

/*4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/
public class Task4 {
    public static void main(String[] args) {
        double[] a = new double[]{-1.2, -2.5, -3.2, 0, 5, 0, 7, 8, 9, 10};
        int maxElement = 0;
        double maxValue = a[0];
        int minElement = 0;
        double minValue = a[0];
        double exValue;


        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxElement = i;

            }
            if (a[i] < minValue) {
                minElement = i;
            }
        }
        System.out.println("Номер максимального элемента в массиве = " + maxElement);
        System.out.println("Номер миниммального элемента в массиве  " + minElement);

        exValue = a[maxElement];
        a[maxElement] = a[minElement];
        a[minElement] = exValue;

    }
}
