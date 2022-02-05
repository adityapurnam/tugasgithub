package com.adit;

public class Kubus {
    private int sisi;
    private int volume;
    private int luaspermukaan;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getVolume() {
        volume = sisi * sisi * sisi;
        return volume;
    }


    public int getLuaspermukaan() {
        luaspermukaan = 6 * sisi * sisi;
        return luaspermukaan;
    }

}
