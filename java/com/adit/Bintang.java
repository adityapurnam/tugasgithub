package com.adit;

import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah baris :");
        int baris = scanner.nextInt();


        for (int i = 0; i <= baris; i++) {
            for (int j = 1; j <= baris-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//input baris 5. i = 0 . apakah i kurangdari sama dengan 5 TRUE. maka pindah ke kondisi J. maka J diinisiasi
//di check di for J. J = 1 .apakah J kurangdari sama dengan 4 (1<=4) ===> TRUE maka cetak spaci
//for J di increment dan dilakukan looping sampai mencetak kondisi (1<=0). maka akan ke kondisi for K
//for K mencetak * dan cetak baris baru dan mulai looping dari awal