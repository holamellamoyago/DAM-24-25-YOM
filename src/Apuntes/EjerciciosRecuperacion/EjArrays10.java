package Apuntes.EjerciciosRecuperacion;

public class EjArrays10 {
    public static void main(String[] args) {
        int ntotal = 0;

        int[][] n = {
            {1,2,3},
            {2,3,4},
            {5,6,7}
        };

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                ntotal += n[i][j];
            }
        }

        System.out.println("La suma total es: " + ntotal);
    }
}
