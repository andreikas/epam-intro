package com.epam.basics.branch;

/*1. Даны два угла треугольника (в градусах).
Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.*/

public class Task1 {
    public static void main(String[] args) {
        int alfa = 30;
        int betta = 60;
        if (alfa + betta < 180) {
            System.out.println("Треугольник существует");
            if (alfa == 90 || betta == 90 || 180 - alfa - betta == 90) {
                System.out.println("Треугольник прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
