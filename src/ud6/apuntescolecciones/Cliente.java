package ud6.apuntescolecciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Clase Cliente para ejemplos posteriores. 
public class Cliente implements Comparable<Cliente>{ 
    String dni; 
    String nombre; 
    LocalDate fechaNacimiento; 
     
    public Cliente(String dni, String nombre, String fechaNacimiento) { 
        this.dni = dni; 
        this.nombre = nombre; 
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas); 
    } 
 
    private int edad() { 
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS); 
    } 
 
    @Override 
    public boolean equals(Object obj) { 
        return dni.equals(((Cliente)obj).dni); 
    } 
 
    @Override 
    public String toString() { 
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad() + " \n"; 
    } 
 
    @Override 
    public int compareTo(Cliente o) { 
        return dni.compareTo(o.dni); 
    } 

    


    public static void main(String[] args) {
        Collection<Cliente> clientes = new ArrayList<>();
        System.out.println(clientes.size());
        clientes.add(new Cliente("39511342X", "Yago", "11/02/2003"));
        clientes.add(new Cliente("39512312X", "Pepe", "11/02/2003"));
        clientes.add(new Cliente("39512352X", "María", "11/02/2003"));
        clientes.add(new Cliente("39512312X", "Josefa", "11/02/2003"));

        System.out.println(clientes);
        System.out.println();

        System.out.println("\nIMPRESIÓN FOR-EACH");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.nombre);
        }

        System.out.println("\nIMPRESIÓN ITERADOR");
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            System.out.println(c.dni);
            if (c.nombre.equals("Josefa")) {
                it.remove();
            }
        }


        System.out.println(clientes);

        // 31-03
        
    }
} 
