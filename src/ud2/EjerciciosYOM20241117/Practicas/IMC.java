package ud2.EjerciciosYOM20241117.Practicas;

import java.util.Scanner;

public class IMC {

    static void imc(double kg, double cm) {
        double imc;
        
        imc = kg / Math.pow(cm, 2);

        if (imc < 18.50) {
            System.out.println("Bajo peso");
        } else if( imc <25){
            System.out.println("Peso normal");
        } else if(imc <30){
            System.out.println("Sobrepeso");
        } else{
            System.out.println("Sobrepso");
        }

        
    }
    
    private static double comprobarAltura(){
        Scanner sc = new Scanner(System.in);
        double cm;

        System.out.println("Cual es la altura en cm? Entre 50 y 250");
        cm = sc.nextDouble();

        while (cm < 50 || cm > 250) {
            System.out.println("Error la altura debe de ser entre 50 y 250 cm");
            cm = sc.nextDouble();
        }

        return cm / 100;

    }

    static double comprobarPeso(){
        Scanner sc = new Scanner(System.in);
        double kg;
        
        System.out.println("Caul es el peso?");
        kg = sc.nextDouble();

        while (kg < 20 || kg > 300) {
            System.out.println("Error, peso tiene que ser entre 20 y 300, introducelo de nuevo");
            kg = sc.nextDouble();
        }


        return kg;
    }
    
    public static void main(String[] args) {

        // double alturaMetros = comprobarAltura();

        double alturaMetros = comprobarAltura();


        double peso = comprobarPeso();




        imc(peso, alturaMetros);
    }
}
