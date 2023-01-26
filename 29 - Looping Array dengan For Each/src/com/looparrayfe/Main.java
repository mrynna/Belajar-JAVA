package com.looparrayfe;

public class Main {

    public static void main(String[] args){
        System.out.println("");

        //Membuat array
        int[] angka = {4, 2, 7, 5, 3}; // Membuat array angka dengan tipe data integer

        // Looping standard
        System.out.println("\nLooping standard");
        for(int i = 0; i < 5; i++){
          System.out.println("Data pada indeks ke " + i + "adalah " + angka[i]);
        }
        
        // Looping dengan property array length
        System.out.println("\nLooping dengan property length");
        for(int i = 0; i < angka.length; i++){ // angka.length akan mengambil panjang/banyaknya data pada array angka, kemudian nilai itu akan dijadikan jumlah loop-1 (dikurang 1)
          System.out.println("Data pada indeks ke " + i + "adalah " + angka[i]);
        }

        //Looping khusus untuk collection <- array
        System.out.println("\nLooping for each");
        for(int simpan_data : angka){ // Data array akan disimpan pada variable simpan_data di setiap loop dimulai dari indeks ke 0
          System.out.println("Data array pada looping ini adalah " + simpan_data);
        }
    }
}