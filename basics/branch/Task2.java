package com.epam.basics.branch;
/*2. Найти max{min(a, b), min(c, d)}.*/
public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int min_ab;
        int min_cd;
        int max;
        if (a >= b) {
            min_ab = b;
        } else {
            min_ab = a;
        }
        if (c >= d) {
            min_cd = d;
        } else {
            min_cd = c;
        }
        if (min_ab >= min_cd) {
            max = min_ab;
        } else {
            max = min_cd;
        }
        System.out.println(max);
    }
}
