package com.adit.latihan;

public class OperatorAssig {
    public static void main(String[] args) {
        //1 basic
        //int x = 10;

        //aritmatika + assigngmn ==> +=, -=, /=, *=

        //x += 4;         //cara singkat
        //x = x + 4;    //cara ribet
        //System.out.println(x);

        //2 increment & decrement
        int a = 0;
        a++;            //cara super singkat cetak a terus tambah nilai 1
        //a +=2;        //cara singkat || jangan sampai kebalik a =+ 2; ==>akan hasilnya 2
        //a = a + 3;    //cara ribet
        System.out.println(a++);  //prefix cetak dulu baru di tambah
        System.out.println(++a);  //postfix tambah baru cetak

    }
}
