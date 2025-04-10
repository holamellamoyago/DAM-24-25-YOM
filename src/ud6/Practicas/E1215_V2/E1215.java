package ud6.Practicas.E1215_V2;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.google.gson.Gson;
import ud6.Practicas.E1215.Fichero;

public class E1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Producto, Integer> productos = importarProductos();
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
                    // borrarProductos(productos);
                    break;
                case 3:
                    
                    System.out.println("toString() del mapa:");
                    System.err.println(productos);

                    System.out.println("\nIterando el conjunto de entradas");
                    Set<Map.Entry<Producto, Integer>> entradas = productos.entrySet();
                    Iterator<Map.Entry<Producto, Integer>> it = entradas.iterator();
                    while (it.hasNext()) {
                        Map.Entry<Producto, Integer> entrada = it.next();
                        System.out.println("- " + entrada.getKey() + "(" + entrada.getValue() + ")");
                    }


                    break;

                case 4: 
                    // exportarProductos(productos);
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

    static Map<Producto,Integer> importarProductos(){
        Gson gson = new Gson();
        Map<Producto, Integer> productos = new TreeMap<>();

        String json = Fichero.readFileToString("src/ud6/Practicas/E1215/productos.txt");
        productos = gson.fromJson(json, Map.class);

        if (productos == null) {
            return new TreeMap<Producto,Integer>();
        }else{
            return productos;
        }
        
    }

    static Map<Producto, Integer> añadirProductos(Map<Producto, Integer> productos) {
        Scanner sc = new Scanner(System.in);
        boolean creado = false;

        do {
            System.out.print("\n Codigo del producto:");
            String codigo = sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Unidades: ");
            int unidades = sc.nextInt();

            Producto pNuevo = new Producto(codigo, nombre);

            

            

            if (productos.containsKey(pNuevo)) {
                System.out.println("Ya tienes un producto con esa referencia,");
                System.out.println("(1)Te gustaría sobrescribirlo o (2)cambiar código");
                int respuesta = sc.nextInt();

                if (respuesta == 1) {
                    productos.put(pNuevo, unidades);
                } else if (respuesta == 2) {
                    añadirProductos(productos);
                }
            } else {
                productos.put(pNuevo, unidades);
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
