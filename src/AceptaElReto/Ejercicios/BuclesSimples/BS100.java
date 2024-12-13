package AceptaElReto.Ejercicios.BuclesSimples;

public class BS100 {
    public static void main(String[] args) {
        int numero = 7239;
        int contadorIguales = 0;

        String numeroString = Integer.toString(numero);

        char n1 = numeroString.charAt(0);
        char n2 = numeroString.charAt(1);
        char n3 = numeroString.charAt(2);
        char n4 = numeroString.charAt(3);

        if (n1 == n2 || n1 == n3 || n1 == n4) {
            contadorIguales++;
        }
        if (n2 == n1 || n2 == n3 || n2 == n4) {
            contadorIguales++;
        }
        if (n3 == n1 || n3 == n2 || n3 == n4) {
            contadorIguales++;
        }
        if (n4 == n1 || n4 == n2 || n4 == n3) {
            contadorIguales++;
        }


        System.out.println(contadorIguales);

    }


}
