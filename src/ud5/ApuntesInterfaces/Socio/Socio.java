package ud5.ApuntesInterfaces.Socio;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Socio implements Comparable { 
    int id; 
    String nombre; 
    LocalDate fecha;

    
 

    public Socio(int id, String nombre, LocalDate fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fechaAlta;
    }

    


    @Override
    public String toString() {
        return id + "-" + nombre + " " + fecha;
    }




    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Socio s = new Socio(2, "Aaria", LocalDate.of(2003 , 02, 11));
        Socio s2 = new Socio(1, "Aaria", LocalDate.of(2003, 02, 11));
        

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
            new Socio(5, "paco",LocalDate.of(2006, 02, 11)),
            new Socio(3, "Jose", LocalDate.of(2013, 02, 11)),
            new Socio(4, "Jose", LocalDate.of(2017, 02, 11))
        };

        System.out.println(Arrays.toString(socios));

        ComparaSociosFecha ordenFecha = new ComparaSociosFecha();
        
        Comparator compaNombre = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return ((Socio) o1).id - ((Socio) o2).id;
            }
            
        };

        Arrays.sort(socios, new E0909() );

        System.out.println(Arrays.toString(socios));
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Socio other = (Socio) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        return true;
    }




    @Override
    public int compareTo(Object o) {
        Socio socio = (Socio) o;

        int res = fecha.compareTo(socio.fecha);

        if (res == 0) {
            res = nombre.compareTo(socio.nombre);
        }

        if (res == 0) {
            res = id - socio.id;
        }

        return res;
        
    }



    


    // @Override
    // public int compareTo(Object o) {

    //     Socio nuevoSocio = (Socio) o;

    //     int res =  nombre.compareTo(nuevoSocio.nombre);

    //     if (res == 0) {
    //         res = nuevoSocio.id -id ;
    //     }

    //     return res;
    //     // Para ordenarlo al revés 
    //     // return -nombre.compareTo(nuevoSocio.nombre);


    // }


    // @Override
    // public int compareTo(Object o) {
    //     Socio otroSocio = (Socio) o;
    //     int res = id - otroSocio.id;
    //     return res;
    // }
 
    
} 
