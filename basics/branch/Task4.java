package com.epam.basics.branch;

/*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.*/
public class Task4 {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        int x = 5;
        int y = 6;
        int z = 7;
        if (a <= x && b <= y || a <= y && b <= z || a <= x && b <= z
                || b <= x && a <= y || b <= y && a <= z || b <= x && a <= z) {
            System.out.println("Кирпич пройдёт через отверстие");
        } else {
            System.out.println("Кирпич не пройдёт через отверстие");
        }

    }
}
