package ud5.ApuntesHerencia.Estudio2;

import ud5.ApuntesHerencia.Estudio.Padre;

public class Hijo extends Padre{
    String nombreHijo;
    public String nombrePadre;

    public Hijo(String nombrePadre, String nombreHijo, String nombrePadre2) {
        super(nombrePadre);
        this.nombreHijo = nombreHijo;
        nombrePadre = nombrePadre2;
    }


    
}
