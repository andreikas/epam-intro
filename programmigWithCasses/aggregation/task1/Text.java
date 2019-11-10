package com.epam.programmigWithCasses.aggregation.task1;

public class Text {
    private Sentence sentence;
    private Word word;

    public Text(Sentence sentence, Word word) {
        this.sentence = sentence;
        this.word = word;
    }

    public Text() {
    }

    public Sentence getSentence() {
        return sentence;
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentence=" + sentence +
                ", word=" + word +
                '}';
    }
}
