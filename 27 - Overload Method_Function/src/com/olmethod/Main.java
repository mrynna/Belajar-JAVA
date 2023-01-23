package com.olmethod;

/*
*Overload Method (Function)* 
    Membuat sebuah method yang dimana argument nya tidak tetap (bisa berubah-berubah)
    Berfungsi ketika kita ingin membuat method dengan nama yang sama tetapi argumennya tidak tetap
    Caranya yaitu membuat kembali method dengan nama sama tetapi argumennya diubah.
*/

public class Main {
    public static void main(String[] args) {
        tampilnilai(10); // Memanggil method tampilnilai dengan argument Integer
        tampilnilai(14.5f); // Memanggil method tampilnilai dengan argument Float

        int hasil1 = tambah(5, 6); // Memanggil method tambah dengan argument Integer dan menyimpan nilainya ke hasil1
        float hasil2 = tambah(6.5f, 5.4f); // Memanggil method tambah dengan argument Float dan menyimpan nilainya ke hasil2

        System.out.println(hasil1);
        System.out.println(hasil2);
    }

    // Membuat fungsi tampilnilai dengan parameter nilai float
    private static void tampilnilai(float nilaiFloat) {
        System.out.println(nilaiFloat);
    }

    // Membuat fungsi tampilnilai dengan parameter nilai integer
    private static void tampilnilai(int nilaiInt) {
        System.out.println(nilaiInt);
    }

    /*
     * Dari kedua method diatas dapat diketahui namanya sama tetapi parameternya
     * berbeda
     */

    private static int tambah(int nilaiInt, int nilaiInt2) {
        return nilaiInt + nilaiInt2;
    }

    private static float tambah(float nilaiFloat, float nilaiFloat2) {
        return nilaiFloat + nilaiFloat2;
    }
}
