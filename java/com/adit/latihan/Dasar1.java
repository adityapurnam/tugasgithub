package com.adit.latihan;

public class Dasar1 {
    public static void main (String[]args){
        String a ="30";
        int b = Integer.parseInt(a);
        System.out.println("A adalah :" + ((Object)b).getClass().getSimpleName());
    }
}
