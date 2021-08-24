package com.kalkulator;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    
        Scanner masukan = new Scanner(System.in);
        
        float a, b, hasil;
        char operator;

        System.out.println("Program Kalkulator sederhana");
        System.out.print("Masukkan nilai a : ");
        a = masukan.nextFloat();
        System.out.println("Masukkan operator ( + , - , * , / , % ): ");
        operator = masukan.next().charAt(0);
        System.out.print("Masukkan nilai b : ");
        b = masukan.nextFloat();

        switch(operator){
            case '+' :
                hasil = a + b;
                System.out.println("hasil " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case '-' :
                hasil = a - b;
                System.out.println("hasil " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case '/' :
                hasil = a / b;
                System.out.println("hasil " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case '*' :
                hasil = a * b;
                System.out.println("hasil " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case '%' :
                hasil = a % b;
                System.out.println("hasil " + a + " " + operator + " " + b + " = " + hasil);
                break;
            default : 
                System.out.println("Operator tidak ditemukan");
                break;
        }
        
        masukan.close();
    }    
}
