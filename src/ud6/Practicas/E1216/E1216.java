package ud6.Practicas.E1216;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.google.gson.Gson;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class E1216 {
    public static void main(String[] args) {
        List<String> listado = new ArrayList<>();
        Map<Character, Academico> mapa = new TreeMap<>();

        mapa = importarAutores();

        System.out.println("\n LISTADO SIN LETRA POR NOMBRE: ");
        System.out.println(mostarSinLetraPorNombre(mapa));

        System.out.println(mapa);

    }

    static Map<Character, Academico> importarAutores() {
        Gson gson = new Gson();
        List<String> listado = new ArrayList<>();
        Map<Character, Academico> academicos = new TreeMap<>();

        String json = Fichero.readFileToString("src/ud6/Practicas/E1216/datos.txt");
        // listado = gson.fromJson(json, List.class);

        String[] autores2 = json.split("\n");
        // System.out.println(Arrays.toString(autores2));

        for (String string : autores2) {
            listado.add(string);
        }

        for (String string : listado) {
            academicos.put((Character)string.charAt(6), new Academico(string.substring(7, string.length() - 6), 2002));
        }

        return academicos;
    }

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {

        if (!Character.isLetter(letra)) {
            throw new ArithmeticException("El carácter pasado no es letra");
        }

        academia.put(letra, nuevo);



        return true;
    }

    static List<String> mostarSinLetraPorNombre(Map<Character, Academico> mapa){
        List<String> listado = new ArrayList<>();

        mapa.values();

        for (Academico academico : mapa.values()) {
            listado.add(academico.nombre);
        }

        listado.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
                
            }
        });

        return listado;
    }

}
