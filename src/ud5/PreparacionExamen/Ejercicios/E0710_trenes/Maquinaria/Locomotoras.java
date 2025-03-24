package ud5.PreparacionExamen.Ejercicios.E0710_trenes.Maquinaria;

import java.time.Year;

import ud5.clasesejercicios.E0710.Personal.Mecanico;

public class Locomotoras {
    final String MATRICULA;
    int potenciaMotores;
    Year anhoFabricacion;
    Mecanico mecanico;
    
    public Locomotoras(String mATRICULA, int potenciaMotores, Year anhoFabricacion, Mecanico mecanico) {
        MATRICULA = mATRICULA;
        this.potenciaMotores = potenciaMotores;
        this.anhoFabricacion = anhoFabricacion;
        this.mecanico = mecanico;
    }

    
}
