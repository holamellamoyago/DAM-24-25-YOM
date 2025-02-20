package ud5.clasesejercicios.E0801;

public class App {
    public static void main(String[] args) {
        Hora hora = new Hora(22, 58);

        hora.inc();

        System.out.println(hora.toString());
    }
}
