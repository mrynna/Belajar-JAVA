package com.konversi;

public class main{
    public static void main(String[] args) {
        
        //Program konversi tipe data
        int nilaiInt = 500; // 32-bit

        //Mengkonversi tipe data ke rentang yang lebih besar 
        long nilaiLong = nilaiInt; // 32 - 64 bit
        System.out.println("Nilai long = " + nilaiLong);

        //Mengkonversi tipe data ke rentang lebih kecil
    
        //byte nilaiByte = nilaiInt; // > ini salah dikarenakan tidak dapat megkonversi ke rentang lebih kecil    
        //diperlukan casting untuk itu > menambahkan (byte) di awal variable yang ingin dikonversi
        byte nilaiByte = (byte) nilaiInt; /* Berhasil tetapi nilainya akan ngaco (alias berulang dikarenakan rentang 
        nilai byte adalah -128 - 127, sedangkan nilai yang ingin dikonversi bernilai 500)
        Sehingga nilainya akan berulang di rentang byte
        Maka dari itu jika ingin mengkonversi nilai ke rentang yang lebih kecil maka diusahakan nilainya berada di rentang tipe data yang ingin dikonversi*/
        System.out.println("Nilai Byte = " + nilaiByte);

        //Casting

        /*Casting diperlukan saat ingin mengkonversi ke tipe data yang diinginkan agar pembacaannya sesuai
        berfungsi ketika mengkonversi bilangan bulat ke bilangan pecahan
        */

        int a = 20, b = 15;
        float hasil, hasilcasting;

        hasil = a/b; //hasil tanpa casting
        hasilcasting = (float) a/b; //hasil dengan casting (menambahkan (float))
        System.out.println("Hasil " + a + " : " + b + " Tanpa casting = " + hasil);
        System.out.println("hasil " + a + " : " + b + " dengan casting = " + hasilcasting);


    }
}