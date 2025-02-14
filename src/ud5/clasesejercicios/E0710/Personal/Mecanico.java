package ud5.clasesejercicios.E0710.Personal;

import java.time.LocalDate;
import ud5.clasesejercicios.E0710.Maquinaria.Locomotora;


public class Mecanico {

    String nombre;
    String telefono;
    Especialidad especialidad;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return ". Mecanico nombre=" + nombre + ", telefono=" + telefono + ", especialidad=" + especialidad + "";
    }


    public void revisar(Locomotora locomotora){
        System.out.println("El/la mecánico " + nombre + " ha revisado " + especialidad + " de la " + locomotora.getMatricula() + " con fecha de " + LocalDate.now() );
    }

    
}
