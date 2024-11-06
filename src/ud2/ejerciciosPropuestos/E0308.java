package ud2.ejerciciosPropuestos;

// E0308. Pedir diez números enteros por teclado y mostrar la media.
import java.util.Scanner;
public class E0308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum = 2;

        System.out.println("Introduce 10 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ultNum;

        int media= (num1+num2)/totalNum;
        System.out.println("La media es " + media);

        
        

        do {
            
            System.out.println("Siguiente numero");
            ultNum = sc.nextInt();
            totalNum++;

            int newMedia =  (media+ultNum)/2;
            System.out.println("La ultima media hasta ahora es: " + newMedia);


        } while (totalNum<10);
    }
}
