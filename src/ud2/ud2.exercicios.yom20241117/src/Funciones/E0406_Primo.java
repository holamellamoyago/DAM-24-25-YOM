package Funciones;

public class E0406_Primo {
    private static boolean esPrimo(int n) {

        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        System.out.println(esPrimo(4));
    }
}
