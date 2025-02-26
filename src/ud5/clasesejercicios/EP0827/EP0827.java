package ud5.clasesejercicios.EP0827;

import ud5.clasesejercicios.E0825.Punto;
import ud5.clasesejercicios.E0825.Punto3D;

public class EP0827 extends Punto {
    public static void main(String[] args) {
        Punto punto = new Punto(7, 8);
        Punto punto2 = new Punto(2, 8);
        Punto3D punto3 = new Punto3D(2, 8,5);
        Punto3D punto4 = new Punto3D(2, 8,5);

        System.out.println("La distancia es: " + punto.distancia(punto2));

        System.out.println(punto3.equals(punto4));


    }
}
