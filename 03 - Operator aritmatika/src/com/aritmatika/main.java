package com.aritmatika;

public class main {
    public static void main(String[] args) {
        /*
        Operasi aritmatika ada
        1. Penjumlahan +
        2. Pengurangan -
        3. Perkalian *
        4. Pembagian /
        5. Modulus(Sisa bagi) %
        */

        //Hapus tanda "//" jika ingin melihat output yang lain.

        //Penjumlahan
        int a = 6;
        int b = 3;

        int hasil = a + b;

        System.out.println("Hasil dari a + b = " + hasil); //dengan Println (menggunakan variable hasil)
        //System.out.printf("Hasil dari a + b = %d", hasil); //dengan Prrintf (menngunakan variable hasil)
        //System.out.printf("\nHasil dari a + b = %d", a+b); //Dengan printf (tanpa menggunakan variable hasil)

        //Pengurangan
        
        int hasil2 = a - b;

        System.out.println("\nHasil dari " + a + " - " + b + " = " + hasil2); //dengan Println (menggunakan variable hasil2)
        //System.out.printf("Hasil dari %d + %d = %d", a, b, hasil2); //dengan Printf (Menggunakan variable hasil2)
        //System.out.printf("\nHasil dari %d + %d = %d", a, b, a+b); //dengan Printf (tanpa Menggunakan variable hasil2)

        //Perkalian
        int hasil3 = a * b;
        System.out.println("\nHasil dari " + a + " x " + b + " = " + hasil3);

        //Pembagian
        int hasil4 = a / b;
        System.out.println("\nHasil dari " + a + " : " + b + " = " + hasil4);

        //Modulus(Hasil bagi)
        int hasil5 = a % b;
        System.out.println("\nHasil dari " + a + " : " + b + " = " + hasil5);

        
        
    }
}
