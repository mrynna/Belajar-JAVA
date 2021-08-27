package com.control;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Break, Continue dan return pada bahasa pemrograman java digunakan untuk mengontrol flow program. 
        Break berfungsi untuk memberhentikan proses yang sedang berlangsung
        Continue berfungsi untuk melanjutkan/mengulangi/melangkahi secara paksa proses yang sedang berlangsung
        Return berfungsi untuk mengembalikan program kepada fungsi utama
        */

        Scanner masukan = new Scanner(System.in);
        int n, langkahi, kembalikan, i;

        System.out.println("\nProgram sederhana penggunaan break, continue, dan return");
        System.out.println("Masukkan proses looping ke-n yang ingin di break : ");
        n = masukan.nextInt();
        System.out.println("Masukkan proses looping ke-n yang ingin di continue : ");
        langkahi = masukan.nextInt();
        System.out.println("Masukkan di looping keberapa yang ingin diberi retrun : ");
        kembalikan = masukan.nextInt();
        i = 0;

        while(true){
            i++;
            if (i == n){
                break;
            }else if (i == langkahi){
                continue;
            }else if (i == kembalikan){
                return;
            }
            System.out.println("Looping ke-" + i);
        }
        System.out.println("Akhir dari looping");
        /*
        contoh :
        ketika kita memasukkan break pada looping ke 9, maka pada looping yang ke 9 akan berhenti dan proses looping pun akan berhenti sehingga tidak menjalankan 
        perintah print looping ke-9 dan langsung menjalankan perintah print akhir dari looping
        ketika kita memasukkan continue pada looping ke 4 maka pada looping ke 4 perintah print looping ke 4 tidak
        akan dijalankan karena proses looping akan langsung dijalankan paksa kembali tanpa memerhatikan perintah dibawahnya lagi
        yang berada didalam looping
        ketika kita memasukkan return pada looping ke 1 maka pada saat looping ke 1 proses looping langsung berhenti begitu pula dengan
        proses program keseluruhan tanpa memerhatikan seluruh perintah yang berada dibawahnya lagi
        */
    }
}
