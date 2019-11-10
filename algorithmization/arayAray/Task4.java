package com.epam.algorithmization.arayAray;

/*4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): */
public class Task4 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    System.out.print(j + "\t");
                } else {
                    System.out.print(n + 1 - j + "\t");
                }
            }
            System.out.println();
        }
    }
}
