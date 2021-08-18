package com.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner (System.in); //Membuat object scanf untuk membaca input dari user
        
        //Membuat variable
        int nilai, nilaibenar = 5;
        boolean tebakan;

        //Membuat operasi
        System.out.print("Masukkan nilai tebakan : ");
        nilai = scanf.nextInt();
        
        tebakan = (nilai == nilaibenar); //Operasi

        System.out.println("Tebakan anda : " + tebakan);

        //Operasi Aljabar Logika
        System.out.print("Masukkan nilai antara 5 dan 10 : ");
        nilai = scanf.nextInt();

        tebakan = (nilai > 5) && (nilai < 10); //Operasi

        System.out.println("Nilai yang anda masukkan : " + tebakan);
        scanf.close();
    }
}
