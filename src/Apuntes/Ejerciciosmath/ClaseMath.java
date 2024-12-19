package Apuntes.Ejerciciosmath;

import java.lang.Math;

public class ClaseMath {
    public static void main(String[] args) {
        double numRandom = (Math.random() * 720) - 360;
        System.out.printf("%.2f", numRandom);
        System.err.println();

        // Raiz cuadrada
        System.out.println(Math.sqrt(numRandom));

        // Numero redondeado a la cifra decimal mas cercana 
        Math.round(numRandom);

        // Numero redondeado a arriba ¡¡IMPORTANTE!! (Cuando las cifras son negativas hay que intercalarlos, redondeo)
        System.out.println(Math.ceil(numRandom));
        
        // Numero redondeado hacia abajo
        System.out.println(Math.floor(numRandom)    );

        // Valor absoluto
        System.out.println(Math.abs(numRandom));

        // Potencia al cubo 
        System.out.println(Math.pow(numRandom, 3));

        // Logaritmo natural
        Math.log(numRandom);

        // suponiendo que el número representa la medida un ángulo en grados, muestra el seno y coseno de ese ángulo utilizando Math.sin() y Math.cos().

        // Seno
        System.out.println(Math.sin(numRandom));

        // Coseno
        System.out.println(Math.cos(numRandom));
        
        // numero maximo y mínimo
        System.out.println(Math.max(5, 7));
        System.out.println(Math.min(5, 7));


    }
}
