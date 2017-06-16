package com.company;

import java.util.*;

/**
 * Created by rodneytressler on 6/16/17.
 */
public class AppLogic {
    private HashMap<String, String> hashMap;
    private Messages messages;
    private Responses responses;
    private List<String> stateList;
    private List<String> statesWrong;
    private int amountCorrect = 0;

    /**
     * Initializes all of our member variables.
     */
    public AppLogic() {
        statesWrong = new ArrayList<>();
        hashMap = new HashMap();
        responses = new Responses();
        messages = new Messages();
        loadHashMap();
        populateStateList();
    }


    /**
     * Populates our hashmap with key-value pairs.
     */
    private void loadHashMap() {
        hashMap.put("Alabama", "Montgomery");
        hashMap.put("Alaska", "Juneau");
        hashMap.put("Arizona", "Phoenix");
        hashMap.put("Arkansas", "Little Rock");
        hashMap.put("California", "Sacramento");
        hashMap.put("Colorado", "Denver");
        hashMap.put("Connecticut", "Hartford");
        hashMap.put("Deleware", "Dover");
        hashMap.put("Florida", "Tallahassee");
        hashMap.put("Georgia", "Atlanta");
        hashMap.put("Hawaii", "Honolulu");
        hashMap.put("Idaho", "Boise");
        hashMap.put("Illinois", "Springfield");
        hashMap.put("Indiana", "Indianapolis");
        hashMap.put("Iowa", "Des Moines");
        hashMap.put("Kansas", "Topeka");
        hashMap.put("Kentucky", "Frankfort");
        hashMap.put("Louisiana", "Baton Rouge");
        hashMap.put("Maine", "Augusta");
        hashMap.put("Maryland", "Annapolis");
        hashMap.put("Massachusetts", "Boston");
        hashMap.put("Michigan", "Lansing");
        hashMap.put("Minnesota", "Saint Paul");
        hashMap.put("Mississippi", "Jackson");
        hashMap.put("Missouri", "Jefferson City");
        hashMap.put("Montana", "Helena");
        hashMap.put("Nebraska", "Lincoln");
        hashMap.put("Nevada", "Carson City");
        hashMap.put("New Hampshire", "Concord");
        hashMap.put("New Jersey", "Trenton");
        hashMap.put("New Mexico", "Santa Fe");
        hashMap.put("New York", "Albany");
        hashMap.put("North Carolina", "Raleigh");
        hashMap.put("North Dakota", "Bismarck");
        hashMap.put("Ohio", "Columbus");
        hashMap.put("Oklahoma", "Oklahoma City");
        hashMap.put("Oregon", "Salem");
        hashMap.put("Pennsylvania", "Harrisburg");
        hashMap.put("Rhode Island", "Providence");
        hashMap.put("South Carolina", "Columbia");
        hashMap.put("South Dakota", "Pierre");
        hashMap.put("Tennessee", "Nashville");
        hashMap.put("Texas", "Austin");
        hashMap.put("Utah", "Salt Lake City");
        hashMap.put("Vermont", "Montpelier");
        hashMap.put("Virginia", "Richmond");
        hashMap.put("Washington", "Olympia");
        hashMap.put("West Virginia", "Charleston");
        hashMap.put("Wisconsin", "Madison");
        hashMap.put("Wyoming", "Cheyenne");
    }

    /**
     * Gives us an arraylist of states to compare to keys for the hashmap. and to quiz us over
     */
    private void populateStateList() {
        stateList = Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
                "Deleware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
                "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi",
                "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York",
                "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
                "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
                "West Virginia", "Wisconsin", "Wyoming");
    }


    /**
     * For every tick of i, it grabs a different state, compares it to the keys in the hashmap, and makes sure
     * that your answer is the same as the key.
     */
    public void startTest() {
        for (int i = 0; i < 50; i++) {
            messages.quizUser(stateList.get(i));
            String response = responses.getAnswer();
            checkAnswer(stateList.get(i), response);
        }
        messages.showWrongStatesAlert();
        for (String state : statesWrong) {
            messages.showWrongStates(state);
        }
        int percent = (amountCorrect * 100) / 50;
        calculateGrade(percent);
    }


    /**
     * The actual checking mentioned above comes from here.
     */
    public void checkAnswer(String state, String capitol) {
        String stateCapitol = hashMap.get(state);
        if (!(stateCapitol.toLowerCase().equals(capitol.toLowerCase()))) {
            statesWrong.add(state);
            messages.wrongAnswer(stateCapitol);
        } else {
            amountCorrect += 1;
            messages.correctAnswer();
        }
    }

    /**
     * Calculates letter grade based on score. Enum example.
     */
    private void calculateGrade(int percent) {
        String letterGrade;
        if (percent > 90) {
            letterGrade = LetterGrades.A.getLetter();
        } else if (percent > 80) {
            letterGrade = LetterGrades.B.getLetter();
        } else if (percent > 70) {
            letterGrade = LetterGrades.C.getLetter();
        } else if (percent > 60) {
            letterGrade = LetterGrades.D.getLetter();
        } else {
            letterGrade = LetterGrades.F.getLetter();
        }
        messages.giveScore(percent, letterGrade);
    }
}
