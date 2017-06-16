package com.company;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Home {
    private Messages messages;
    private Responses responses;
    private AppLogic appLogic;

    public void init() {
        messages = new Messages();
        responses = new Responses();
        appLogic = new AppLogic();
        startApp();
    }

    private void startApp() {
        messages.greetUser();
        appLogic.startTest();
    }
}
