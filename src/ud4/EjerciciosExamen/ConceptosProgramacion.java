package ud4.EjerciciosExamen;

import java.util.Random;

public class ConceptosProgramacion {

    static String fraseAleatoria(String[] t) {
        int rnd = new Random().nextInt(0, t.length);

        return t[rnd];
    }
    public static void main(String[] args) {
        String conceptos [] = {"Entorno de desarollo" , "Compilacion" , "Ejecucion" , "Código fuente", "Bytecode" , "codigo objecto", "Algoritmo", "Lenguaje de programación"};
    
        System.out.println(fraseAleatoria(conceptos));
    
    }
    
}
