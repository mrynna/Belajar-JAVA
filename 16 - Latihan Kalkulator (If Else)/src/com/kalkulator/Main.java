package com.kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int hasil, a, b;
        char operator;
        

        System.out.println("Program kalkulator sederhana");
        System.out.print("Masukkan nilai a : ");
        a = scanf.nextInt();
        System.out.println("Masukkan Operator ( + / - / * / : / % ) : ");
        operator = scanf.next().charAt(0); // charArt(0) untuk mengambil karakter pada indeks 0 saja
        System.out.println("Masukkan nilai b : ");
        b = scanf.nextInt();

        if(operator == '+'){
            hasil = a + b;
            System.out.printf("%d + %d = %d", a, b, hasil);
        }else if(operator == '-'){
            hasil = a - b;
            System.out.printf("%d - %d = %d", a, b, hasil);
        }else if(operator == '*'){
            hasil = a * b;
            System.out.printf("%d x %d = %d", a, b, hasil);
        }else if(operator == ':'){
            hasil = a / b;
            System.out.printf("%d : %d = %d", a, b, hasil);
        }else if(operator == '%'){
            hasil = a % b;
            System.out.printf("%d % %d = %d", a, b, hasil);
        }else{
            System.out.println("Operator tidak ditemukan");
        }
        scanf.close();
    } 
}
