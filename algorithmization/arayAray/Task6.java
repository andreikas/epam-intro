package com.epam.algorithmization.arayAray;

/*6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/
public class Task6 {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j + 1 > i && n - j > i) || (j + 1 < i && n - j < i)) {
                    System.out.print(1 + "\t");
                } else {
                    System.out.print(0 + "\t");
                }
            }
            System.out.println();
        }
    }
}