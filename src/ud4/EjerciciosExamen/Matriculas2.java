package ud4.EjerciciosExamen;

public class Matriculas2 {

    public static void main(String[] args) {
        System.out.println(esMatriculaValida("1234BAB"));
        System.out.println(esMatriculaValida("9999ZZZ"));
    }

    static int comparaMatriculas(String m1, String m2){
        if (m1.substring(4,7).compareTo(m2.substring(4,7)) < 0) {
            // m1 es más antigua
            return -1;
        } else if (m1.substring(4,7).compareTo(m2.substring(4,7)) > 0) {
            // m2 es mas antigua
            return 1;
        } else{
            // letras iguales => desempatamos con los numeros
            if (m1.substring(0,4).compareTo(m2.substring(0, 4)) <0) {
                return -1;
            } else if (m1.substring(0,4).compareTo(m2.substring(0, 4)) <0){
                return 1;
            } else{
                return 0;
            }
        }

    }



    static boolean esMatriculaValida(String matricula) {
        if (matricula == null || matricula.length() != 7) {
            return false;
        }

        try {
            Integer.valueOf(matricula.substring(0, 4));
        } catch (Exception e) {
            return false;
        }

        for (int i = 4; i < matricula.length(); i++) {
            if ("BCDFGHJKLMNPRSTVWXYZ".indexOf(Character.toUpperCase(matricula.charAt(i))) == -1) {
                return false;
            }
        }

        return true;
    }


    String siguienteMatricula(String matricula){
        Integer nuevoNum = Integer.valueOf(matricula.substring(0,4) +1);
        boolean meLlevoUno = false; 

        if (nuevoNum == 10000) {
            nuevoNum = 0000;
            meLlevoUno = true;
        }

        String numeros = String.format("%4d", nuevoNum);
        char[] letras = matricula.substring(4, 7).toCharArray();



        for(int i = 2; i>= 0; i--){
            if (meLlevoUno) {
                String letrasValidas = "BCDFGHJKLMNPRSTVWXYZ";
                // Incremento la letra
                if (letras[i] == 'Z') {
                    letras[i] = 'B';
                } else{
                    

                    letras[i] = letrasValidas.charAt(letrasValidas.indexOf(letras[i]) +1);
                    // letras[i] = letras[letrasValidas.indexOf(letras[i])];
                    // letras[i] = letrasValidas.charAt(pos +1);
                    meLlevoUno = false;


                    
                }


            }
        }
        return numeros + String.valueOf(letras);

        
            
        

    }
}
