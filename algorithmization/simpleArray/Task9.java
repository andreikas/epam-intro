package com.epam.algorithmization.simpleArray;

/* 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них*/
public class Task9 {
    public static void main(String[] args) {
        int[] a = new int[]{2, -3, -3, 0, 5, 0, 8, 9, 10};

        int value = a[0];
        int valueCount;
        int maxValueCount = 0;

        for (int i = 0; i < a.length; i++) {
            valueCount = 0;
            for (int j = 0; j < a.length; j++) {
                {
                    if (a[i] == a[j] && i != j) {
                        valueCount = valueCount + 1;
                    }
                }
            }
            System.out.println("Количество повторений = " + (valueCount + 1) + " a[i]= " + a[i]);
            if (valueCount > maxValueCount) {
                if (a[i] < value) {
                    maxValueCount = valueCount;
                    value = a[i];
                }
            }
        }
        System.out.println("Количество повторений минимального значения = " + (maxValueCount + 1) + " Значение = " + value);
    }
}



