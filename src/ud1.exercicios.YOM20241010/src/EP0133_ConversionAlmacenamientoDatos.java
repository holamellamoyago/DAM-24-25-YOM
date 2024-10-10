/**
 * EP0133_ConversionAlmacenamientoDatos
 */

 import java.util.Scanner;
 
public class EP0133_ConversionAlmacenamientoDatos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Que cantidad de datos es?");
        int cantidadDatos = sc.nextInt();

        System.out.println("Cual es la unidad de origen? 1 = KB , 2=MB y 3=GB");
        Byte unidadOrigen = sc.nextByte();

        System.out.println("Cual es la unidad de salida? 1=bytes, 2=KB , 3=MB");
        Byte unidadSalida = sc.nextByte();

        int resultado = unidadOrigen == 1 && unidadSalida == 1 ? cantidadDatos * 1024 : unidadOrigen == 1 && unidadSalida == 2 ? 1 : 2;

    }
}