package com.epam.programmigWithCasses.aggregation.task1;
/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/


import java.util.Arrays;


public class TextMain {
    public static void main(String[] args) {
        Text text = new Text();
        text.setTitle("This is text title.");
        Sentence sentence = new Sentence(
                Arrays.asList(new Word("This"), new Word("is"), new Word("first"), new Word("sentence")));

        Sentence sentence2 = new Sentence(
                Arrays.asList(new Word("This"), new Word("is"), new Word("second"), new Word("sentence")));
        text.setText(Arrays.asList(sentence, sentence2));
        TextView textView = new TextView();
        textView.printTitle(text);
        textView.printText(text);

        Sentence sentence3 = new Sentence(
                Arrays.asList(new Word("This"), new Word("is"), new Word("third"), new Word("sentence")));

        textView.printNewText(sentence3, text);

    }
}
