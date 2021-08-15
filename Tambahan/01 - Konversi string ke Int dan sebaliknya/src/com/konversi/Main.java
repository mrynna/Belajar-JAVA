package com.konversi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Mengkonversi tipe data String ke Integer dan Sebaliknya
        Hal ini juga bisa digunakan untuk mengatasi skip pada saat mencoba mengambil input user setelah perintah nextInt kemudian nextLine, seperti pada materi 10 (utama).
        */

        /*Konversi Integer ke String dapat dilakukan dengan syntax 
                - Integer.toString(nama variable); -> Nama variable merupakan variable yang ingin dikonversi
        */
        
        Scanner scanf = new Scanner(System.in); //Membuat object scanf untuk digunakan sebagai pengambil user input
        System.out.print("Masukkan string (angka) yang ingin dikonversi kedalam bentuk Integer : ");
        int inputint = scanf.nextInt(); //Membuat variable inputint dengan tipe data integer kemudian melakukan scan dengan perintah scanf yang telah dibuat tadi
        String IntkeString; //Membuat variable IntkeString dengan tipe data string untuk menjadi tempat menyimpan string hasil konversi dari variable inputint.
        IntkeString = Integer.toString(inputint); // Syntax untuk mengubah Integer ke String

        System.out.print("Sebelum dikonversi : " + inputint); //Menampilkan output inputint(Input user)
        System.out.println(" | " + Integer.valueOf(inputint).getClass().getSimpleName()); //Menampilkan tipe data dari variable inputint
        System.out.print("Setelah dikonversi : " + IntkeString); //Menampilkan output IntkeString (Hasil Konversi)
        System.out.println(" | " + IntkeString.getClass().getSimpleName()); //menampilkan jenis tipe data dari variable IntkeString
        scanf.nextLine();
        
        /*Konversi String ke Integer dapat dilakukan dengan syntax 
                - Integer.parseInt(nama variable); -> Nama variable merupakan variable yang ingin dikonversi
        */
        
        System.out.print("Masukkan angka yang ingin dikonversi kedalam bentuk string : ");
        String inputstring = scanf.nextLine(); //Menagambil input dari user dan menyimpannya kedalam varible inputstring
        int StringkeInt = Integer.parseInt(inputstring); //Konversi inputstring ke bentuk String lalu menyimpannya kedalam variable StringkeInt
        System.out.print("Sebelum dikonversi : " + inputstring); //Menampilkan output variable inputstring
        System.out.println(" | " + inputstring.getClass().getSimpleName()); //Menampilakan jenis tipe data dari variable inputstring
        System.out.print("Setelah dikonversi : " + StringkeInt); //Menampilkan output variable StringkeInt
        System.out.println(" | " + Integer.valueOf(StringkeInt).getClass().getSimpleName()); //Menampilkan jenis tipe data dari variable StringkeInt

        //Konversi Ini juga bisa dilakukan pada tipe data lain.

    }
}
