package com.Unary;

public class main{
    public static void main(String[] args) {
        //Unary = Operasi yang dilakukan pada satu variable saja

        //Unary mines dan plus (merubah nilai positif ke mines dan sebaliknya)
        int angka = 6;
        System.out.printf("\nIni adalah unary '-' dimana %d menjadi %d", angka, -angka); //Unary -
        System.out.printf("\nIni adalah unary '+' dimana %d menjadi %d", angka, +angka); //Unary +

        //Unary increment dan decrement (Operasi kenaikan (penambahan) dan penurunan (Pengurangan))
        
        //prefix increment/decrement dimana operasi ++/-- ditempatkan sebelum variable
        //postfix increment/decrement dimana operasi ++/-- ditempatkan sesudah variable
        /*
        Perbedaan prefix dan postfix adalah dimana : 
        prefix mengeksekusi perintah terlebih dahulu kemudian menampilkan outputnya
        postfix menampilkan output terlebih dahulu kemudian mengeksekusi perintah
        */

        System.out.printf("\nini adalah operasi increment prefix dimana %d menjadi %d", angka, ++angka); //Unary increment prefix (++) 
        angka = 6;
        System.out.printf("\nini adalah operasi increment postfix dimana %d menjadi %d", angka, angka++); //Unary increment postfix(++)
        angka = 6;
        System.out.printf("\nIni adalah operasi decrement prefix dimana %d menjadi %d", angka, --angka); //Unary decrement prefix(--)
        angka = 6;
        System.out.printf("\nIni adalah operasi decrement postfix dimana %d menjadi %d", angka, angka--); //Unary decrement postfix(--)
   
        //Unary boolean dengan ! untuk negasi
        boolean nilai = true;
        System.out.printf("\nnilai boolean = %s", nilai);
        System.out.printf("\nnilai boolean = %s", !nilai); //negasi nilai true sehingga menjadi false
    }
}