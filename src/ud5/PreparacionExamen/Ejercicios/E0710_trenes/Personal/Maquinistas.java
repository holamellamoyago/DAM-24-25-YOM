package ud5.PreparacionExamen.Ejercicios.E0710_trenes.Personal;

public class Maquinistas extends Personal {
    final String DNI;
    int sueldo;
    String rango;

    public Maquinistas(String nombre, String dNI, int sueldo, String rango) {
        super(nombre);
        DNI = dNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }



    


}
