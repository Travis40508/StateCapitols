package com.company;

/**
 * Created by rodneytressler on 6/16/17.
 */
public enum LetterGrades {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    F("F");

    private String letter;

    LetterGrades(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }
}
