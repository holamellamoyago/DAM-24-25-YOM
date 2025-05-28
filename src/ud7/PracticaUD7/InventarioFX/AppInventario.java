package ud7.PracticaUD7.InventarioFX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ud7.PracticaUD7.InventarioFX.Models.Producto;

public class AppInventario extends Application{
    final static String PATH = "src/ud7/PracticaUD7/InventarioFX/Models/";
    public static Set<Producto> productos = new TreeSet<>();

    public static void main(String[] args) {
        launch(args);

        // Scanner sc = new Scanner(System.in);

        // int respuesta = 0;
        // importarProductos();

        // do {
        //     System.out.println("1. Agregar productos");
        //     System.out.println("2. Listar productos");
        //     System.out.println("3. Buscar por código");
        //     System.out.println("-1 para salir");
        //     respuesta = sc.nextInt();
        //     System.out.println("\n");

            

        //     switch (respuesta) {
        //         case 1 -> anhadirProductos();
        //         case 2 -> listarProductos();
        //         case 3 -> buscarCodigo();
        //     }

        // } while (respuesta != -1);
    }

    public static void anhadirProductos() {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int codigo, cantidad;
        double precio;

        System.out.println("Nombre: ");
        nombre = sc.nextLine();

        System.out.println("Codigo: ");
        codigo = sc.nextInt();

        System.out.println("Cantidad: ");
        cantidad = sc.nextInt();

        System.out.println("Precio: ");
        precio = sc.nextDouble();

        if (!productos.add(new Producto(codigo, codigo, nombre, precio))) {
            System.out.println("Hubo un problema , ya existe ese codigo");
        } else {
            exportarProductos(productos);
        }
    }

    public static void listarProductos() {
        System.out.println(productos);
    }

    public static void buscarCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el código: ");

        int codigo = sc.nextInt();
    
        // for (Producto producto : productos) {
        //     if (producto.equals(new Producto(codigo))) {
        //         System.out.println(producto);
        //     } else{
        //         System.out.println("Producto no encontrado");
        //     }
        // }

        if (productos.contains(new Producto(codigo))) {
            for (Producto producto : productos) {
                if (producto.equals(new Producto(codigo))) {
                    System.out.println(producto);
                }
            }
        } else{
            System.out.println("No se encontro el producto");
            System.out.println("\n");
        }

    }

    public static void importarProductos() {

        File archivo = new File(PATH + "inventario.dat");

        if (!archivo.exists() || archivo == null) {
            productos = new TreeSet<>();
            return;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH + "inventario.dat"))) {
            productos = (Set<Producto>) in.readObject();
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }

    public static void exportarProductos(Set<Producto> productos) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH + "inventario.dat"))) {
            out.writeObject(productos);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(AppInventario.class.getResource("Resources/inventario.fxml")) ;

        Scene scene = new Scene(root);

        primaryStage.setTitle("Inventario");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
