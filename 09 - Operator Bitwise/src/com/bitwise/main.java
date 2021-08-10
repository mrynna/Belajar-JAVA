package com.bitwise;

public class main {
    public static void main(String[] args) {

        //Sebuah operator untuk melakukan operasi pada nilai bit
        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;

        //Operator SHIFT LEFT > Untuk menggeser bit ke sebelah kiri sejauh yang diinginkan

        System.out.println("\n== SHIFT LEFT <<");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); //Mengkonversi bilangan desimal a menjadi bit
        System.out.printf("%s = %d", a_bits, a);
        b = (byte) (a<<2); // 2 adalah jauh nilai untuk memindahkan
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'); //Mengkonversi bilangan desimal b menjadi bit
        System.out.printf("\n%s = %d" + "\n", b_bits, b);

        //Operator SHIFT RIGHT > Untuk menggeser bit ke sebelah kanan sejauh yang diinginkan
        a = 6;
        System.out.println("\n== SHIFT RIGHT >>");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); //Mengkonversi bilangan desimal a menjadi bit
        System.out.printf("%s = %d", a_bits, a);
        b = (byte) (a>>1); // 2 adalah jauh nilai untuk memindahkan
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'); //Mengkonversi bilangan desimal b menjadi bit
        System.out.printf("\n%s = %d" + "\n", b_bits, b);

        //Operator SHIFT LEFT > Untuk menggeser bit ke sebelah kiri sejauh yang diinginkan
        
        System.out.println("\n== BITWISE OR |");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); //Mengkonversi bilangan desimal a menjadi bit
        System.out.printf("\n%s = %d", a_bits, a);
        b = (byte) (a<<2); // 2 adalah jauh nilai untuk memindahkan
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'); //Mengkonversi bilangan desimal b menjadi bit
        System.out.printf("\n%s = %d", b_bits, b);
        System.out.printf("\n------------- OR");
        c = (byte) (a|b); //Menambahkan simbol | (hanya satu buah pada bitwise)
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'); //Mengkonversi bilangan desimal b menjadi bit
        System.out.printf("\n%s = %d" + "\n", c_bits, c);

        //Operator SHIFT LEFT > Untuk menggeser bit ke sebelah kiri sejauh yang diinginkan
        
        System.out.println("\n== BITWISE AND &");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); //Mengkonversi bilangan desimal a menjadi bit
        System.out.printf("%s = %d", a_bits, a);
        b = (byte) (a<<1); // 2 adalah jauh nilai untuk memindahkan
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'); //Mengkonversi bilangan desimal b menjadi bit
        System.out.printf("\n%s = %d", b_bits, b);
        System.out.printf("\n------------- AND");
        c = (byte) (a&b); //Menambahkan simbol & (hanya satu buah pada bitwise)
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'); //Mengkonversi bilangan desimal b menjadi bit
        System.out.printf("\n%s = %d" + "\n", c_bits, c);

        System.out.println("\n== BITWISE XOR ^");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); //Mengkonversi bilangan desimal a menjadi bit
        System.out.printf("%s = %d", a_bits, a);
        b = (byte) (a<<1); // 2 adalah jauh nilai untuk memindahkan
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'); //Mengkonversi bilangan desimal b menjadi bit
        System.out.printf("\n%s = %d", b_bits, b);
        System.out.printf("\n------------- XOR");
        c = (byte) (a^b); //Menambahkan simbol & (hanya satu buah pada bitwise)
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'); //Mengkonversi bilangan desimal b menjadi bit
        System.out.printf("\n%s = %d" + "\n", c_bits, c);

        System.out.println("\n== BITWISE NOT ~");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); //Mengkonversi bilangan desimal a menjadi bit
        System.out.printf("%s = %d", a_bits, a);
        b = (byte) ~a; // 2 adalah jauh nilai untuk memindahkan
        System.out.printf("\n------------- NOT");
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24); //Mengkonversi bilangan desimal b menjadi bit lalu hanya mengambil 8 bit pertama dari 32 bit dengan 32 - 8 = 24
        System.out.printf("\n%s = %d" + "\n", b_bits, b);

    }
}
