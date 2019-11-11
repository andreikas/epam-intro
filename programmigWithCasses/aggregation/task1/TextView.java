package com.epam.programmigWithCasses.aggregation.task1;

import java.util.List;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/
public class TextView {


    public void printTitle(Text text) {
        System.out.println(text.getTitle());
    }

    public void printText(Text text) {

        for (Sentence sentence : text.getText()) {
            String string = new String();
            for (Word word : sentence.getSentence()
            ) {
                string += word.getWord() + " ";

            }
            System.out.print(string.trim() + ". ");
        }
        System.out.println();
    }

    public void printNewText(Sentence sentence, Text text) {
        TextLogic textLogic = new TextLogic();
        textLogic.addText(sentence, text);

        printTitle(text);
        printText(text);
    }

}
