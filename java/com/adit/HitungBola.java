package com.adit;

public class HitungBola{
    public static void main (String[]args){
        Bola bola = new Bola();

        bola.setJarijari(5);

        System.out.println("Volue :"+bola.getVolume());
        System.out.println("Luas :"+bola.getLuas());
    }
}
