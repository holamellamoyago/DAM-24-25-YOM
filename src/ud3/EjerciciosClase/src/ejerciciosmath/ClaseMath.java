package ejerciciosmath;

import java.math.BigDecimal;
import java.util.Random;

public class ClaseMath {
    public static void main(String[] args) {
        final double numRandom = (Math.random() * 720 - 360);
        final double sqrt = Math.sqrt(numRandom);

        System.out.println("Numero: " + numRandom);
        System.out.println("Raiz cuadrada: " + sqrt);

        System.out.println("Redondeos: ");
        System.out.println("ceil() " + Math.ceil(numRandom));
        System.out.println("floor() " + Math.floor(numRandom));

        System.out.println("Valor absoluto: " + Math.abs(numRandom));
        System.out.println("Potencia al cubo: " + Math.pow(numRandom, 3));
        System.out.println("Logaritmo: " + Math.log(numRandom));
        System.out.println("Coseno: " + Math.cos(numRandom));

        double volumenEsfera = 4 / 3 * Math.PI * Math.pow(numRandom, 3);
        System.out.println("Volumen de la esfera: " + volumenEsfera);

        double unCentimo = 0.01;
        BigDecimal numero = new BigDecimal(0.01);
        BigDecimal sumaPrecisa = new BigDecimal(0);
        sumaPrecisa = numero.add(numero).add(numero).add(numero).add(numero).add(numero).add(numero);
        double suma = unCentimo + unCentimo + unCentimo + unCentimo + unCentimo + unCentimo;
        System.out.println(suma);
        System.out.println(sumaPrecisa);

        Random rndRandom = new Random();
        rndRandom.nextInt();
        System.out.println(rndRandom.nextInt(5) +1);
    }
}
