package com.adit;

public class HitungPersegiPanjang {
    public static void main (String[] args){

        Persegipanjang persegipanjang = new Persegipanjang();

        persegipanjang.setPanjang(5);
        persegipanjang.setLebar(2);



        System.out.println("Luas : "+ persegipanjang.getLuas());
        System.out.println("Keliling : "+ persegipanjang.getKeliling());


    }
}

