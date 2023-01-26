package com.array;

import java.util.Arrays; // Library array pada java

public class Main {

    public static void main(String[] args){
        /*
         * Array pada JAVA adalah sebuah object
         * tidak seperti dengan data primitif (int a = 2) yang ada di ranah memory stack yang datanya akan disimpan
           pada memory secara berurutan
         * array ranahnya memory heap yang dimana komponennya belum jelas berapa jumlahnya, sehingga komponen
           array disimpan pada memory secara random yang membuatnya disimpan dalam bentuk address
           sehingga kita bisa membuat array yang komponennya itu belum jelas berapa jumlahnya
         * Data pada array itu mempunyai index, yang dimana index merepresentasikan posisi/lokasi dari data tersebut
           Indeks dimulai dari 0
         * misalnya             
                                  int[] arrayAngka = {3, 6, 3, 4, 5}; -> Array
                                                      0  1  2  3  4   -> Index          
           indeks 0 = 3, indeks 1 = 6 dst
         * Sehingga jika kita ingin memanggil data dari array maka yang kita panggil adalah indeksnya
         */

        System.out.println("");

        /*
         * Membuat array
          
           assignment
                tipe_data[] nama_array = {data, dipisahkan dengan koma};   ==   tipe_data nama_array[] = {data, dipisahkan dengan koma};
                int arrayAngka = {1,2,3,4,5};
         */ 
        System.out.println("Assignment array");
        int[] angka = {3, 5, 2, 6, 7}; // Membuat array angka dengan tipe data integer
        System.out.println(angka); // Memprint array angka pada terminal yang dimana keluarannya adalah address dari array angka
        int a = angka[3]; // Membuat variabel int a dengan nilainya mengambil dari indeks ke 3 array angka 
        System.out.println("Data pada array angka yang ada pada indeks ke 3 = " + a); // Menampilkan output variable a pada terminal
        System.out.println("Data pada array angka yang ada pada indeks ke 1 = " + angka[1]); // Menampilkan nilai indeks ke 1 dari array angka
        /*
         * Deklarasi
                tipe_data[] nama_array = new tipe_data[jumlah_data];
                int[] arrayBaru = new int[10];
           
           Nilai default data dari array yang hanya di deklarasikan adalah 0
         */
        System.out.println("\nDeklarasi array");
        int[] arrayBaru = new int[4]; // Mendeklarasikan array dengan jumlah data = 4

        System.out.println("Data pada array angka yang ada pada indeks ke 0 = " + arrayBaru[0]); // Menampilkan data array pada indeks ke 0
        System.out.println("Data pada array angka yang ada pada indeks ke 1 = " + arrayBaru[1]); // Menampilkan data array pada indeks ke 1
        System.out.println("Data pada array angka yang ada pada indeks ke 2 = " + arrayBaru[2]); // Menampilkan data array pada indeks ke 2
        System.out.println("Data pada array angka yang ada pada indeks ke 3 = " + arrayBaru[3]); // Menampilkan data array pada indeks ke 3

        //Memberi/mengganti/menimpa nilai/data pada array
        arrayBaru[2] = 10; // Memberi nilai pada indeks 2 arrayBaru
        arrayBaru[1] = 3; // Memberi nilai pada indeks 1 arrayBaru

        System.out.println("\nData pada arrayBaru setelah diberi nilai");
        System.out.println("Data pada array angka yang ada pada indeks ke 0 = " + arrayBaru[0]); // Menampilkan data array pada indeks ke 0
        System.out.println("Data pada array angka yang ada pada indeks ke 1 = " + arrayBaru[1]); // Menampilkan data array pada indeks ke 1
        System.out.println("Data pada array angka yang ada pada indeks ke 2 = " + arrayBaru[2]); // Menampilkan data array pada indeks ke 2
        System.out.println("Data pada array angka yang ada pada indeks ke 3 = " + arrayBaru[3]); // Menampilkan data array pada indeks ke 3

        // Menggunakan library Arrays pada JAVA untuk mengubah array menjadi string
        System.out.println("\nMerubah array menjadi string menggunakan library Arrays");
        System.out.println(Arrays.toString(arrayBaru)); // Mengubah array menjadi sebuah string
        
    }
}