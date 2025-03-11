package ud5.ApuntesInterfaces.Socio;

import java.util.Arrays;

public class Socio implements Comparable { 
    int id; 
    String nombre; 

    
 

    public Socio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    


    @Override
    public String toString() {
        return id + "-" + nombre;
    }




    public static void main(String[] args) {
        Socio s = new Socio(2, "Maria");
        Socio s2 = new Socio(1, "Lolo 2");
        

        if (s.compareTo(s2) == 0) {
            System.out.println("Son iguales");
        } else if (s.compareTo(s2) < 0) {
           System.out.println(s.nombre + " Es menor que " + s2.nombre); 
        } else{
            System.out.println(s.nombre + " Es mayor que " + s2.nombre); 
        }

        System.out.println("ARRAY DE SOCIOS ORDENADO");
        Socio[] socios = {
            s, 
            s2,
            new Socio(5, "paco"),
            new Socio(3, "Jose"),
            new Socio(4, "Jose")
        };

        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios);

        System.out.println(Arrays.toString(socios));
    }




    @Override
    public int compareTo(Object o) {

        Socio nuevoSocio = (Socio) o;

        int res =  nombre.compareTo(nuevoSocio.nombre);

        if (res == 0) {
            res = nuevoSocio.id -id ;
        }

        return res;
        // Para ordenarlo al revés 
        // return -nombre.compareTo(nuevoSocio.nombre);


    }


    // @Override
    // public int compareTo(Object o) {
    //     Socio otroSocio = (Socio) o;
    //     int res = id - otroSocio.id;
    //     return res;
    // }
 
    
} 
