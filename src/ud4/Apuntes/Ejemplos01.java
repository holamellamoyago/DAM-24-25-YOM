package ud4.Apuntes;

public class Ejemplos01 {

    public static void main(String[] args) {
        int edad []; // Declaración Variable

        edad = new int[5]; // 5 son los espacios que se reservan, crear instancia

        edad[0] = 28; // Asignar valores a los elementos
        edad[1] = 35;
        edad[2] = 18;
        

        System.out.println("La edad de la persona 2 es " + edad[2]);

    }
}