package com.epam.algorithmization.sortingArray;

/*4. Сортировка обменами. Дана последовательность чисел a1<=a2<=aN .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа aI и aI+1 . Если aI > aI+1 , то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.*/
public class Task4 {
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
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
