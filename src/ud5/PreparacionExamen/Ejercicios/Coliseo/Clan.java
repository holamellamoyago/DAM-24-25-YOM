package ud5.PreparacionExamen.Ejercicios.Coliseo;

public class Clan {
    String nombre;
    Guerrero[] guerreros;
    int puntiacionTotal;

    public Clan(String nombre, Guerrero[] guerreros, int puntiacionTotal) {
        this.nombre = nombre;
        this.guerreros = guerreros;
        this.puntiacionTotal = sumarPuntuacion(guerreros);
    }

    private int sumarPuntuacion(Guerrero[] g){
        int total = 0;

        for (int i = 0; i < g.length; i++) {
            guerreros[i].habilidad += total;
        }

        return total;
    }

    
}
