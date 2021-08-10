package com.logika;

public class main {
    public static void main(String[] args) {
        //Operasi yang bisa dilakukan pada tipe data boolean
        //AND, OR, XOR, Negasi

        boolean a, b, c, d, e;
        a = true;
        b = true;
        c = false;

        // AND > dan (&&)

        d = (a&&b);
        e = (a&&c);

        System.out.println("\n======== AND ========");
        System.out.println( a + " && " + b + " = " + d);
        System.out.println( a + " && " + c + " = " + e);
        
        // OR > atau (||)

        d = (a||b);
        e = (a||c);

        System.out.println("\n======== OR ========");
        System.out.println( a + " || " + b + " = " + d);
        System.out.println( a + " || " + c + " = " + e);

        // XOR > exclusive or (||)

        d = (a^b);
        e = (a^c);

        System.out.println("\n======= XOR =======");
        System.out.println( a + " ^ " + b + " = " + d);
        System.out.println( a + " ^ " + c + " = " + e);

        // OR > atau (||)

        d = (!a);
        e = (!c);

        System.out.println("\n===== NEGASI =====");
        System.out.println( a + " ---> " + " = " + d);
        System.out.println( c + " ---> " + " = " + e);

    }
}
