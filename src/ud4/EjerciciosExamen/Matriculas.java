package ud4.EjerciciosExamen;

public class Matriculas {
    public static void main(String[] args) {
        String matricula = "1111BBBC";

        System.out.println(siguienteMatricula(matricula));

    }

    static String siguienteMatriculaMAL(String matricula) {
        String abcedario = "b,c,d,f,g,h,j,k,l,m,n,p,r,s,t,v,w,x,y,z" ;

        
        Integer sigMatricula = Integer.valueOf(matricula) + 1;

        String numMatriculas = sigMatricula.toString();

        if (sigMatricula >= 9998) {
            numMatriculas = "0000";
        } else if (sigMatricula < 10) {
            numMatriculas = "000" + sigMatricula;
        } else if (sigMatricula < 100) {
            numMatriculas = "00" + sigMatricula;
        } else if (sigMatricula < 1000) {
            numMatriculas = "0" + sigMatricula;
        } else {
            numMatriculas = sigMatricula.toString();
        }

        // Aquí genero las letras de la matricula

        int contadorLetra1 =0;
        int contadorLetra2 =0;
        int contadorLetra3 =0;
        int contadorLetra4 =0;

        char letra1 = abcedario.toCharArray()[contadorLetra1];
        char letra2 = abcedario.toCharArray()[contadorLetra2];
        char letra3 = abcedario.toCharArray()[contadorLetra3];
        char letra4 = abcedario.toCharArray()[contadorLetra4];

        String letrasMatricula = letra1 + "" + letra2 + "" + letra3 + "" + letra4;

        String matriculaCompleta = numMatriculas + letrasMatricula ;

        return matriculaCompleta;
    }

    static String siguienteMatricula(String matricula) {
        // String abcedario = "b,c,d,f,g,h,j,k,l,m,n,p,r,s,t,v,w,x,y,z" ;

        String numeros = matricula.substring(0, 4);
        String letras = matricula.substring(4, matricula.length()).toUpperCase();

        Integer sigMatricula = Integer.valueOf(numeros) + 1;
        String numMatriculas = sigMatricula.toString();

        if (sigMatricula >= 9998) {
            numMatriculas = "0000";
        } else if (sigMatricula < 10) {
            numMatriculas = "000" + sigMatricula;
        } else if (sigMatricula < 100) {
            numMatriculas = "00" + sigMatricula;
        } else if (sigMatricula < 1000) {
            numMatriculas = "0" + sigMatricula;
        } else {
            numMatriculas = sigMatricula.toString();
        }

        // System.out.println((int)'a');

        int letra0Ennumero= (int)letras.charAt(0);
        int letra1Ennumero= (int)letras.charAt(1);
        int letra2Ennumero= (int)letras.charAt(2);
        int letra3Ennumero= (int)letras.charAt(3);

        // System.out.println(letra2Ennumero);
        // System.out.println(letra3Ennumero);
        // System.out.println((int)'Z');

        sumarMatricula(letras);

        String matriculaFinal = numMatriculas + letras;

        // if ((int)letras.charAt(0) > (int)letras.charAt(3)) {
        //     System.out.println("Es mayor la ultima que la penultima");
        // }
    
    
        return matriculaFinal;
    }

    static String sumarMatricula(String letrasMAtricula){
        return "";
    }




        

}
