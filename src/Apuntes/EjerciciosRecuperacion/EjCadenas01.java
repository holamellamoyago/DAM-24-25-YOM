package Apuntes.EjerciciosRecuperacion;

public class EjCadenas01 {
    public static void main(String[] args) {
        String f = "Hola mundo mi nomre es yago";
        
        String[] palabras = f.trim().split("\\s+");

        System.out.println(palabras.length);
    }
}
