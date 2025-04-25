package ud6.Practicas.FestivalMeigas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Feitizo f = new Feitizo("La maldicion del prog", new String[]{"Ordenador"}, 2);

        System.out.println(f.feitizosUsanIngrediente("Ordenador", Arrays.asList(new Feitizo[]{f})));
    }
}
