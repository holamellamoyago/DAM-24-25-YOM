package ud5.clasesejercicios.E0804;

import java.util.Arrays;

public class Flauta extends Instrumento {

    Instrumento instrumento;

    @Override
    void interepretar() {
        System.out.println(Arrays.toString(notasMusicales));
        
    }
}
