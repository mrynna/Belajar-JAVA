package com.nested;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Yang dimaksud dengan Nested If adalah 
        sebuah fungsi/perintah if else yang berada di dalam fungsi if else
        Ini berguna ketika kita ingin membuat sebuah syarat yang syarat diatasnya/sebelumnya telah terpenuhi.
        */

        Scanner scanf = new Scanner(System.in);

        int masukan;

        System.out.println("Membuat program nested if sederhana");
        System.out.print("Masukkan nilai 10 : ");
        masukan = scanf.nextInt();

        if (masukan == 10 ){
            System.out.println("Anda memenuhi syarat pertama");
            System.out.print("Masukan nilai 5 : ");
            masukan = scanf.nextInt();
            if(masukan == 5){
                System.out.println("Anda mememnuhi dua syarat");
            }else{
                System.out.println("Nilai yang anda masukkan bukan 5");
                System.out.println("Anda hanya memenuhi syarat pertama");
            }
        }else{
            System.out.println("Nilai yang anda masukan bukan 10");
            System.out.println("Anda tidak memenuhi syarat apapun");
        }

    /*
    - Ketika pada input pertama user memasukkan nilai selain 10, maka program akan langsung menjalankan else yang paling bawah
    - Ketika pada input pertama user memasukkan nilai 10, maka syarat dari if yang pertama terpenuhi maka action/statement
      yang ada di dalam if pertama tadi akan dijalankan
    - Ketika memnuhi syarat pertama maka akan diminta memasukkan nilai 5, jika memasukkan nilai 5 maka if cabang yang berada
      dalam if pertama syaratnya akan terpenuhi yang dimana action/statement yang ada didalam if tersebut akan dijalankan
    - Ketika memnuhi syarat pertama, Namun ketika pada input yang kedua memasukkan nilai selain 5 maka perintah else yang 
      berada dalam action/statement if pertama tadi yang akan dijalankan.
    */
    }
}
