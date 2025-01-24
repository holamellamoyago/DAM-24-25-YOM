package ud1.YOM20241015;


import java.util.Scanner;

public class EP0134_ConversionEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double CALORIA = 4184;
        final double KILOVATIOH = 3600000;


        System.out.println("Introduce la cantidad de energía");
        double energia = sc.nextDouble(); sc.nextLine();

        System.out.println("En que unidades esta la energia originalmente?");
        char unidadOriginal = sc.nextLine().charAt(0);

        System.out.println("A que unidad te gustaria convertirlo finalmente?");
        char unidadFinal = sc.nextLine().charAt(0);
        sc.close();

        double totalJulios = unidadOriginal == 'j' ? energia : unidadOriginal == 'c' ? energia * CALORIA : unidadOriginal * KILOVATIOH;

        System.out.println("La cantidad total en julios es: " + totalJulios);





        // System.out.println(energia);
    }
}
