package ud5.clasesejercicios.E0804;

import java.util.Arrays;

// Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una melodía (dentro de una misma octava). El método add() añade nuevas notas musicales. La clase también dispone del método abstracto interpretar() que, en cada subclase que herede de Instrumento, mostrará por consola las notas musicales según las interprete. Utilizar enumerados para definir las notas musicales.

public abstract  class Instrumento {
    public enum Nota {
        DO, RE, MI, FA, SOL, LA, SI
    }

    Nota nota;

    Nota notasMusicales[] = new Nota [0]; 

    Nota[] add(Nota nota){
        this.notasMusicales = Arrays.copyOf(this.notasMusicales, this.notasMusicales.length+1);

        notasMusicales[notasMusicales.length-1] = nota;

        return notasMusicales;
    }

    abstract void interepretar();
    
}
