package com.adit;

public class Bola {
    private double jarijari;
    private double volume;
    private double luas;
    private static double phi = 3.14;

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getVolume() {
        volume = 1.3 * phi * jarijari;
        return volume;
    }

    public double getLuas() {
        luas = 4 * phi * jarijari;
        return luas;
    }


}
