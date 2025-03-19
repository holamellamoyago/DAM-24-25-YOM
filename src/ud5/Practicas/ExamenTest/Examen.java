package ud5.Practicas.ExamenTest;

import java.util.Arrays;

public class Examen {
    String titulo;
    Pregunta[] preguntas;

    public Examen(String titulo) {
        this.titulo = titulo;
        preguntas = new Pregunta[0];
    }

    int numPreguntas(){
        return preguntas.length-1;
    }

    

    @Override
    public String toString() {
        String respuesta ="";
        respuesta += titulo+"\n";
        for (int i = 0; i < preguntas.length; i++) {
            respuesta += "\n" + i + ". " +  preguntas[i].toString();
        }

        return respuesta;
    }

    boolean addPregunta(Pregunta pregunta){
        boolean esNuevaPregunta = true;

        for (int i = 0; i < preguntas.length; i++) {
            if (preguntas[i].equals(pregunta)) {
                esNuevaPregunta = false;
            }
        }

        if (esNuevaPregunta) {
            preguntas = Arrays.copyOf(preguntas, preguntas.length+1);
            preguntas[preguntas.length-1] = pregunta;
        }

        return esNuevaPregunta;
    }
    
}
