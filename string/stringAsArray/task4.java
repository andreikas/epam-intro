package com.epam.string.stringAsArray;

/* 4. В строке найти количество чисел. */
public class task4 {
    public static void main(String[] args) {
        String str = "I have 22 bananas , 121 pencils12, and 32 apples";
        str = str.replaceAll("[^0-9]+", " ");
        int o = str.trim().split(" ").length;
        System.out.println(o);
    }
}
