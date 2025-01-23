package ud4.Arraysejercicios;

public class EjArrays12_MatrizIdentidad {
    public static void main(String[] args) {
        int[][] m = {

                { 1, 0, 0},
                { 0, 1, 0 },
                { 0, 0, 1 }

        };

        boolean esIdentidad = true;
        int contador = 0;

        for(int i = 0; i< m.length; i++){
            for(int j= 0; j< m[i].length; j++){

                if (i == j) {
                    if (m[i][j] != 1) {
                        esIdentidad = false;
                    }
                } else{
                    if (m[i][j] != 0) {
                        esIdentidad = false;
                    }
                }



            }
            
        }

        System.out.println("La nadtrz " +  esIdentidad);


    }
}
