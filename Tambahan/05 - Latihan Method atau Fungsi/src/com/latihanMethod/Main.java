package com.latihanMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int panjang, lebar, nilaiLuas, nilaiKeliling;
        boolean kondisi = false;
        System.out.println("\nLatihan Fungsi atau method");
        System.out.println("== Program untuk menggambar persegi dan menghitung luas, kelilingnya ==");
        do{
            System.out.println();
            System.out.print("Masukkan Panjang : ");
            panjang = masukan.nextInt();
            System.out.print("Masukkan lebar : ");
            lebar = masukan.nextInt();
            if (panjang <= lebar){
                System.out.println("\nPanjang harus lebih besar dari lebar !!!");
                kondisi = true;
            }else{
                kondisi = false;
            }
        }while(kondisi == true);
        System.out.println("\n");

        //Memanggil fungsi
        gambar(panjang, lebar);
        nilaiLuas = luas(panjang, lebar);
        nilaiKeliling = keliling(panjang, lebar);

        System.out.println("");
        System.out.println("Luas     = " + nilaiLuas);
        System.out.println("Keliling = " + nilaiKeliling);

        
    }

    //Membuat fungsi

    //Fungsi untuk menggambar persegi
    private static void gambar(int x, int y){
        for(int i = 0; i < y; i++ ){
            for(int j = 0; j < x; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //Fungsi untuk menghitung luas
    private static int luas(int x, int y){
        int hasil = x * y;
        return hasil;
    }

    //fungsi untuk menghitung keliling
    private static int keliling(int x, int y){
        int hasil = (x + y) * 2;
        return hasil;
    }
}
