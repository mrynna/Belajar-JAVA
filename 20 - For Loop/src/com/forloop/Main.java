package com.forloop;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /* 
        Jenis loop yang dimana mempunyai increment/decrement sebagai step up/down nilai yang 
        nantinya dipakai sebagai sebuah syarat pemenuhan kondisi dari looping. 
        cara penggunaan :
                            for (inisialisasi; kondisi; step nilai){
                                statement aksi
                            }

        */
        Scanner masukan = new Scanner(System.in);
        int kondisi;
        
        System.out.println("\n==Contoh program For Loop sederhana==");
        System.out.print("Masukkan jumlah perulangan yang ingin dilakukan : ");
        kondisi = masukan.nextInt();
        System.out.println("");

        for(int i = 1; i <= kondisi; i++){
            System.out.println("Aksi dijalankan yang ke-" + i);
        }
        /*
            looping akan dilakukan selama nilai i lebih kecil sama dengan nilai kondisi, dimana nilai awal i 
            adalah 1 dan akan terus bertambah karena step nilai increment i yang dimana akan bertambah 
            sampai memenuhi kondisi.
        */

        System.out.println("\nAkhir dari looping");
        System.out.println("Program berakhir");

    }
}