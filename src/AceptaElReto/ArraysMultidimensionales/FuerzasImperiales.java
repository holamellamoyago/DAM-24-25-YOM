package AceptaElReto.ArraysMultidimensionales;

public class FuerzasImperiales {
    public static void main(String[] args) {
        char[][] mapaConCamino = {
            {'S', '.', '*', '.', '.', '*', '.', '.', '.', 'F'},
            {'.', '*', '*', '.', '*', '*', '.', '*', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '*', '*', '.'},
            {'.', '*', '*', '*', '.', '*', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '*', '*', '*', '.', '.'},
            {'*', '*', '.', '*', '.', '.', '.', '*', '.', '*'},
            {'.', '*', '.', '*', '*', '*', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '*', '*', '.'},
            {'*', '*', '*', '.', '*', '*', '.', '*', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '*', '.', '.'}
        };

        
        
        
        
        
    }
    
    static void buscarPaseo(char[][] mapa){
        int filaF = buscarSalida(mapa).charAt(0);
        int columnaF = buscarSalida(mapa).charAt(2);

        int filaV = 0;
        int columnaV = 0;

        if (filaF == filaV && mapa[filaV][columnaV+1] != '*') {
            columnaV++;
            
        }

        if (filaF == filaV && mapa[filaV+1][columnaV] != '*') {
            filaV++;
        }






        
    }

    static String buscarSalida(char[][] mapa){
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 'F') {
                    return (char)i + " " + (char)j;
                }
            }
        }

        return "";
    }
}
