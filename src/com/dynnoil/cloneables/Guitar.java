package com.dynnoil.cloneables;


import java.util.Random;

/**
 * Created by krukov.ly on 31.07.2015.
 */
public class Guitar implements Cloneables {

    private int countOfStrings;
    private int countOfFrets;

    public Guitar() {
        System.out.println("Guitar is ready for rock!!!");
    }

    public Guitar(int countOfStrings, int countOfFrets) {
        this.countOfFrets = countOfFrets;
        this.countOfStrings = countOfStrings;
    }

    public void changeParamets() {
        Random rand = new Random();
        countOfFrets = rand.nextInt(12);
        countOfFrets = rand.nextInt(28);
    }

    public void printFields() {
        System.out.println("Count of strings: " + countOfStrings +
                "\nCount of frets: " + countOfFrets);
    }
    public Object toClone() {
        return new Guitar(countOfStrings, countOfFrets);
    }
}
