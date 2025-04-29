package ud6.Practicas.E1301;

import java.util.List;

import ClasesPublicas.Persona;

public class E1301<T> {
    public static void main(String[] args) {
        Persona p = new Persona("Manuel");

        Saludo<String> saludo1 = (a) -> {return  "Hola " + a;};
        Saludo<Persona> saludoPersonas = (z) -> {return "Querida " + z.getNombre();};

        System.out.println(saludo1.saludar("Pepe"));
        System.out.println(saludoPersonas.saludar(p));

        Saludo.saludoGrupo(List.of(p));



    }

}
