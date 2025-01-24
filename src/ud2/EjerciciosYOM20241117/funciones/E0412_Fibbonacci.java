package Funciones;

public class E0412_Fibbonacci {
    private static int fibo(int n) {
        int resultado = 0;

        if (n == 0 || n==1) {
            resultado = 1;
        } else {

            resultado = fibo(n - 1) + fibo(n - 2);
        }

        return resultado;

    }

    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
}
