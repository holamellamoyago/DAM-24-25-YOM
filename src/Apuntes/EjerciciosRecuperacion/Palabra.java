package Apuntes.EjerciciosRecuperacion;

public class Palabra {
    String palabra;
    int numApariciones, numAciertos, numIntentoPalabra;
    public Palabra(String palabra) {

        this.palabra = palabra;
        this.numAciertos = 0;
        this.numApariciones = 0;
        this.numIntentoPalabra = 0;

    }

    String estadisitca(){
        return palabra + " | Aciertos " +  numAciertos + " numapariciones: " + numApariciones + " numIntentos: " + this.numIntentoPalabra;
    }

    @Override
    public String toString() {
        return "Palabra: " + palabra;
    }

    


    
}
