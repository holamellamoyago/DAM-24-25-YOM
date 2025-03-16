package ud5.clasesejercicios.E0706;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

// No terminado

public class Texto {

    String informacionTexto, texto;
    LocalDateTime fechaCreado, fechaUltimaModificacion;
    int longitudMaxima;

    

    public Texto(String informacionTexto, String texto, LocalDateTime fechaCreado,
            LocalDateTime fechaUltimaModificacion, int longitudMaxima) {
        this.informacionTexto = informacionTexto;
        this.texto = texto;
        this.longitudMaxima = longitudMaxima;

        this.fechaCreado = LocalDateTime.now();
        this.fechaUltimaModificacion = LocalDateTime.now();
    }

     String anhadirCaracterPrincipio(char c){
        texto = c+this.texto;
        fechaUltimaModificacion = LocalDateTime.now();

        return texto;
    }

    
}


