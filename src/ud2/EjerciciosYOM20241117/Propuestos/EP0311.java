package ud2.EjerciciosYOM20241117.Propuestos;

public class EP0311 {
    public static void main(String[] args) {

        int n = 4;
        String binario = "";

        while (n / 2 > 0) {
            binario = binario + (n % 2);
            n = n / 2;

        }
        binario = n + binario;

        System.out.println(binario);
    }
}
