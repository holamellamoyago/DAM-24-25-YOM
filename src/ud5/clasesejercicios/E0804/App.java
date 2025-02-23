package ud5.clasesejercicios.E0804;

import ud5.clasesejercicios.E0804.Instrumento.Nota;

public class App {
    public static void main(String[] args) {
        Instrumento flauta = new Flauta();

        flauta.add(Nota.DO);

        flauta.interepretar();
    }
}
