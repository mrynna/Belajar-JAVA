package com.methodvoid;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // fungsi yang menggunakan void adalah sebuah fungsi yang tidak mempunyai nilai kembalian
        // Cara penggunaannya adalah :
            /**
            static void nama_fungsi(variable_input){
                statement
            } 
            contoh : 
            static void akucinta(String input){
                System.out.println("Aku cinta " + input);
            }
            */

        Scanner masukan = new Scanner(System.in);
        
        String panggil;
        System.out.println("Program sederhana membuat fungsi Void");
        System.out.print("Masukkan nama yang diinginkan : ");
        panggil = masukan.next();

        // Memanggil fungsi/method
        nama(panggil);

        //Contoh dua menghitung kuadrat
        float nilai;
        System.out.println("\nContoh dua");
        System.out.print("Masukkan nilai yang ingin dikuadratkan : ");
        nilai = masukan.nextInt();
        kuadrat(nilai);

    }
    // membuat fungsi/method
    static void nama(String input){
        System.out.println("Anda memasukkan nama : " + input);
    }

    static void kuadrat(float input){
        float hasil = input * input;
        System.out.println("Hasil kuadrat dari " + input + " = " + hasil);
    }
}