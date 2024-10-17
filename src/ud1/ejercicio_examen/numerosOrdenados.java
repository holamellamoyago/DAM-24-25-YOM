package ud1.ejercicio_examen;

import java.util.Scanner;

public class numerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");
        int numero1= sc.nextInt();
        int numero2= sc.nextInt();
        int numero3= sc.nextInt();

        // String resultado = numero1 > numero2  ? numero2 > numero3 ? "Esta ordenado de mayor a menor" : numero1 < numero2 ? numero2 < numero3 ? "Es de menos a mayor" : "";

        String resultado = numero1 > numero2 && numero2>numero3 ? "Esta ordenado de mayor a menor" : numero1 < numero2 && numero2 < numero3 ? "Esta ordenado de menor a mayor" : "Esta totalmente desordenado";
        System.out.println(resultado);
    }
}
