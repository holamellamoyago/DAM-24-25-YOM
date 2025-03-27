package ud4.yomexamenrec;

// Yago Otero Martínez

public class Diagonales {
    public static void main(String[] args) {
        int[][] matriz = { 
            { 1, 2, 3, 4 }, // I0 J3
            { 1, 2, 3, 4 }, // I2 J2
            { 1, 2, 3, 4 },
            { 1, 5, 3, 4 }
        
        };

        int[][] matriz3 = { 
            { 1, 2, 6, 4 }, // I0 J3
            { 1, 2, 5, 4 }, // I2 J2
            { 1, 2, 6, 4 },
            { 8, 2, 3, 4 }
        
        };



        int[][] m2 = null;

        System.out.println(diagonalesIguales(matriz));
        // System.out.println(diagonalesIguales(m2));


    }


    static boolean diagonalesIguales(int[][] t){

        int sumadiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        if (t == null) {
            return false;
        }

        // No cuadrada
        for (int i = 0; i < t.length; i++) {
            if (t.length != t[i].length) {
                return false;
            }
        }

        if (t.length == 0) {
            return false;
        }



        // Diagonal superior
        for (int i = 0; i < t.length; i++) {
            sumadiagonalPrincipal += t[i][i];
        }


        
        // Diagonal inferior
        for (int i = t.length-1; i >=0; i--) {
            sumaDiagonalSecundaria+=t[i][t.length-1-i];
        }

        if (sumaDiagonalSecundaria == sumadiagonalPrincipal) {
            return true;
        }else{
            return false;
        }

        
        

        //    for (int i = t.length-1; i >= 0; i--) {
        //         System.out.println(t[i][i]);
        //    }

        // for (int i = 0; i < t.length; i++) {
        //     for (int j = t[i].length-1; j >= 0; j--) {
        //         System.out.println(t[i][j]);
        //     }
        // }

        //    System.out.println(sumadiagonalPrincipal);

        //    return false;
    }
}
