package com.epam.string.stringAsArray;

/* 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case. */
public class task1 {
    public static void main(String[] args) {

        String[] camelCase = new String[]{"thisIsTest", "thisIsNewWord", "thisIsExercise"};
        String[] snake_case = new String[camelCase.length];

        String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";


        for (String str : camelCase) {
            System.out.println(str
                    .replaceAll(regex, replacement)
                    .toLowerCase());
        }

    }
}
