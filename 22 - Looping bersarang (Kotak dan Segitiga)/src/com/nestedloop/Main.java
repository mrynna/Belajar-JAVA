package com.nestedloop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Looping bersarang

        //Persegi
        System.out.print("\n");
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Diamond setengah
        System.out.print("\n");
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                if (i == j){
                    break;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        //Diamond setengah mirror
        System.out.print("\n");
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                if ( (i+j) == 6){
                    break;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Diamond setengah gabung
        System.out.print("\n");
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                if (i == j){
                    break;
                }
                else if ( (i+j) == 12){
                    break;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Diamond setengah terbalik
        System.out.print("\n");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if((i + j) == 5){
                     break;
                }
                System.out.print(" ");
            }
            for(int k = 6; k > 0; k--){
                if((i + k) == 5){
                    break;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Diamond setengah terbalik mirror
        System.out.print("\n");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if((i-j) == 0){
                    break;
                }
                System.out.print(" ");
            }
            for(int k = 6; k > 0; k--){
                if(i >= k){
                    break;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Diamond setengah terbalik gabung
        System.out.print("\n");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if((i + j) == 5){
                     break;
                }
                System.out.print(" ");
            }
            for(int k = 6; k > 0; k--){
                if((i + k) == 5){
                    break;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i = 0; i < 6; i++){
            if (i == 0){
                continue;
            }
            for(int j = 0; j < 5; j++){
                if((i-j) == 0){
                    break;
                }
                System.out.print(" ");
            }
            for(int k = 6; k > 0; k--){
                if(i >= k){
                    break;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Diamond utuh
        System.out.print("\n");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if((i + j) == 5){
                     break;
                }
                System.out.print(" ");
            }
            for(int k = 6; k > 0; k--){
                if((i + k) == 5){
                    break;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int i = 0; i < 6; i++){
            if (i == 0){
                continue;
            }
            for(int j = 0; j < 5; j++){
                if((i-j) == 0){
                    break;
                }
                System.out.print(" ");
            }
            for(int k = 6; k > 0; k--){
                if(i >= k){
                    break;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }        
    }   
}

