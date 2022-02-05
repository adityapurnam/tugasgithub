package com.adit.latihan;

public class CobaIfElse {
    private int nilai;

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public void cetakHuruf() {
        if (nilai >= 91 && nilai <= 100) {
            System.out.println("Nilai A");
        } else if (nilai >= 81) {
            System.out.println("Nilai B");
        } else if (nilai >= 71) {
            System.out.println("Nilai C");
        } else if (nilai >= 61) {
            System.out.println("Nilai D");
        } else if (nilai >= 0) {
            System.out.println("Nilai E");
        }
    }
}