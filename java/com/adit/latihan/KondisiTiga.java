package com.adit.latihan;

import java.util.Scanner;

public class KondisiTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        char grade;

        System.out.print("Masukan nilai : ");
        nilai = input.nextInt();

        if (nilai>=90){                 // nilai = kondisi bernilai booelan TRUE FALSE
            grade = 'A';
        } else if (nilai >= 80){
            grade = 'B';
        } else if (nilai >= 70){
            grade = 'C';
        } else if (nilai >= 60){
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Nilai = "+ grade);
    }
}
