import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Pareja p1 = new Pareja("Yago");


        int rnd = new Random().nextInt(1, 2);
        System.out.println(rnd);

        switch (rnd) {
            case 1 -> {
                return p1.nombre1;
            }


            default:


        }


    }
}
