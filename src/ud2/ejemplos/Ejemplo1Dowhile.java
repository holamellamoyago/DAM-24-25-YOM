package ud2.ejemplos;
import java.util.Scanner;


public class Ejemplo1Dowhile {
    public static void main(String[] args) {
        int valor;
        Scanner in = new Scanner( System.in );
        do {  //inicio del do .. while
            System.out.print("Introduce un número entero <= 100: ");                                        
            valor = in.nextInt();
            if(valor > 100){
                System.out.println("Número no válido");
            }
        }while (valor > 100);  //fin del do .. while
        System.out.println("Ha introducido: " + valor);                                                     
    }
    
}
