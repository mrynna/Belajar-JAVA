package com.switchcase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Contoh penggunaan switch case
        /*
        Switchcase dapat berfungsi layaknya ifelse hanya saja switchcase tidak se flexible ifelse
        syntax :

            switch(ekspresi){
                case kondisi/syarat:
                    statement
               default:
                    statement

            }
            Ekspresi berupa variable yang ingin dijadikan sebagai patokan
            kondisi/syarat case berupa nilai/data dari variable
            statement merupakan perintah yang akan dijalanka apabila case bernilai true

            Adapun case default adalah case yang dijalankan apabila semua case bernilai false

            Pada switchcase ketika sebuah case bernilai true maka dimulai dari case itu, case setelahnya akan dijalankan juga
            maka dari itu perintah break; setelah akhir statement sebuah case diperlukan untuk menghentikan agar yang dijalankan case itu saja.

        */
    
    String inputnama;
    Scanner scanf = new Scanner(System.in);

    System.out.println("Contoh program switchcase sederhana");
    System.out.println("\nDaftar Mahasiswa : ");
    System.out.println("    1. Alman");
    System.out.println("    2. Wahyu");
    System.out.println("    3. Gazen");
    System.out.print("\nMasukkan nama mahasiswa yang ingin diperiksa datanya : ");
    inputnama = scanf.nextLine();
    System.out.println("");

    switch(inputnama){
        case "Alman":
            System.out.println("    Nama : Alman");
            System.out.println("    NIM  : 1328731");
            System.out.println("    Asal : Bantimurung");
            System.out.println("    Hobi : Berenang");
            break; //Berfungsi agar setelah statement case alman dijalankan maka case lain setelah alman tidak dijalankan lagi
        case "Wahyu":
            System.out.println("    Nama : Wahyu");
            System.out.println("    NIM  : 1325312");
            System.out.println("    Asal : Bekasi");
            System.out.println("    Hobi : Menyayi");
            break;
        case "Gazen" :
            System.out.println("    Nama : Gazen");
            System.out.println("    NIM  : 1326545");
            System.out.println("    Asal : Palopo");
            System.out.println("    Hobi : Break Dance");
            break;
        default:
            System.out.println("Mahasiswa dengan nama tersebut tidak terdaftar");
    }
    
    System.out.println("\nAkhir dari program");

    }
}
