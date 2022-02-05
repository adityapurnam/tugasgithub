package com.adit.baru;

public class Conversi {
    public static void main(String[]args){
        String a ="10";

        int b = Integer.parseInt(a);
        System.out.println("ini adalah : "+ ((Object)b).getClass().getSimpleName());

        int x =10;
        String y = Integer.toString(x);
        System.out.println("ini :" + y.getClass().getSimpleName());

    }
}