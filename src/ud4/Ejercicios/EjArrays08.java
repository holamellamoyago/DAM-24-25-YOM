package ud4.Ejercicios;
import java.util.Scanner;
public class EjArrays08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Empleado empleados[] = new Empleado[2];
        int idEmpleado = -1;
        int mayorSueldo = -1 ;

        for(int i = 0; i<empleados.length;i++){
            System.out.println("Escribe el nombre y despues el sueldo del empleado " + i);
            empleados[i].nombre = sc.nextLine();
            empleados[i].sueldo = sc.nextInt();

            if (empleados[i].sueldo > mayorSueldo) {
                idEmpleado = i;
                mayorSueldo = empleados[i].sueldo;
            }
        }

        System.out.println();
    }
}
