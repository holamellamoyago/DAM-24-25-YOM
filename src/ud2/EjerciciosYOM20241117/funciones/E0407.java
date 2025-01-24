package ud2.EjerciciosYOM20241117.funciones;

public class E0407 {
    private static boolean esPrimo(int n) {
        System.out.println("Los divisores son: ");
        for (int i = 2; i <=n; i++) {

            if (n%i == 0) {
                System.out.print(i + " ");
            }



        }
        return true;
        
    }

    public static void main(String[] args) {
        System.out.println(esPrimo(45));
    }
}
