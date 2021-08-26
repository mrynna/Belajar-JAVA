package com.dowhile;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*  
        Adalah while loop yang dimana aksi akan dijalankan pertama kali terlebih dahulu kemudian melihat kondisi untuk menjalankan aksi berikutnya
        Jadi walaupun kondisi awal adalah false maka statement akan tetap dijalankan pertama kali
        Cara penggunaan : 
                            do{
                                statement aksi
                            }while(kondisi);
        */
        Scanner masukan = new Scanner(System.in);
        char kondisi;
        int i = 1;

        System.out.println("\n==Program Do While Loop Sederhana==");
        System.out.println("\nAwal dari program\n");

        do{
            System.out.println("Aksi dijalankan yang ke-" + i++);
            System.out.print("Masukkan huruf y jika ingin melanjutkan perulangan : ");
            kondisi = masukan.next().charAt(0);
        }while(kondisi == 'y' || kondisi == 'Y');

        System.out.println("\nPerulangan berakhir");
        System.out.println("Program berakhir");
    }
}