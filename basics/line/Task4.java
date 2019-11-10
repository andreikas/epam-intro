package com.epam.basics.line;

/*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.*/
public class Task4 {
    public static void main(String[] args) {
        double r = 123.456;
        double ddd = (int) r;
        double nnn = (r - (int) r) * 1000;
        double x = (int) nnn + (ddd / 1000);
        System.out.println("z = " + x);
    }
}
