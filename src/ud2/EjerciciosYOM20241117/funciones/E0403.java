package ud2.EjerciciosYOM20241117.funciones;

public class E0403 {

    private static double cancularArea(int radio, int altura){
        return 2*(Math.PI * radio * (altura + radio));
    }

    private static double cancularVolumen(int radio, int altura){
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public static void main(String[] args) {
        int opcionEscogida = 2;


        if (opcionEscogida == 1) {
            
            System.out.println(cancularArea(3, 4));
        } else{
            System.out.println(cancularVolumen(3, 4));
        };
        
    }
}
