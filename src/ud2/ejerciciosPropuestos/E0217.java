package ud2.ejerciciosPropuestos;
import java.math.*;
public class E0217 {
    public static void main(String[] args) {
        // Genera un numero entre 0 y 99 
        final int MAX = 99;
        final int MIN = 1;

        // Lo que hace aquí es que genera un número maximo de 99 pero también un mínimo de 1 al sumarle el minimo , osea que si diera 0 el resultado daría igual el 1 por el hecho de que se le esta sumando 
        
        int numero = (int)(Math.random() * MAX) + MIN;


        System.out.println(numero);
    }
}
