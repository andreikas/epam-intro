package com.epam.programmigWithCasses.aggregation.task1;
/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/
import java.util.List;

public class Sentence {
    private List<Word> sentence;

    public Sentence() {
    }

    public Sentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }
}
