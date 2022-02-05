package com.adit.latihan;

public class Dasar {
    public static void main (String[]args){

        /* Konversi tipe data
         String ==> Integer */

         String a = "50";

         int b = Integer.parseInt(a); //parseInt method ubah ke integer
            System.out.println("A adalah : " + ((Object)b).getClass().getSimpleName()); // objek dari b kita AMBIL pakaigetclass terus CETAK pakai GET simplename

        //Integer ==> String
         int x = 100;

         String y = Integer.toString(x); //String y = String.valueOf(x);<====bisa juga pakai ini toString method ubah ke string
             System.out.println("X adalah : " + y.getClass().getSimpleName()); // y.getClass karena udah STRING
    }
}
