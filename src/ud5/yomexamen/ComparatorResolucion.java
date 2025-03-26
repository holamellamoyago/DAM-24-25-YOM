package ud5.yomexamen;
// Yago Otero Martínez

import java.util.Comparator;

public class ComparatorResolucion implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cliente c1 = (Cliente) o1;
        Cliente c2 = (Cliente) o2;

        int resolucionC1 = (cogerResolucionAncho(c1.resolucion) * cogerResolucionVertical(c1.resolucion));
        int resolucionC2 = (cogerResolucionAncho(c2.resolucion) * cogerResolucionVertical(c2.resolucion));

        return resolucionC1 - resolucionC2;
    }

    static int cogerResolucionAncho(String s) {
        char[] numeros = s.toCharArray();
        String numerosString = "";
        Integer numero;

        for (int i = 0; i < 5; i++) {
            if (numeros[i] != 'x') {
                numerosString += numeros[i];
            }
        }

        numero = Integer.parseInt(numerosString);

        return numero;
    }

    static int cogerResolucionVertical(String s) {
        char[] numeros = s.toCharArray();
        String numerosString = "";
        Integer numero;

        for (int i = 5; i < numeros.length; i++) {
            if (numeros[i] != 'x') {
                numerosString += numeros[i];
            }
        }

        numero = Integer.parseInt(numerosString);

        return numero;
    }

}
