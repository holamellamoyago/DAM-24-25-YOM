package ud5.interfacesejercicios.EP0928_Alumnos;

import java.util.Arrays;

public class Alumno implements Comparable{
    String nombre, apellidos;
    int edad;
    double notaMedia;

    public Alumno(String nombre, String apellidos, int edad, double notaMedia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno) o;
        return this.apellidos.compareTo(a.apellidos);
    }

    @Override
    public String toString() {
        return nombre +  " ( " + notaMedia + " )";
    }

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];

        // Añadir 5 alumnos al array
        alumnos[0] = new Alumno("Juan", "Pérez García", 20, 7.5);
        alumnos[1] = new Alumno("Ana", "López Martínez", 19, 7.5);
        alumnos[2] = new Alumno("Luis", "González Sánchez", 21, 6.8);
        alumnos[3] = new Alumno("María", "Fernández Ruiz", 22, 9.1);
        alumnos[4] = new Alumno("Carlos", "Martín Díaz", 20, 5.9);
        
        Arrays.sort(alumnos, new ComparadorNota());

        System.out.println(Arrays.toString(alumnos));
    }

    

    
}
