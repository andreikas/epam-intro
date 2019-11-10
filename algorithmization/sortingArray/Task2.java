package com.epam.algorithmization.sortingArray;

/*Даны две последовательности a1<=a2<=aN и b1<=b2<bN. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/
public class Task2 {
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
