package ud6.ApuntesGenericos2;

import java.util.Comparator;

public class Contenedor<T extends Number, V>{
    private T objeto;
    private V dni;

    public Contenedor() {
    }

    void guardar(T objeto){
        this.objeto = objeto;
    }

    void guardarDNI(V dni){
        this.dni = dni;
    }

    T extraer(){
        T res = objeto;
        objeto = null;
        return res;
    }

    public static void main(String[] args) {
        Contenedor<Integer, String> c = new Contenedor<>();
        c.guardarDNI(new String("Hola"));

        
        Comparator<Integer> ordenInteger = Comparator.naturalOrder();

    }
}
