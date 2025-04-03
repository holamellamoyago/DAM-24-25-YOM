package ud6.Practicas.E1211;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E1211 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;

        TreeSet<Socio> listadoSocios = new TreeSet<>();
        listadoSocios = importarSocios();

        do {
            System.out.println("\nBienvenido, que desea: ");
            System.out
                    .println(
                            "1. Alta\n2. Baja\n3. Modificación\n4. Listado por DNI\n5.Listado por Antiguedad\n6. Salir y guardar");
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1 -> listadoSocios = altaUsuario(listadoSocios);
                case 2 -> listadoSocios = bajaUsuario(listadoSocios);
                case 3 -> modificacionUsuario(listadoSocios);
                case 4 -> listadoPorDNI(listadoSocios);
                case 5 -> listadoPorAntiguedad(listadoSocios);
            }
        } while (respuesta != 6);

        exportarSocios(listadoSocios);

    }

    static boolean exportarSocios(TreeSet<Socio> socios) {
        // Exportar Persona[] a JSON
        Gson gson = new Gson();
        // …

        try {
            String json = gson.toJson(socios);
            writeStringToFile(json, "socios.json");

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;

        }
    }

    static TreeSet<Socio> importarSocios() {
        // Importar JSON en Persona[]

        Gson gson = new Gson();
        Socio[] p = new Socio[0];

        String json = readFileToString("socios.json");
        p = gson.fromJson(json, Socio[].class);

        TreeSet<Socio> conjuntoSocios = new TreeSet<>(Arrays.asList(p));

        return conjuntoSocios;
    }

    static TreeSet<Socio> altaUsuario(TreeSet<Socio> socios) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre de usuario: ");
        String usuario = sc.nextLine();

        System.out.println("DNI: ");
        Socio nuevoSocio = new Socio(sc.nextLine(), usuario);

        for (Socio socio : socios) {
            if (socio.equals(nuevoSocio)) {
                System.out.println("El usuario ya existe en la BD");
            }
        }

        socios.add(nuevoSocio);

        return socios;

    }

    static TreeSet<Socio> bajaUsuario(TreeSet<Socio> socios) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;

        Iterator<Socio> it = socios.iterator();

        System.out.println("Dime el DNI del socio: ");
        Socio socioParaEliminar = new Socio(sc.nextLine());

        while (it.hasNext()) {
            Socio socioActual = it.next();
            if (socioActual.equals(socioParaEliminar)) {
                it.remove();
                System.out.println("Socio eliminado");
                encontrado = true;
                break;
            } 

            if (!encontrado) {
                System.out.println("Socio no encontrado");
            }
        }

        return socios;

    }

    static boolean modificacionUsuario(TreeSet<Socio> socios) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Dime el DNI del socio a modificar: ");
        Iterator<Socio> it = socios.iterator();

        while (it.hasNext()) {
            Socio socioModificar = new Socio(sc.nextLine());
            // if (condition) {
                
            // }
        }

        return false;

    }

    static void listadoPorAntiguedad(TreeSet<Socio> socios) {

    }

    static void listadoPorDNI(TreeSet<Socio> socios) {

        System.out.println("SOCIOS: ");
        for (Socio socio : socios) {
            System.out.println(socio.toString());
        }
    }

    // Guardar y leer JSON a y desde un archivo de texto en disco

    /**
     * Crea un fichero de texto con el contenido de un String
     * 
     * @param str
     * @param filePath
     */
    public static void writeStringToFile(String str, String filePath) {
        try {
            // Creamos un objeto FileWriter que nos permitirá escribir en el fichero
            FileWriter writer = new FileWriter(filePath);

            // Escribimos el String en el fichero
            writer.write(str);

            // Cerramos el fichero
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lee y carga el contenido de un fichero de texto a un String
     * 
     * @param filePath
     * @return
     */
    public static String readFileToString(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try {
            // Creamos un objeto FileReader que nos permitirá leer el fichero
            FileReader reader = new FileReader(filePath);

            // Creamos un buffer para leer el fichero de forma más eficiente
            BufferedReader buffer = new BufferedReader(reader);

            // Leemos el fichero línea a línea
            String line;
            while ((line = buffer.readLine()) != null) {
                // Vamos añadiendo cada línea al StringBuilder
                fileContent.append(line);
                // Añadimos un salto de línea al final de cada línea
                fileContent.append("\n");
            }

            // Cerramos el buffer y el fichero
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero.");
            // e.printStackTrace();
        }

        // Devolvemos el contenido del fichero como un String
        return fileContent.toString();
    }

}