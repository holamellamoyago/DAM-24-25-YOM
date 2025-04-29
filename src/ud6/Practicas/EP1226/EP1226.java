package ud6.Practicas.EP1226;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import ClasesPublicas.Persona;

public class EP1226 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        System.out.println(repartoAlumnos(new ArrayList<>(List.of("Yago", "Pepe", "María")), 2));

    }

    static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {

        if (numGrupos > lista.size()) {
            throw new ArithmeticException("no puede haber mas grupos que alumnos");
        }

        List<List<String>> gruposGeneral = new ArrayList<>();
        boolean par = lista.size() % 2 == 0 ? true : false;
        int cantidades = lista.size() / numGrupos;

        int contaodr = 0;
        for (int i = 0; i < numGrupos; i++) {
            List<String> gIndividual = new ArrayList<>();

            System.out.println("Sobrantes: " + lista.size() % numGrupos);
            System.out.println("size: " + lista.size());

            for (int j = 0; j < cantidades; j++) {
                // System.out.println(lista.get());
                gIndividual.add(lista.get(contaodr));
                contaodr++;

            }

            gruposGeneral.add(gIndividual);

        }

        if (!par) {
            int indexSobrante =  lista.size() % numGrupos;
            int contador = 0;
            for (int j = lista.size() - indexSobrante; j < lista.size(); j++) {
                gruposGeneral.get(contador).add(lista.get(j));
                contador++;
            }
        }

        return gruposGeneral;
    }
}
