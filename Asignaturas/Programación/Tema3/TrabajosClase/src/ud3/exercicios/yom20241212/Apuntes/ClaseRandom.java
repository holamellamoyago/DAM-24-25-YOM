package ud3.Apuntes;

import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(-360,360);

        System.out.println(num);
    }
}
