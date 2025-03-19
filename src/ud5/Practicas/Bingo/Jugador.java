package ud5.Practicas.Bingo;

import java.util.Random;

public class Jugador {
    String nombre;
    Carton[] cartones;

    public Jugador(String nombre, int numCartones) {
        this.nombre = nombre;
        this.cartones = rellenarCartones(numCartones);
    }




    static Carton[] rellenarCartones(int numCartones){
        Carton[] cartones = new Carton[numCartones];

        for (int i = 0; i < cartones.length; i++) {
            cartones[i].numeros = rellenarCarton();
        }

        return cartones;
    }
    

    static int[][] rellenarCarton() {
        int[][] carton = new int[3][9];

        for (int j = 0; j < carton[0].length; j++) {
            for (int i = 0; i < carton.length; i++) {
                int numero = numeroRandom(j);

                if (!comprobarFilaCarton(carton, numero)) {
                    carton[i][j] = numero;
                } else {
                    j--;
                }

            }
        }

        return carton;

    }

    static int numeroRandom(int j) {
        int numero = 0;
        switch (j) {
            case 0:
                numero = new Random().nextInt(1, 10);
                break;
            case 1:
                numero = new Random().nextInt(10, 19);
                break;
            case 2:
                numero = new Random().nextInt(20, 29);
                break;
            case 3:
                numero = new Random().nextInt(30, 39);
                break;
            case 4:
                numero = new Random().nextInt(40, 49);
                break;
            case 5:
                numero = new Random().nextInt(50, 59);
                break;
            case 6:
                numero = new Random().nextInt(60, 69);
                break;
            case 7:
                numero = new Random().nextInt(70, 79);
                break;
            case 8:
                numero = new Random().nextInt(80, 89);
                break;
            case 9:
                numero = new Random().nextInt(90, 99);
                break;

            default:
                break;
        }

        return numero;
    }

    // Esta función hace que si encuentra en numero en la fila retorna true;
    static boolean comprobarFilaCarton(int[][] carton, int numero) {

        for (int j = 0; j < carton[0].length; j++) {
            for (int i = 0; i < carton.length; i++) {
                if (carton[i][j] == numero) {
                    return true;
                }
            }
        }

        return false;
    }

}
