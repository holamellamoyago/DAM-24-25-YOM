package ud2.ejerciciosPropuestos;

import java.util.Scanner;

import ud3.Util;

public class E0411_corregido {

    public static int mcd(int a, int b) {
        int mcd = 0;

        if (a == 0) {
            mcd = b;
        } else if (b == 0) {
            mcd = a;
        } else if (a >= b) {
            mcd = mcd(a - b, b);
        } else {
            mcd = mcd(a, b - a);
        }

        return mcd;
    }

    public static void main(String[] args) {
        System.out.println(mcd(4, 8));

            
    
    }

}