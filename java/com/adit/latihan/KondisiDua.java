package com.adit.latihan;

import java.util.Scanner;

public class KondisiDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan ID : ");
        String id = input.nextLine();
        System.out.print("Masukan Password : ");
        String pass = input.nextLine();

        String berhasil = "Login Berhasil!";
        String gagal = "Login Gagal!";

        if ((id.equals("Adit")) && (pass.equals("123456"))){
            System.out.println(berhasil);
        }else {
            System.out.println(gagal);
        }
    }
}
