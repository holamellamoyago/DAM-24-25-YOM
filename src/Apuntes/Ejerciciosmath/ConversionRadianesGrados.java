package Apuntes.Ejerciciosmath;

public class ConversionRadianesGrados {

    private static double gradientesToGrados(double radiantes){
        // Para hacer esto la formula es: G= (R*180) / PI

        return (radiantes * 180) / Math.PI;
    }

    private static double gradosToRadiantes(double grados){
        return grados/180*Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(gradientesToGrados(20));
        System.out.println(gradosToRadiantes(1145.9155902616465));
    }
}
