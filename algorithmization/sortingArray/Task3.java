package com.epam.algorithmization.sortingArray;

/*3. Сортировка выбором. Дана последовательность чисел a1<=a2<=aN .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.*/
public class Task3 {
    public static void main(String[] args) {
        int arrayA[] = new int[10];
        generateArray(arrayA);
        System.out.println("Исходный массив");
        printArray(arrayA);
        System.out.println("Отсортированный массив");
        rebuildArray(arrayA);
        printArray(arrayA);
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


    public static void rebuildArray(int array[]) {
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
