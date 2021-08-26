package com.whileloop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int awal, akhir;

        System.out.println("\n==Latihan While Loop==");
        System.out.println("\nMencari total nilai dari pernjumlahan yang berulang");
        System.out.print("Masukkan nilai awal : ");
        awal = masukan.nextInt();
        System.out.print("Masukkan nilai batas : ");
        akhir = masukan.nextInt();

        System.out.println("Nilai awal = " + awal);
        while(awal <= akhir){
            awal += awal;
            if(awal > akhir){
            }else{
            System.out.println("ditambah " + (awal-(awal/2)) +" menjadi " + awal);
            }
        }
        /*
        Jadi selama hasil dari nilai awal ditambah dengan nilai awal tidak melewati batas maka hasilnya akan ditaampilkan
        selama hasil nilai awal dikali 2 tidak melewati batas maka perulangan akan dijalankan
        contoh : nilai awal 2, nilai akhir 9
                maka : 
                    2 + 2 = 4
                    4 + 4 = 8
                    8 + 8 = 16

        aksi 8 + 8 akan tetap dijalankan dikarenakan kondisi while loop yang masih terpenuhi 
        yaitu nilai 8 (nilai akhir) lebih kecil dari 9 (nilai batas)  
        tetapi dikarenakan didalam program while loop ada sebuah perintah if else yang mengakibatkan
        apabila hasil dari nilai awal + nilai awal melebihi nilai batas maka outputnya tidak akan ditampilkan
        yang dimana mengakibatkan 8 + 8 = 16 tidak ditampilkan
        */
    }
}
