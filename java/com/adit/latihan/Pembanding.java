package com.adit.latihan;

import java.util.Scanner;

public class Pembanding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama : ");
        String id = input.nextLine();
        System.out.print("Masukan Password : ");
        String pass = input.nextLine();

        String berhasil = "Login Berhasil!";
        String gagal = "Login Gagal!";

        String login = id.equals("Adit") && pass.equals("123456") ? berhasil : gagal ;   //pake method .equals adalah pembanding,inputan Adit di simpan di variable ID. APAKAH ID dibandingkan sama dengan Adit (yg diinput)
                                                                                         // ada operator ternary membandingkan statment true & false
        System.out.println(">Login : "+login);
    }
}
