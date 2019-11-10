package com.epam.algorithmization.arayAray;

/*7. Сформировать квадратную матрицу порядка N по правилу:
 * и подсчитать количество положительных элементов в ней.*/
public class Task7 {
    public static void main(String[] args) {
        int n = 6;
        double aIJ;
        int countPositiveElement = 0;
        System.out.println("Матрица элементов : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aIJ = Math.sin((i * i - j * j) / n);
                System.out.print(aIJ + "\t");
                if (aIJ > 0) {
                    countPositiveElement++;
                }
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов = " + countPositiveElement);
    }
}
