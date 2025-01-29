package ud4.Ejercicios;

//Escribir un
//programa que
//pida el
//nombre completo
//al usuario
//y lo
//muestre sin
//
//vocales(mayúsculas, minúsculas y acentuadas).
//Por ejemplo, “
//Álvaro Pérez”
//quedaría como “
//lvr Prz”.


public class E0606 {


    public static void main(String[] args) {
        System.out.println("Introduce un nombre");
        String nombre = "Yago Otero";

        System.out.println(sinVocales(nombre));
    }

    static String sinVocales(String cad) {
        String fraseDevolver = "";
        for (int i = 0; i < cad.length(); i++) {
            char c = Character.toUpperCase(cad.charAt(i));

            switch (c) {
                case 'A', 'E', 'I', 'O', 'U', 'Á', 'É', 'Í', 'Ú' -> {
                }
                default -> fraseDevolver += c;
            }


        }

        return fraseDevolver;
    }

}
