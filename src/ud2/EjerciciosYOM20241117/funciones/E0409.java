package ud2.EjerciciosYOM20241117.funciones;

public class E0409 {

    private static int numMaximo(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }

    }

    public static void main(String[] args) {
        System.out.println(numMaximo(11, 17, 9));
    }

}
