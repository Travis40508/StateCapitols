package com.company;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Messages {
    public void greetUser() {
        System.out.println("Welcome to the state Capitols test! Users will be \n " +
                "graded on their ability to answer all 50 state capitols on a " +
                "scale of A-F (100%-0%). Make sure you spell the capitols correctly. Good luck!");
    }

    public void quizUser(String state) {
        System.out.println("What is the capitol of " + state + "?");
    }

    public void wrongAnswer(String stateCapitol) {
        System.out.println("Wrong! The correct answer is " + stateCapitol);
    }

    public void correctAnswer() {
        System.out.println("That's correct!");
    }

    public void showWrongStates(String state) {
        System.out.println(state);
    }

    public void showWrongStatesAlert() {
        System.out.println("Here is a list of the states you missed.");
    }

    public void giveScore(int percent, String letterGrade) {
        System.out.println("You scored a " + percent + "%. This means you got a(n) " + letterGrade + "!");
    }
}
