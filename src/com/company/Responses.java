package com.company;

import java.util.Scanner;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Responses {
    private Scanner scanner;

    public Responses() {
        scanner = new Scanner(System.in);
    }

    public String getAnswer() {
        return scanner.nextLine().toLowerCase();
    }
}
