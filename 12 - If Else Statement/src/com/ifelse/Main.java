package com.ifelse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Membuat program cabang sederhana dengan if else statement
        Dengan if else maka kita bisa mengatur alur jalannya sebuah program

        Membuat cabang dapat dilakukan dengan cara

            if ( syarat(boolean) ){
                statement yang akan dijalankan apabila syarat bernilai true
            }

        untuk melakukan perintah/alur lain selain dari syarat true maka kita bisa menambahkan else

            if ( syarat(boolean) ){
                statement yang akan dijalankan apabila syarat bernilai true
            } else {
                statement yang akan dijalankan apabila syarat bernilai false 
            }

        Untuk menambahkan alur lain dengan syarat yang berbeda, maka kita bisa menggunakan else if
            
            if ( syarat(boolean) ){
                statement yang akan dijalankan apabila syarat bernilai true
            } else if ( syarat 2 (boolean)){
                statement yang akan dijalankan apabila syarat 2 bernilai true 
            } else if ( syarat 3 (boolean)){
                statement yang akan dijalankan apabila syarat 3 bernilai true
            } elese {
                statement yang akan dijalankan apabila tidak ada syarat yang terpenuhi (semua syarat bernilai false)
            }

        */

        Scanner scanf = new Scanner(System.in); //Membuat objek scanf untuk membaca input dari user
        
        int masukan; //Membuat variable masukan

        System.out.println("Membuat program bercabang");
        System.out.print("masukkan nilai : ");
        masukan = scanf.nextInt(); //Mengambil user input kemudian menyimpannya kedalam variable masukan

        //Membuat cabang
        if (masukan < 5 ){
            System.out.println("Anda memasukkan nilai lebih kecil dari 5");
        } else if (masukan >= 5 && masukan <= 15){
            System.out.println("Anda memasukkan nilai rentang 5 - 15");
        } else if (masukan > 15 && masukan <= 20){
            System.out.println("Anda memasukkan nilai rentang 15 - 20");
        } else {
            System.out.println("Anda memasukkan nilai lebih dari 20");
        }

        /*
            Ketika nilai yang kita masukkan lebih kecil dari 5 maka syarat pertama yang akan aktif yaitu masukan < 5
            maka outputnya adalah statement yang berada dalam kurung kurawal dari if statement
            namun ketika nilai yang kita masukkan selain dari syarat yang telah dibuat misalnya 21, maka statement yang
            berada dalam 'else' yang akan dijalankan.
        */

    }
}
