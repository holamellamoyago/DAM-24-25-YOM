package ud5.Practicas.MulleresTraballadoras;

public class Artista extends MullerTraballadora {
    String estilo;

    



    public Artista(String nome, String apelidos, int anoNacemento, String estilo) {
        super(nome, apelidos, anoNacemento);
        this.estilo = estilo;
    }


    @Override
    String descricionContribucion() {
        return estilo; // y descripcion?
    }
}
