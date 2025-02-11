package ud4.EjerciciosExamen;

public class MatrizTriangularSuperior {



    public static void main(String[] args) {

        int [][] m = {
            {1,1,1,1,1},
            {0,1,1,1,1},
            {0,0,1,1,1},
            {0,0,0,1,1},
            {0,0,0,0,1},
        };

        boolean bandera = true;

        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j < i; j++) {
                if (m[i][j] != 0) {
                    bandera = false;
                }
            }
        }


        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[i].length; j++) {
                if (m[i][j] != 1) {
                    bandera = false;
                }
            }
        }


        if (bandera) {
            System.out.println("Si ");
        } else{
            System.out.println("No");
        }
    }
}
