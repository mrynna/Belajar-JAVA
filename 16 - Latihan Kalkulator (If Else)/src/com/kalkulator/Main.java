package com.kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float hasil, a, b;
        char operator;
        

        System.out.println("Program kalkulator sederhana");
        System.out.print("Masukkan nilai a : ");
        a = scanf.nextFloat();
        System.out.println("Masukkan Operator ( + / - / * / : / % ) : ");
        operator = scanf.next().charAt(0); // charArt(0) untuk mengambil karakter pada indeks 0 saja
        System.out.println("Masukkan nilai b : ");
        b = scanf.nextFloat();

        if(operator == '+'){
            hasil = a + b;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);
        }else if(operator == '-'){
            hasil = a - b;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);
        }else if(operator == '*'){
            hasil = a * b;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);
        }else if(operator == '/'){
            hasil = a / b;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);
        }else if(operator == '%'){
            hasil = a % b;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);
        }else{
            System.out.println("Operator tidak ditemukan");
        }
        scanf.close();
    } 
}
