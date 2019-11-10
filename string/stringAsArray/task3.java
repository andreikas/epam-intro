package com.epam.string.stringAsArray;

/* 3. В строке найти количество цифр. */
public class task3 {
    public static void main(String[] args) {
        String str = "I have 22 bananas , 121 pencils12, and 32 apples";
        str = str.replaceAll("[^0-9]+", "");
        int o = str.length();
        System.out.println(o);
    }
}
