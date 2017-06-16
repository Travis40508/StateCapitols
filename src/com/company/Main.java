package com.company;

public class Main {

    public static void main(String[] args) {
        /** We initialize a custom class to break us out of this static context. */
        Home home = new Home();
        home.init();
    }
}
