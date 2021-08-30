package com.method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Pada JAVA sebenarnya istilah function dikenal sebagai method
        method ini dasarnya berguna untuk melakukan sebuah perintah sesuai dengan statement yang terkandung di dalamnya
        Method ini dapat mempunyai nilai kembalian dan juga bisa tidak mempunyai nilai kembalian
        Peletakan method/function ini diletakkan diluar fungsi/method utama yaitu void main()
        Cara membuat function
        Dengan nilai kembalian(return) :
            static tipe_data_kembalian nama_fungsi(nilai_referensi){
                statement;
                retrun variable;
            }
            contoh membuat method/fungsi kuadrat

            static int kuadrat(int input){
                int hasil = input * input;
                return kuadrat;
            }

        Fungsi kemudian nantinya dapat dipanggil pada fungsi utama kita untuk dijalankan
        cara panggil
            nama_fungsi(nilai_referensi)
        */
        Scanner masukan = new Scanner(System.in);
        
        float sisi;
        float luas;
        System.out.println("Program sederhana membuat fungsi");
        System.out.println("== Program Kalkulator luas persegi ==");
        System.out.print("Masukkan panjang sisi : ");
        sisi = masukan.nextFloat();
        
        //Memanggil fungsi
        luas = persegi(sisi);
        System.out.println("Luas = " + luas);
    }

    //Membuat fungsi/method
    static float persegi(float input){
        float hasil = input * input;
        return hasil;
    }
}
