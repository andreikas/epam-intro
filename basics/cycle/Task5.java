package com.epam.basics.cycle;

/*5. Даны числовой ряд и некоторое число е.
Найти сумму тех членов ряда, модуль которых больше или равен заданному е.*/
public class Task5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 200000;
        double s = 0;
        double e = .0002;
        for (int n = a; n <= b; n++) {
            double aN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (Math.abs(aN) >= e) {
                s += aN;
            }
        }
        System.out.println("Сумма чисел = " + s);
    }
}
