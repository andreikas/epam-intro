package com.epam.basics.cycle;
/*2. Вычислить значения функции на отрезке [а,b] c шагом h:*/
public class Task2 {
    public static void main(String[] args) {
        int a = -5;
        int b = 10;
        int h = 2;
        int y = 0;
        for (int x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("При x = " + x + ", y = " + y + ";");
        }

    }
}
