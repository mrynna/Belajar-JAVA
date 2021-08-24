package com.whileloop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        While loop pada bahasa pemrograman adalah sebuah perintah yang bertujuan untuk melakukan perulangan sesuai dengan kondisi boolean yang diberikan
        Penggunaan : 
            While (kondisi){
                Statement
            }
        */
        Scanner masukan = new Scanner(System.in);
        int i = 0;
        char trigger;
        boolean kondisi = true;
        while(kondisi){
            System.out.println("\nWhile loop ke-" + ++i);
            System.out.print("\nMasukkan n jika ingin berhenti : ");
            trigger = masukan.next().charAt(0);
            if (trigger == 'n' || trigger == 'N'){
                kondisi = false;
            }
        }
        System.out.println("Akhir dari program");
        masukan.close();

        /*
        Jika kondisi berilai true maka while loop akan terus berulang dan akan terus dijalankan sampai kondisi bernilai false
        kondisi akan bernilai false apabila kita memasukan nilai N pada input yang diberikan
        */
    }    
}
