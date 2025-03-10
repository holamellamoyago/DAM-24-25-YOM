package Apuntes.EjerciciosRecuperacion;

public class EjCadenas04 {
    public static void main(String[] args) {
        String j = "java";

        char[] j2 = j.toCharArray();
        String j3 = "";

        for (int i = j2.length-1; i >= 0; i--) {
            j3 += j2[i];
        }

        System.out.println(j3);



    }
}
