package ud5.Practicas.ExamenTest;

import java.util.Arrays;

public class Pregunta {
    String enunciado;
    String[] listaRespuestas;
    int respuestaCorrecta;

    public Pregunta(String enunciado, String[] listaRespuestas, int respuestaCorrecta) {
        if (listaRespuestas.length >= 2 && respuestaCorrecta < listaRespuestas.length) {
            this.enunciado = enunciado;
            this.listaRespuestas = listaRespuestas;
            this.respuestaCorrecta = respuestaCorrecta;
        } else{ 
            throw new ArithmeticException("Pregunta no válida");
        }
    }

    boolean corregir(int respuesta){
        if (respuesta == respuestaCorrecta) {
            return true;
        } else{
            return false;
        }
    }

    

    @Override
    public String toString() {
        String frase = "";
        frase+=enunciado+"\n";
        
        for (int i = 0; i < listaRespuestas.length; i++) {
            frase+=  (char)(97+i) + ") " + listaRespuestas[i]+"\n";
        }

        return frase;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pregunta other = (Pregunta) obj;
        if (enunciado == null) {
            if (other.enunciado != null)
                return false;
        } else if (!enunciado.equals(other.enunciado))
            return false;
        if (!Arrays.equals(listaRespuestas, other.listaRespuestas))
            return false;
        return true;
    }

    public static void main(String[] args) {
        String[] respuestas = {"Respuesta 1", "Respuesta2"};

        Pregunta pr = new Pregunta("Cual es X", respuestas, 1);
        Pregunta p2 = new Pregunta("Cual es 2", respuestas, 1);
        Pregunta p3 = new Pregunta("Cual es X", respuestas, 1);

        System.out.println(pr.toString());

        Examen examen = new Examen("MAtrices");

        System.out.println(examen.addPregunta(pr));
        System.out.println(examen.addPregunta(p2));
        System.out.println(examen.addPregunta(p3));
        System.out.println();

        System.out.println(examen.toString());
    }

}
