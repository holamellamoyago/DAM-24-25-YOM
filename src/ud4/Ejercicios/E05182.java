package ud4.Ejercicios;

import ud4.ArraysUtil;

public class E05182 {
    public static void main(String[] args) {
    }

    static boolean esMagica(int[][] t){
        if (t == null || t.length == 0|| t[0].length != t.length) {
            return false;
        }

        Integer constanteMagica = null;

        for (int i = 0; i < t.length; i++) {
            int suma = 0; 
            for (int j = 0; j < t[i].length; j++) {
                suma += t[i][j];
            }

            if (constanteMagica == null) {
                constanteMagica = suma;
            } else if (constanteMagica != suma) {
                return false;
            }

        }

        for (int i = 0; i < t.length; i++) {
            int suma = 0;
            for (int j = 0; j < t[i].length; j++) {
                suma+= t[j][i];
                
            }
        }
    }
}
