package ud1.ejercicio_examen;

import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto dinero quieres returar");
        int dineroRetitar = sc.nextInt();


        int billetes50 = dineroRetitar / 50;
        int resto50 = dineroRetitar % 50; 
        
        int billetes20 = resto50 / 20;
        int resto20 = billetes20 % 20;

        int billetes10 = resto20 / 10;
        int resto10 = resto20 % 10;

        int billetes5 = resto10 / 5;
        int resto5 = resto10 % 5;

        System.out.println("Se necesitan " + billetes50 + "billetes de 50 eurtos, " + billetes20 + "billetes de 20 euros, " + billetes10 + "biletes de 10 euros," + billetes5 + "billetes de 5 euros, después sobran " + resto5 + "euros");

        String resultadoSobrante = (dineroRetitar % 5) == 0 ? "No sobra dinero" : "Sobra : " + dineroRetitar % 5 + "euros";

        
        System.out.println(resultadoSobrante);





        sc.close();
    }
}
