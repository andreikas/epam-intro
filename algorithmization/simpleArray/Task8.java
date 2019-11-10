package com.epam.algorithmization.simpleArray;

/* Дана последовательность целых чисел  a1, a2...,an.
Образовать новую последовательность, выбросив из
исходной те члены, которые равны min(a1,a2,an)*/
public class Task8 {
    public static void main(String[] args) {
        int s = 0;
        int[] a = new int[]{2, 3, 3, 0, 5, 0, 7, 8, 9, 10};


        double aMin = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < aMin) {
                aMin = a[i];
            }
        }
        System.out.println("Минимальное значение = " + aMin);

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != aMin) {
                j++;
            }
        }

        int[] aNewArray = new int[j];
        j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != aMin) {
                aNewArray[j] = a[i];
                j++;
            }
        }

        System.out.println("Новый массив ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(aNewArray[i]);
        }

    }
}


