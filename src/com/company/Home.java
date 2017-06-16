package com.company;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class Home {
    private Messages messages;
    private Responses responses;
    private AppLogic appLogic;

    /**
     * Instantiates class instances to be used.
     */
    public void init() {
        messages = new Messages();
        responses = new Responses();
        appLogic = new AppLogic();
        startApp();
    }

    /**
     * Starts up the app. Since this is a very logic-heavy app, most of the work will be
     * done in the applogic class.
     */
    private void startApp() {
        messages.greetUser();
        appLogic.startTest();
    }
}
