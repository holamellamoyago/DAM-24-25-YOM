package ud6.Practicas.Biblioteca;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Libro> libros = new TreeMap<>();
        Set<Usuario> usuarios = new TreeSet<>();
        int respuesta = 0;



        do {
            System.out.println("1. Añadir l");
            System.out.println("2. eliminar l");
            System.out.println("3. Añadir u");
            System.out.println("4. eliminar u");
            System.out.println("5. prestar l");
            System.out.println("6. devolver l");
            System.out.println("7. Mostrar por título");
            System.out.println("8. Mostrar usuarios por l cant");
            System.out.println("9. -1 salir"); 

            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1 -> añadirUsuario(usuarios);
                case 4 -> eliminarUsuario(usuarios);
                case 8 -> System.out.println(usuarios);
            }

        } while (respuesta != -1);
        


    }

    static void añadirUsuario(Set<Usuario> usuarios) {
        Scanner sc = new Scanner(System.in);
        String nombre, id;
        System.out.println("Nombre del usuario: ");
        nombre = sc.nextLine();
        System.out.println("ID: ");
        id = sc.nextLine();

        usuarios.add(new Usuario(id, nombre));

    }

    static void eliminarUsuario(Set<Usuario> usuarios){
        Scanner sc = new Scanner(System.in);

        System.out.println("ID del usuario a eliminar: ");
        String id = sc.nextLine();

        Iterator<Usuario> it = usuarios.iterator();
        
        while (it.hasNext()) {
            if (it.next().id.equals(id)) {
                it.remove();
            }
        }
    }
}
