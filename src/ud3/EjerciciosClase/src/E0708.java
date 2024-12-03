import java.util.Scanner;

public class E0708 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta frecuencia");
        Sintonizador s = new Sintonizador(sc.nextDouble());
        System.out.println("Que quieres hacer , 1.Mostrar frecuencia , 2.Subir , 3.Bajar frecuencia");
        int opcionSeleccionada = sc.nextInt();

        
        while (opcionSeleccionada != -1) {
            switch (opcionSeleccionada) {
                case 1:
                    s.mostrarFrecuencia();
                    break;
                case 2:
                    s.subirFrecuencia();
                    break;
                case 3:
                    s.bajarFrecuencia();
                    break;

                default:
                    break;
            }

            opcionSeleccionada = sc.nextInt();
        }




    }
}
