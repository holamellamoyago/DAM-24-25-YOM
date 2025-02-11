package AceptaElReto.Ejercicios;

public class TorresPerezosas {
    public static void main(String[] args) {
        char[][] tablero1 = {
                { '.', '.', '.' },
                { '.', '.', '.' },
                { '.', '.', '.' },
        };
        char[][] tablero2 = {
                { '.', '.', '.' },
                { 'X', '.', '.' },
                { '.', '.', '.' },
        };
        char[][] tablero3 = {
                { '.', '.', '.' },
                { '.', 'X', '.' },
                { '.', '.', '.' },
        };

        System.out.println(caminosDistintos(tablero1)); // 6
        System.out.println(caminosDistintos(tablero2)); // 3
        System.out.println(caminosDistintos(tablero3)); // 2

    }

    static int caminosDistintos(char[][] t) {
        int numCaminos = 0;

        int[][] tr = new int[t.length][t.length];

        for (int j = 0; j < tr.length; j++) {
            for (int i = tr.length - 1; i >= tr.length; i--) {

                if (j == 0 && i == t.length - 1) {
                    tr[i][j] = 1;
                } else if (tr[i][j] != 'X') {

                    if(j > 0 ){
                        tr[i][j] = tr[i][j - 1];
                    };

                    if (i<t.length -1) {
                        tr[i][j] += tr[i+1][j];
                    }

                }
                
            }
        }

        return tr[0][t.length -1];
    }
}
