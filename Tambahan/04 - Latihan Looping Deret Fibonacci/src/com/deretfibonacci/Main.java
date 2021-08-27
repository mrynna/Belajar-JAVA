package com.deretfibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int n, fn1, fn2, fn;
        System.out.println("Latihan Deret Fibonacci");
        System.out.print("Masukkan batas deret ke-n : ");
        n = masukan.nextInt();
        System.out.println("");

        fn1 = 0;
        fn2 = 1;
        fn = 1;

        for(int i = 1; i <= n; i++){
            System.out.print(fn);
            if(i==n){
            }else{
            System.out.print(", ");   
            }
            fn = fn1 + fn2;
            fn1 = fn2; 
            fn2 = fn;      
        }
        System.out.println("");
    }
}
