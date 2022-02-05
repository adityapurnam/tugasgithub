package com.adit.latihan;

import java.util.Scanner;

public class RunCobaIfElse {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("input angka :" );
        int number = input.nextInt();

        CobaIfElse cobaIfElse = new CobaIfElse();
        cobaIfElse.setNilai(number);
        cobaIfElse.cetakHuruf();



    }
}
