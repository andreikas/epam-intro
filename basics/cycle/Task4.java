package com.epam.basics.cycle;

/*3. Найти сумму квадратов первых ста чисел.*/
public class Task4 {
    public static void main(String[] args) {
        long p = 1L;
        for (long i = 1L; i <= 10L; i++) {
            p = p * (i * i);
        }
        System.out.println(p);
    }
}
