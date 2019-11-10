package com.epam.basics.branch;

/*5. Вычислить значение функции:*/
public class Task5 {
    public static void main(String[] args) {
        double fX;
        int x = 5;
        if (x <= 3) {
            fX = x * x - 3 * x + 9;
        } else {
            fX = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(fX);
    }
}
