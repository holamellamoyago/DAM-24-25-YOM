package ud4.EjerciciosExamen;

import java.util.Arrays;

import ud4.ArraysUtil;


public class BuscarFilaMayorSuma {
    public static void main(String[] args) {

        int filaGanadora = 0;
        int sumaFilaGanadora = 0;
        int sumaFila = 0;

        Integer[][] f1 = {
                ArraysUtil.arrayAleatorio(10, 1, 9),
                ArraysUtil.arrayAleatorio(10, 1, 9),
                ArraysUtil.arrayAleatorio(10, 1, 9),
                ArraysUtil.arrayAleatorio(10, 1, 9),
                ArraysUtil.arrayAleatorio(10, 1, 9),
                ArraysUtil.arrayAleatorio(10, 1, 9),
                { 9, 8, 8, 8 }
        };

        Integer arrayGanadora[] = f1[0];

        if (f1 != null) {
            if (f1.length - 1 != 0) { // Aquí compruebo que no sea de una fila
                for (int i = 0; i < f1.length; i++) {
                    for (int j = 0; j < f1[i].length; j++) {
                        sumaFila += f1[i][j];
                    }

                    if (sumaFila > sumaFilaGanadora) {
                        sumaFilaGanadora = sumaFila;
                        filaGanadora = i;
                        arrayGanadora = Arrays.copyOf(f1[i], f1[i].length);
                    } else {
                        // En este caso significaría empate o que perdio entonces ya devolvería de por sí la primera fila
                    }

                    sumaFila = 0;

                }
            } else{
                System.out.println("Matriz de única fila");
                arrayGanadora = f1[0];
            }

        } else {
            System.err.println("La matriz es null");
        }

        System.out.println("La fila ganadora es la " + filaGanadora + " con: ");
        System.out.println(Arrays.toString(arrayGanadora));

        // System.out.println(sumaFila);
    }
}
