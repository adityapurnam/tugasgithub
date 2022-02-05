package com.adit;

public class Segitiga {
    private int alas;
    private int tinggi;
    private double luas;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        luas = 0.5 * alas * tinggi;
        return luas;
    }

}
