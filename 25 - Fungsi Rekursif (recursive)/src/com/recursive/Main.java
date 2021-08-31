package com.recursive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fungsi recursive adalah fungsi yang yaang mengembalikan fungsi itu sendiri
        // Prinsip kerjanya sama dengan while loop
        // Jika tidak diberi kondisi yang membuat looping nya berhenti maka bisa terjadi error, dikarenakan fungsi recursive ini menggunakan memory allocation
        /*
        Cara penggunaan :
            fungsi(parameter){
                statement;
                return fungsi(parameter);
            }
        */

        Scanner masukan = new Scanner(System.in);

        int parameter1, parameter2, hasil;

        System.out.println("");
        System.out.println("== Program sederhana Fungsi Recursive ==");
        System.out.print("Masukkan nilai kali : ");
        parameter1 = masukan.nextInt();
        System.out.print("Masukkan jumlah pengulangan : ");
        parameter2 = masukan.nextInt();
        System.out.println("");
        hasil = mengalikan(parameter1, parameter2);
        System.out.println(" = " + hasil);

    }
    private static int mengalikan(int nilai, int ulang){
        ulang --;
        System.out.print(nilai); 
        if(ulang == 0){
            return nilai;
        }else{
            System.out.print(" x ");
        }
        return nilai * mengalikan(nilai, ulang);
    }
}
