import java.util.Locale;
import java.util.Scanner;

public class EP0122 {
    public static void main(String[] args) {

        double gradosF , gradosC;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        System.out.println("Cuantos son los grados Farenheit?");
        gradosF = sc.nextDouble();
        sc.close();
        gradosC = 5.0/9.0 * (gradosF - 32);

        System.out.println("esta temperatura en grafos celsius son: " + gradosC);
        
    }
}
