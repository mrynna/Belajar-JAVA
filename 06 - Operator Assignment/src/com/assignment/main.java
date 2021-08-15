package com.assignment;

public class main {
    public static void main(String[] args) {
        
        //Operator assignment, untuk menyederhanakan bentuk operasi

        int a = 5;
        int b = 10;
        int c = 5;
        int d = 10;
        int e = 10;

        System.out.println("nilai a = " + a);
        System.out.println("nilai b = " + b);
        System.out.println("nilai c = " + c);
        System.out.println("nilai d = " + d);
        System.out.println("nilai e = " + e);

        // contoh : a = a + 5; menjadi a += 5;

        a += 5; //assignment penjumlahan
        b -= 5; //assignment pengurangan
        c *= 5; //assignment perkalian
        d /= 5; //assignment pembagian
        e %= 5; //assignment modulus
        
        System.out.println("nilai a setelah assignment = " + a);
        System.out.println("nilai b setelah assignment = " + b);
        System.out.println("nilai c setelah assignment = " + c);
        System.out.println("nilai d setelah assignment = " + d);
        System.out.println("nilai e setelah assignment = " + e);
    }
}
