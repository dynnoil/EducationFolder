package com.dynnoil.cloneables;

/**
 * Created by krukov.ly on 31.07.2015.
 */
public class Drums implements Cloneables {

    private int countOfDrums;

    public Drums() {
        System.out.println("Drums is ready for rock!!!");
    }

    public Drums(int countOfDrums) {
        this.countOfDrums = countOfDrums;
    }

    public void printFields() {
        System.out.println("Count of drums: " + countOfDrums);
    }

    public Object toClone() {
        return new Drums(countOfDrums);
    }
}
