package com.epam.algorithmization.sortingArray;

/*1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.*/
public class Task1 {
    public static void main(String[] args) {
        int arrayA[] = new int[10];
        int arrayB[] = new int[15];
        int k = 5;
        generateArray(arrayA);
        generateArray(arrayB);
        printArray(arrayA);
        printArray(arrayB);
        int[] arrayNew = rebuildArray(arrayA, arrayB, k);
       printArray(arrayNew);
    }

    public static void generateArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static int[] rebuildArray(int array1[], int array2[], int k) {
        int resultArrayLength = array1.length + array2.length;
        int resultArray[] = new int[resultArrayLength];
        int numberElement = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i == 5) {
                for (int j = 0; j < array2.length; j++) {
                    resultArray[numberElement] = array2[j];
                    numberElement++;
                }
            }
            resultArray[numberElement] = array1[i];
            numberElement++;
        }
        return resultArray;
    }

}
