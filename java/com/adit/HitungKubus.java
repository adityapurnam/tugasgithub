package com.adit;

public class HitungKubus {
    public static void main(String [] args){
        Kubus kubus = new Kubus();

        kubus.setSisi(4);

        System.out.println("Volume :"+kubus.getVolume());
        System.out.println("Luas Permukaan :"+kubus.getLuaspermukaan());

    }
}
