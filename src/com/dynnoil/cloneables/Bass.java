package com.dynnoil.cloneables;

import java.util.Random;

/**
 * Created by krukov.ly on 31.07.2015.
 */
public class Bass implements Cloneables {

    private int countOfStrings;
    private int countOfFrets;

    public Bass() {
        System.out.println("Bass is ready for Rock!!!");
    }

    public Bass(int countOfStrings, int countOfFrets) {
        this.countOfStrings =countOfStrings;
        this.countOfFrets = countOfFrets;
    }

    public void printFields() {
        System.out.println("Count of strings: " + countOfStrings +
                "\nCount of frets: " + countOfFrets);
    }

    public Object toClone() {
        return new Bass(countOfStrings, countOfFrets);
    }
}
