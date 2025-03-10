package Apuntes.EjerciciosRecuperacion;

import java.util.Arrays;

public class EjCadenas02 {
    public static void main(String[] args) {
        String f = "Hola mundo mi nomre es yago";

        String[] p = f.strip().split("\\s+");

        p = Arrays.copyOfRange(p, 0, p.length - 1);

        System.out.println(Arrays.toString(p));

        String fraseNueva = String.join(" ", p);

        System.out.println(fraseNueva);
    }
}
