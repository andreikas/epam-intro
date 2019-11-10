package com.epam.basics.cycle;
/*1. Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        int j;
        System.out.println("Введите целое положительное число");
        while (scanner.hasNextInt() == false) {
            scanner.next();
        }
        j = scanner.nextInt();
        for (int i = 1; i <= j; i++) {
            s += i;
        }
        System.out.println("Сумма чисел " + s);
    }
}
