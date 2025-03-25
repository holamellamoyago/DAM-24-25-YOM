package ud5.PreparacionExamen.Ejercicios;


public class ComplejidadCiclomatica {
    public static void main(String[] args) {
        int[][] grafo1 = {
                { 1 },
                { 3, 5 },
                { 1 },
                { 2, 4 },
                { 6 },
                { 6 }
        };

        System.out.println(complejidadCiclomatica(grafo1));
    }

    static int complejidadCiclomatica(int[][] grafo){
        int complejidadTotal = 0;

        for (int i = 0; i < grafo.length; i++) {
            if (grafo[i].length > 1) {
                complejidadTotal++;
            }
        }


        return complejidadTotal +1;
    }

    
}
