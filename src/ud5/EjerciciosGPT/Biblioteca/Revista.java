package ud5.EjerciciosGPT.Biblioteca;

import java.util.Arrays;

public class Revista extends Recurso {
    String[][] articulos = new String[0][2];

    public Revista(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    void mostrarDetalles() {
        for (int i = 0; i < articulos.length; i++) {
            for (int j = 0; j < articulos[i].length; j++) {
                System.out.print(articulos[i][j] + " ");
            }
            System.err.println();
        }

    }

    public String[][] agregarArticulo(String titulo, String autor) {

        articulos = Arrays.copyOf(articulos, articulos.length + 1);

        articulos[articulos.length - 1][0] = titulo;
        articulos[articulos.length - 1][1] = autor;

        return this.articulos;
    }

    public static void mostrarMatriz(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.err.println();
        }
    }
}
