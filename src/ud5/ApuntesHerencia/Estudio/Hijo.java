

package ud5.ApuntesHerencia.Estudio;

public class Hijo extends Padre{
    String nombreHijo;

    public Hijo(String nombrePadre, String nombreHijo) {
        super(nombrePadre);
        this.nombreHijo = nombreHijo;
    }


    public static void main(String[] args) {
        Hijo hijo = new Hijo("Juasn", "Yago");

        System.out.println(hijo.nombrePadre);
    }
    
    
    
}
