package com.belajar;

public class belajar01 {
    public static void main(String[] args) {

        /*Print tipe 1 
        Menampilkan kemudian membuat baris baru
        System.out.println(""); . dengn ln diakhir
        */

        System.out.println("Mencoba-cooba");
        System.out.println("Menampilkan lalu memberi baris baru");

        /*Print tipe 2
        Menampilkan tanpa membuat baris baru
        System.out.print(""); > Tanpa ln
        */

        System.out.print("Ini merupakan print tanpa membuat baris baru");
        System.out.println("Tanpa baris baru dan langsung tersambung");
        
        /*Print tipe 3
        Menampilkan dengan memberi format
        System.out.printf(""); > dengan f diakhir
        */

        System.out.printf("Ini merupakan untuk menampilkan angka seperti %d", 340); //%d integer
        System.out.printf("Dan seperti nomor %f", 30.5); //%f float

        /*
        Memberi baris baru dengan menggunakan "\n"
        System.out.print("\n"); > dengan menambahkan \n pada setiap tempat yang ingin diberi baris baru
        dapat digunakan disemua tipe print
        */

        System.out.print("\n mengunakan '/n' (garis miring terbalik) sehingga memberi baris baru");
        System.out.printf("\n dengan '/n' (garis miring terbalik) maka bisa diberi baris baru %d", 1);

    }
}
