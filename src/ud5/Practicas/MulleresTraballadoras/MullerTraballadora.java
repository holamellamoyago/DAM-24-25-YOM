package ud5.Practicas.MulleresTraballadoras;

import java.time.Year;

public abstract class MullerTraballadora {
    String nome, apelidos;
    int anoNacemento;

    public MullerTraballadora(String nome, String apelidos, int anoNacemento) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.anoNacemento = anoNacemento;
    }

    abstract String descricionContribucion();

    int getIdade(int anoActual) {
        return anoActual - anoNacemento;
    }
}
