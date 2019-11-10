package com.epam.algorithmization.arayAray;

/*5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): */
public class Task5 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (n - j > i - 2) {
                    System.out.print(i + "\t");
                } else {
                    System.out.print(0 + "\t");
                }
            }
            System.out.println();
        }
    }
}
