package Funciones;

public class E0410_Iteractivas_Rescursion {
    private static int calcularPotencia(int base, int exponente) {
        int resultadoExponente = 1;

        if (resultadoExponente == 0) {
            resultadoExponente = 1;
        } else{
            for(int i = 0; i<exponente; i++){
                resultadoExponente = resultadoExponente*base;
            }
        }

        return resultadoExponente;
    }


    private static int calcularPotencia2(int exponente){
        int resultadoExponente = 1;
        int base = 2;


        if (exponente == 0) {
            resultadoExponente = 1;
        } else{
            resultadoExponente =  base * calcularPotencia2(exponente -1);
        }

        return resultadoExponente;
    }

    public static void main(String[] args) {
        System.out.println(calcularPotencia(2, 4));

        System.out.println(calcularPotencia2(4));

    }
}
