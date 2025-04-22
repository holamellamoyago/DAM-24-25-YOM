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
    public int edad;
     
    public Cliente(String dni, String nombre, String fechaNacimiento, int edad) { 
        this.dni = dni; 
        this.nombre = nombre; 
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas); 
        this.edad = edad;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
} 
