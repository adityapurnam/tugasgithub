package com.adit.baru;

import java.util.Scanner;

public class Scneer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("===BIODATA DIRI");
    System.out.print("Nama : ");
    String nama = input.nextLine();

    System.out.print("Umur : ");
    int umur = input.nextInt();

    System.out.print("Alamat :");
    String alamat = input.next();


    System.out.println("Nama : " + nama);
    System.out.println("Umur : " + umur);
    System.out.println("Alamat : " + alamat);
  }
}