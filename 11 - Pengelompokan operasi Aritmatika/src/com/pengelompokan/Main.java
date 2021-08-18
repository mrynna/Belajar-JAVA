package com.pengelompokan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pada operasi aritmatika perkalian/pembagian/modulus akan dijalankan terlebih dahulu kemudian penjumlahan & pengurangan
        Pengelompokan operasi aritmatika digunakan jika kita ingin menentukan operasi 
        aritmatika mana yang terlebih dulu dijalankan
        Berfungsi ketika kita ingin menjalankan Operasi Pertambahan (+) atau pengurangan (-) 
        terlebih dahulu kemudian operasi Perkalian (*) atau Pembagian (/) atau modulus (%)
        */

        //Cara untuk melakukan pengelompokan adalah dengan cara menambahkan tanda kurung '()' Pada operasi yang ingin dijalankan terlebih dahulu

        int a, b, c, hasil;
        a = 5;
        b = 2;
        c = 3;
        
        //Operasi ketika tidak dikelompokan
        hasil = a + b * c;
        System.out.printf("Hasil dari %d + %d x %d = %d\n", a, b, c, hasil);
        //Dimana jika perintah diatas dijalankan maka outputnya adalah 11, dikarenakan perkalian akan dijalankan duluan kemudian penjumlahan

        //Operasi ketika dikelompokan
        hasil = ( a + b ) * c; //Menambahkan tanda kurung pada a + b agar dijalankan terlebih dahulu
        System.out.printf("Hasil setelah dikelompokan %d + %d * %d = %d\n", a, b, c, hasil);
        //Ketika perintah diatas dijalankan maka outputnya 21 dikarenakan penjumlahan dijalankan kemudian perkalian

    }
}