package Apuntes;

// Existen 8 clases de evoltorio pero las más básicas son: int -> Integer, double -> Double 
// Para pasar de un tipo primitivo a un envoltorio hay que hacer Double.valueOf(num);

public class ClaseEnvoltorio {
    public static void main(String[] args) {

        // Encapsulamiento de un tipo básico
        int p = 23;
        Integer num = p;
        int p2 = num; // desencapsulamiento



        // Conversion de String a tipo primitivo o objeto
        String s1 = "23", s2="23.33";
        Integer z = Integer.valueOf(s1);
        int z1 = Integer.parseInt(s1);

        Double z2 = Double.valueOf(s2);
        double z3 = Double.parseDouble(s2);

        // Conversion de base utilizando la clase Integer
        int a = Integer.parseInt("101",2);
        int a2 = Integer.parseInt("101",3); // Cubo
        int a3 = Integer.parseInt("101",16); // Hexadecimal

        //Convertir un numero decimal a cualquier base
        String a4 = Integer.toString(7,2);
        System.out.println(a4);





        

        System.out.println(a);
    }
}
