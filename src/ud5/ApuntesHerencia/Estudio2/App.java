package ud5.ApuntesHerencia.Estudio2;

import ud5.ApuntesHerencia.Estudio.Padre;

public class App {
    public static void main(String[] args) {
        
        mostrarNombre();
        
    }
    
    static void mostrarNombre(){
        Hijo hijo = new Hijo("Juasn", "Yago", "MAria");
        System.out.println(hijo.nombrePadre);
        System.out.println(((Padre)hijo).nombrePadre);
    }
}
