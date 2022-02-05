package com.adit;

public class Persegipanjang {
    private int panjang;
    private int lebar;
    private int luas;
    private int keliling;


    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLuas() {
        luas = panjang * lebar;
        return luas;
    }


    public int getKeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }
}