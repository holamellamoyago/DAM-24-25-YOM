package ud3.Apuntes.Ejerciciosmath;

public class DistanciaPuntosPlanoCartesiano {

    private static double distanciaPuntosPlanoCartesiano(int x, int y){
        // La formula es: 
        // d= raizCuadrada de (x^2 - x^1)^2 + (y^2 - y^1)^2

        double parentesis1 = Math.pow(x, 2); // Calcula x^2
        double parentesis2 = Math.pow(y, 2); // Calcula y^2
        

        return Math.sqrt( parentesis1 + parentesis2 );
    }

    public static void main(String[] args) {
        System.out.println(distanciaPuntosPlanoCartesiano(20, 20));
        
    }
}
