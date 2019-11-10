package com.epam.string.stringAsArray;
/* 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить. */
public class task5 {
    public static void main(String[] args) {
        String str = "I have 22 bananas   , 121 pencils12,    and 32 apples";
        String regex = "\\s+";
        String replacement = " ";
        String newString = str.replaceAll(regex, replacement);
        System.out.println(newString);
    }
}
