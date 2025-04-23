package ud6.apuntescolecciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Clase Cliente para ejemplos posteriores. 
public class Cliente implements Comparable<Cliente>{ 
    String dni; 
    String nombre; 
    String fechaNacimiento; 
    public int edad;
     
    public Cliente(String dni, String nombre, String fechaNacimiento, int edad) { 
        this.dni = dni; 
        this.nombre = nombre; 
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    } 

    public Cliente(String dni, String nombre, String fechaNacimiento) { 
        this.dni = dni; 
        this.nombre = nombre; 
        this.fechaNacimiento = fechaNacimiento;
    } 
 
 
    @Override 
    public boolean equals(Object obj) { 
        return dni.equals(((Cliente)obj).dni); 
    } 
 
    @Override 
    public String toString() { 
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: "  + " \n"; 
    } 
 
    @Override 
    public int compareTo(Cliente o) { 
        return dni.compareTo(o.dni); 
    } 

    



    public int getEdad() {
        return edad;
    }

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

        public static List<Cliente> clientesDeEjemplo() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("34534534Z", "Pepe", "20/12/2000"));
        clientes.add(new Cliente("34534534Z", "Pepe", "20/12/2000"));
        clientes.add(new Cliente("34555534Z", "María", "20/12/2000"));
        clientes.add(new Cliente("22222234Z", "Lola", "20/12/2000"));
        return clientes;
    } 
} 
