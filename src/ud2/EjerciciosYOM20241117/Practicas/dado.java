package ud2.EjerciciosYOM20241117.Practicas;

public class dado {


    public static void main(String[] args) {
        int contadorLado1 = 0;
        int contadorLado2 = 0;
        int contadorLado3 = 0;
        int contadorLado4 = 0;
        int contadorLado5 = 0;
        int contadorLado6 = 0;
        
        for(int i = 0; i<1000; i++){
            int ladoDado = (int)(Math.random()*6) +1;

            switch (ladoDado) {
                case 1 -> contadorLado1++;
                case 2 -> contadorLado2++;
                case 3 -> contadorLado3++;
                case 4 -> contadorLado4++;
                case 5 -> contadorLado5++;
                case 6 -> contadorLado6++;
                default -> System.out.println("Error");
                      
            }
        }

        double porcentaje1 = (contadorLado1*100)/1000;
        double porcentaje2 = (contadorLado2*100)/1000;
        double porcentaje3 = (contadorLado3*100)/1000;
        double porcentaje4 = (contadorLado4*100)/1000;
        double porcentaje5 = (contadorLado5*100)/1000;
        double porcentaje6 = (contadorLado6*100)/1000;

        System.out.println("RESULTADOS: ");
        System.out.println("Ha salido 1: " + contadorLado1 + " veces " + porcentaje1 + "%");
        System.out.println("Ha salido 2: " + contadorLado2 + " veces " + porcentaje2 + "%");
        System.out.println("Ha salido 3: " + contadorLado3 + " veces " + porcentaje3 + "%");
        System.out.println("Ha salido 4: " + contadorLado4 + " veces " + porcentaje4 + "%");
        System.out.println("Ha salido 5: " + contadorLado5 + " veces " + porcentaje5 + "%");
        System.out.println("Ha salido 6: " + contadorLado6 + " veces " + porcentaje6 + "%");
    }
}
