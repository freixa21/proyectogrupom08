package uf4p01;

import java.util.Scanner;

/**
 * @author AMX
 */
public class UF4P01 {

    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        metode1();
    }
    
    private static void metode1() {
        int a, b;
        System.out.print("Digues un número:"); a = in.nextInt();
        System.out.print("Digues un altre número: "); b = in.nextInt();
        System.out.print("Els teus números son el " + a + " i " + " el " + b);
    }
    
    
    
    
}
