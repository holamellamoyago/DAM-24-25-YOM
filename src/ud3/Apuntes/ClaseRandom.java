package ud3.Apuntes;

import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {
        int contador = 0;
        Random random = new Random();
        int num;

        
        
        do {
            num = random.nextInt(-360,360);
            contador++;
            System.out.println(contador + " " + num);
            
        } while (num != -1);

        System.out.println(num);
    }
}
