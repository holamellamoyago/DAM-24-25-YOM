package ud2.EjerciciosYOM20241117.funciones;

public class E0404 {

    private static int numMaximo(int n1, int n2){
        if (n1>n2) {
            return n1;
        } else{
            return n2;
        }

        
    }
    public static void main(String[] args) {
        System.out.println(numMaximo(3, 7));
    }
    
}
