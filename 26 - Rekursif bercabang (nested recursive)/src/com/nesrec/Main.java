package com.nesrec;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        int parameter, hasil;

        System.out.println("");
        System.out.println("Program sederhana Rekursif bercabang");
        System.out.println("Fibbonacci menggunakan fungsi rekursif");
        System.out.print("Masukkan nilai ke-n akhir : ");
        parameter = masukan.nextInt();
        hasil = fibbo(parameter, "atas");
        System.out.println("");
        System.out.println("nilai fibonacci ke-" + parameter + " = " + hasil);
    }

    private static int fibbo(int n, String cabang){
        System.out.println("Cabang " + cabang);
        System.out.println("F(" + n + ")");
        if(n == 1 || n == 0){
            return n;
        }else{
            return fibbo(n-1, "kiri") + fibbo(n - 2, "kanan");
        }

        //Semakin tinggi nilai n, maka semakin tinggi pula memori yang dibutuhkan
        //Jadi rekursif tidak terlalu optimal untuk penggunaan apabila cabangnya banyak
    }
}