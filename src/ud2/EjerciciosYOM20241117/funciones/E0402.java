package ud2.EjerciciosYOM20241117.funciones;

public class E0402 {

    private static void numsComprendidos(int n1, int n2){
        for(int i = n1 ; i>=n2; i--){
            System.out.print(i + " ");
        }

    }
    public static void main(String[] args) {
        numsComprendidos(12, 3);
    }
}
