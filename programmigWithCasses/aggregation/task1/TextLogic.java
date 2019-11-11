package com.epam.programmigWithCasses.aggregation.task1;
/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/
import java.util.ArrayList;
import java.util.List;

public class TextLogic {
    public TextLogic() {
    }

    public void addText(Sentence sentence, Text text) {
        List<Sentence> sentenceList= new ArrayList<>(text.getText());
        sentenceList.add(sentence);
        text.setText(sentenceList);
    }

}
