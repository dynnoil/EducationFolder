package com.dynnoil.cloneables;

/**
 * Created by krukov.ly on 31.07.2015.
 */
public class Gang implements Cloneables {

    private Guitar rythmGuitar;
    private Guitar soloGuitar;
    private Drums drums;
    private Bass bass;

    public Gang() {
        System.out.println("Gang is ready for rock!!!");
    }

    public Gang(Guitar rythmGuitar, Guitar soloGuitar, Bass bass, Drums drums) {
        this.rythmGuitar = rythmGuitar;
        this.soloGuitar = soloGuitar;
        this.drums = drums;
        this.bass = bass;
    }

    /**
     * Метод выводит значения всех полей
     * класса
     */
    public void printAboutGang() {

        System.out.println("Rythm guitar:");
        rythmGuitar.printFields();
        System.out.println("Solo guitar:");
        soloGuitar.printFields();
        System.out.println("Bass:");
        bass.printFields();
        System.out.println("Drums:");
        drums.printFields();
    }
    public Object toClone() {

        Gang cloned = (Gang) new Gang();
        cloned.rythmGuitar = (Guitar) rythmGuitar.toClone();
        cloned.soloGuitar = (Guitar) soloGuitar.toClone();
        cloned.bass = (Bass) bass.toClone();
        cloned.drums = (Drums) drums.toClone();

        return cloned;
    }
}
