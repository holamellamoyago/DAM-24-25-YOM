package ud5.clasesejercicios.E0710.Maquinaria;

import ud5.clasesejercicios.E0710.Personal.Mecanico;

public class Locomotora {
    String matricula;
    int potencia;
    int anhoFabricacion;

    Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int anhoFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anhoFabricacion = anhoFabricacion;
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotora [matricula=" + matricula + ", " + potencia + ", anhoFabricacion=" + anhoFabricacion
                + mecanico + "]";
    }

    public String getMatricula() {
        return matricula;
    }


    

}
