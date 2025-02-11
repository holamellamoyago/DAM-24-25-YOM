package ud4.EjerciciosExamen;



import java.util.Arrays;

public class RecorridoRobot {
    public static void main(String[] args) {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };

        recorridoRobot(mapa, "AALARAARAA");


    }


    static boolean recorridoRobot(String[] mapa, String instrucciones) {

        char[][] mapaMatriz = new char[0][0];

        for (int i = 0; i < mapa.length; i++) {
            mapaMatriz = Arrays.copyOf(mapaMatriz, mapaMatriz.length+1);
            mapaMatriz[mapaMatriz.length-1] = mapa[i].toCharArray();

        }

        ArraysUtil.mostrarMatriz(mapaMatriz);


        return false;

    }
}
