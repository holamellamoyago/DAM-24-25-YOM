package ud5.interfacesejercicios.EP0913_Futbolista;

import java.util.Arrays;
import java.util.Comparator;

public class Futbolista{
    String dni, nombre;
    int edad, numeroGoles;

    public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    @Override
    public String toString() {
        return nombre + " con DNI " + dni + " marco " + numeroGoles
                + " goles.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Futbolista other = (Futbolista) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    

    

    public static void main(String[] args) {
        Futbolista[] futbolistas = {
            new Futbolista("39511342X", "Yago", 22, 99),
            new Futbolista("11234567A", "Anabel", 99, 99)
        };

        Arrays.sort(futbolistas, new Comparable().compararNombre);

        System.out.println(Arrays.toString(futbolistas));
    }

    

}
