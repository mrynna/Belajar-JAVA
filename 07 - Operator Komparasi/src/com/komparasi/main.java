package com.komparasi;

public class main {
    public static void main(String[] args) {
        //Operator komparasi akan menghasilkan nilai dalam bentuk boolean
        //dengan menggunakan komparasi kita bisa membandingkan nilai dari variable

        int a, b, c, d;
        boolean hasilKomparasi, hasilKomparasi2, hasilKomparasi3, hasilKomparasi4;

        //Operator Equal atau persamaan

        a = 5;
        b = 5;
        c = 10;

        hasilKomparasi = (a==b);
        hasilKomparasi2 = (a==c);
        
        System.out.printf("\nApakah %d sama dengan %d = %s", a, b, hasilKomparasi);
        System.out.printf("\nApakah %d sama dengan %d = %s" + "\n", a, c, hasilKomparasi2);

        //Operator not Equal atau pertidaksamaan

        a = 5;
        b = 5;
        c = 10;

        hasilKomparasi = (a!=b);
        hasilKomparasi2 = (a!=c);
        
        System.out.printf("\nApakah %d tidak sama dengan %d = %s", a, b, hasilKomparasi);
        System.out.printf("\nApakah %d tidak sama dengan %d = %s" + "\n", a, c, hasilKomparasi2);

        //Operator less than atau kurang dari

        a = 5;
        b = 5;
        c = 10;

        hasilKomparasi = (a<b);
        hasilKomparasi2 = (a<c);
        
        System.out.printf("\nApakah %d kurang dari %d = %s", a, b, hasilKomparasi);
        System.out.printf("\nApakah %d kurang dari %d = %s" + "\n", a, c, hasilKomparasi2);

        //Operator greater than atau lebih dari

        a = 5;
        b = 3;
        c = 10;

        hasilKomparasi = (a>b);
        hasilKomparasi2 = (a>c);
        
        System.out.printf("\nApakah %d lebih dari %d = %s", a, b, hasilKomparasi);
        System.out.printf("\nApakah %d lebih dari %d = %s" + "\n", a, c, hasilKomparasi2);

        //Operator less than equal atau lebih dari samadengan

        a = 5;
        b = 5;
        c = 3;
        d = 10;

        hasilKomparasi = (a<=b);
        hasilKomparasi2 = (a<=c);
        hasilKomparasi3 = (a<=d);
        hasilKomparasi4 = (d<=a);
        
        System.out.printf("\nApakah %d kurang dari samadengan %d = %s", a, b, hasilKomparasi);
        System.out.printf("\nApakah %d kurang dari samadengan %d = %s", a, c, hasilKomparasi2);
        System.out.printf("\nApakah %d kurang dari samadengan %d = %s", a, d, hasilKomparasi3);
        System.out.printf("\nApakah %d kurang dari samadengan %d = %s" + "\n", d, a, hasilKomparasi4);


        //Operator greater than atau lebih dari

        a = 5;
        b = 5;
        c = 3;
        d = 10;

        hasilKomparasi = (a>=b);
        hasilKomparasi2 = (a>=c);
        hasilKomparasi3 = (a>=d);
        hasilKomparasi4 = (d>=a);
        
        System.out.printf("\nApakah %d lebih dari samadengan %d = %s", a, b, hasilKomparasi);
        System.out.printf("\nApakah %d lebih dari samadengan %d = %s", a, c, hasilKomparasi2);
        System.out.printf("\nApakah %d lebih dari samadengan %d = %s", a, d, hasilKomparasi3);
        System.out.printf("\nApakah %d lebih dari samadengan %d = %s" + "\n", d, a, hasilKomparasi4);

    }
}
