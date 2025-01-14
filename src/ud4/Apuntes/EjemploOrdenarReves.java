package ud4.Apuntes;

import java.util.Arrays;

import ud4.ArraysUtil;

public class EjemploOrdenarReves {
    public static void main(String[] args) {
        
        Integer t[] = ArraysUtil.arrayAleatorio(10, 1, 10);

        System.out.println(Arrays.toString(t));

        System.out.println(Arrays.toString(ArraysUtil.ordenarAlReves(t)));
    }
}
