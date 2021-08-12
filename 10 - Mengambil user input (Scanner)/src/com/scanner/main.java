package com.scanner;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        Cara untuk mengambil user input adalah dengan membuat objek baru dengan menggunakan Class 'Scanner'
        Untuk menggunakan class Scanner maka perlu di import terlebih dahulu classnya, dengan cara menyisipkan syntax
        import java.util; pada bagian atas code setelah package.

        contoh :
                    - Scanner newObject = new Scanner(System.in) --> myObject dapat diganti sesuai yg diinginkan (dengan syarat tidak ada conflict)

        */

        Scanner scanf = new Scanner(System.in); // Membuat objek scanf menggunakan class Scanner, untuk digunakan sebagai pengambil user input
        
        int userinput; //Membuat variable yang nantinya akan digunakan untuk menyimpan data dari input user
        
        System.out.print("Masukkan input : ");
        userinput = scanf.nextInt(); // Menggunakan objek scanf untuk mengambil input dari user lalu menyimpan datanya ke dalam variable userinput 
        //nextInt() merupakan syntax untuk menentukan tipe input apa yang dimasukkan oleh user nantinya, pada kasus ini akan digunakan tipe data int.

        System.out.println("Input yang dimasukkan adalah " + userinput); // Menampilkan output dari variable userinput yang dimana merupakan input dari user
        
        scanf.nextLine(); //Digunakan agar perintah input setelah diatas tidak dilangkahi
        
        //Contoh lain menggunakan string
        String inputstring; 

        System.out.print("Masukkan Kata : ");
        inputstring = scanf.nextLine();

        System.out.println("Kata yang dimasukkan adalah : " + inputstring);

    }
}