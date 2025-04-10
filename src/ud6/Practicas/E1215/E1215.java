package ud6.Practicas.E1215;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.google.gson.Gson;
import ud6.Practicas.E1215.Fichero;

public class E1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> productos = importarProductos();
        int respuesta = 0;

        do {
            System.out.println("\nSelecciona que te gustaría hacer: ");
            System.out.println("1. Añadir producto");
            System.out.println("2. Borrar producto");
            System.out.println("3. Listar");
            System.out.println("4. Cerrar");

            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    añadirProductos(productos);
                    break;
                case 2:
                    borrarProductos(productos);
                    break;
                case 3:
                    System.out.println("\n" + productos);
                    break;

                case 4: 
                    exportarProductos(productos);
                default:
                    
                    break;
            }

        } while (respuesta != 4);

    }

    static void exportarProductos(Map<String, String> productos) {
        Gson gson = new Gson();

        String s = gson.toJson(productos);
        Fichero.writeStringToFile(s, "src/ud6/Practicas/E1215/productos.txt");
        
    }

    static Map<String,String> importarProductos(){
        Gson gson = new Gson();
        Map<String, String> productos = new TreeMap<>();

        String json = Fichero.readFileToString("src/ud6/Practicas/E1215/productos.txt");
        productos = gson.fromJson(json, Map.class);

        if (productos == null) {
            return new TreeMap<String,String>();
        }else{
            return productos;
        }
        
    }

    static Map<String, String> añadirProductos(Map<String, String> productos) {
        Scanner sc = new Scanner(System.in);
        boolean creado = false;

        do {
            System.out.println("\n Codigo del producto:");
            String codigo = sc.nextLine();

            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            if (productos.containsKey(codigo)) {
                System.out.println("Ya tienes un producto con esa referencia,");
                System.out.println("(1)Te gustaría sobrescribirlo o (2)cambiar código");
                int respuesta = sc.nextInt();

                if (respuesta == 1) {
                    productos.put(codigo, nombre);
                } else if (respuesta == 2) {
                    añadirProductos(productos);
                }
            } else {
                productos.put(codigo, nombre);
            }
        } while (creado);

        return productos;

    }

    static Map<String, String> borrarProductos(Map<String, String> productos){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCódigo del producto a borrar: ");
        String codigo = sc.nextLine();

        if (productos.containsKey(codigo)) {
            productos.remove(codigo);
        } else{
            System.out.println("No se encontro el producto especificado");
        }

        return productos;
    }


}
