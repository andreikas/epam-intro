package com.epam.basics.line;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):*/
public class Task2 {
    public static void main(String[] args) {
        double a = 1.2;
        double b = 2.2;
        double c = 3.2;
        double z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3) * Math.pow(b, -2);
        System.out.println("z = " + z);
    }
}
