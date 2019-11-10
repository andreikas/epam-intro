package com.epam.basics.cycle;

/*8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/
public class Task8 {
    public static void main(String[] args) {

        int a = 2563;
        int b = 253;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        while (a > 0) {
            // System.out.println("Число a = " + a % 10);
            int b1 = b;
            while (b1 > 0) {
                //  System.out.println("Число b = " + b1 % 10);
                if (a % 10 == b1 % 10) {
                    System.out.println("Число совпадает в двух цифрах = " + b1 % 10);
                }
                b1 = b1 / 10;
            }
            a = a / 10;
        }
    }
}
