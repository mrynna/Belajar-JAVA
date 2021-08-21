package com.ternary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        //Ternary Opertor
        //variable x = ekspersi ? statement_true : Statement_false
        //Nilai x akan ditentukan dari statement true dan statement false (tergantung dari kondisi ekspresi)

        int input, hasil;
        System.out.println("Contoh penggunaan ternary operator");
        System.out.print("Masukkan nilai : ");
        input = scanf.nextInt();

        //Menggunakan ternary opertator
        hasil = (input > 10) ? (10*10) : (10*input);
        System.out.print("Hasilnya adalah : " + hasil);
        
        /*
        Apabila input bernilai lebih dari 10 maka kondisi menjadi true sehingga operasi
        10*10 yang akan dijalankan (statement_true), sehingga outputnya akan bernilai 100, 
        sedangkan jika nilai yang dimasukkan lebih kecil dari 10 maka kondisi menjadi false
        sehingga operasi 10*input yang akan dijalankan (Statement false), sehingga outputnya akan
        bernilai nilai dari input dikalikan dengan 10
        */

        //Jika menggunakan if else
/*      if (input > 10){
            hasil = 10*10;
        }else{
            hasil = 10*input;
*/
        //Dengan menggunakan ternary operator maka menjadi lebih sederhana
    }
}
    

