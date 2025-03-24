package ud5.PreparacionExamen.Ejercicios.E0710_trenes.Personal;

import ud5.clasesejercicios.E0710.Personal.Especialidad;

public class Mecanicos  extends Personal{
    enum especialidad {
        FRENOS,HIDRAULICA, ELECTRICIDAD,MOTOR
    }
    int telefono;
    Especialidad especialidad;

    public Mecanicos(String nombre, int telefono, Especialidad especialidad) {
        super(nombre);
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    
}
