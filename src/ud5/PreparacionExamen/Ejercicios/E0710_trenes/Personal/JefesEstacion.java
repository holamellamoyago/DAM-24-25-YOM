package ud5.PreparacionExamen.Ejercicios.E0710_trenes.Personal;

import java.time.LocalDate;

public class JefesEstacion extends Personal {
    final String DNI;
    LocalDate fechaNombramiento;
    
    public JefesEstacion(String nombre, String dNI, LocalDate fechaNombramiento) {
        super(nombre);
        DNI = dNI;
        this.fechaNombramiento = fechaNombramiento;
    }

    

}
