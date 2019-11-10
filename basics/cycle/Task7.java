package com.epam.basics.cycle;
/*7. Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме единицы и самого числа.
m и n вводятся с клавиатуры.*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число 'm' ");
        while (scanner.hasNextInt() == false) {
            scanner.next();
        }
        int m = scanner.nextInt();
        System.out.println("m = " + m);


        System.out.println("Введите натуральное число 'n' ");
        while (scanner.hasNextInt() == false) {
            scanner.next();
        }
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        for (int i = m; i <= n; i++) {
            System.out.print(i + " = ");
            for (int j = 1; j <= i; j++) {

                if (((i % j) == 0) && (j != 1 && j != i)) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
