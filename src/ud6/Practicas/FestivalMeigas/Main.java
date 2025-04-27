package ud6.Practicas.FestivalMeigas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Feitizo f = new Feitizo("La maldicion del prog", new String[]{"Ordenador"}, 2);
        Feitizo f2 = new Feitizo("Pepa la bd", new String[]{"bd"}, 2);

        // System.out.println(f.feitizosUsanIngrediente("Ordenador", Arrays.asList(new Feitizo[]{f})));
        // System.out.println(Feitizo.ingredientesVecesUsados(feitizos));

        // System.out.println(Feitizo.getFeitizosRnd(feitizos));


        
        Set<Feitizo> feitizos = new TreeSet<>();
        feitizos.add(f);

        Map<String, Integer> inventarioF = new TreeMap<>();
        inventarioF.put("Ordenador", 1);



        Meiga m = new Meiga("Bruxa Maruxa", "xd", feitizos, inventarioF);


        m.lanzarFeitizo(f);
        m.lanzarFeitizo(f);
    }
}
