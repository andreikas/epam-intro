package com.epam.string.stringAsArray;

/* 2. Замените в строке все вхождения 'word' на 'letter'. */
public class task2 {
    public static void main(String[] args) {
        String str = "Hello word";
        str.replace("word", "letter");
        System.out.println(str);
    }
}
