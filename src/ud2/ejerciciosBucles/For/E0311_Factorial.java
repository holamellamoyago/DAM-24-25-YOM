package ud2.ejerciciosBucles.For;

public class E0311_Factorial {
    public static void main(String[] args) {
        int numeroRandom= (int)(Math.random() * 10) +1;
        int contador = 1;


            for(int i = numeroRandom; i>=1; i--){

                System.err.print(i);
                contador = i*contador;


                if (i != 1) {
                    System.err.print(" x ");
                } else {
                    System.err.print(" = " + contador);
                }
            }
    }
}
