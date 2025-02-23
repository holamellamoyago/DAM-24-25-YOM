package ud5.EjerciciosGPT.Biblioteca;

import java.util.Arrays;

public class Libro extends Recurso {
    
    String capitulos []= new String[0];

    public Libro(String titulo, String autor, String[] capitulos) {
        super(titulo, autor);
        this.capitulos = capitulos;
    }

    public Libro(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    void mostrarDetalles() {
        // TODO Auto-generated method stub
        
    }

     public String[] agregarCapitulo(String capitulo){
        capitulos = Arrays.copyOf(capitulos, capitulos.length+1);

        capitulos[capitulos.length-1] = capitulo;


        return this.capitulos;
    }
}
