package com.company;

import java.util.Scanner;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Responses {
    private Scanner scanner;

    /**
     * Initializes scanner for user response.
     */
    public Responses() {
        scanner = new Scanner(System.in);
    }

    /**
     * Grabs the user's answer. Makes it lower case so casing doesn't matter. We use nextLine instead
     * of just next to account for spaces. It grabs the entire line's answer and not just the first word.
     */
    public String getAnswer() {
        return scanner.nextLine().toLowerCase();
    }
}
