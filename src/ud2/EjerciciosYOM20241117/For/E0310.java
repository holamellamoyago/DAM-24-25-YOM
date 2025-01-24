package ud2.EjerciciosYOM20241117.For;

public class E0310 {
    
    public static void main(String[] args) {
        int sumatotal = 0, contador = 0;


        for(int i = 1; contador<11; i++){
            if (i % 2 != 0) {
                System.out.println(i + " Es impar");
                sumatotal = i + sumatotal;
                contador++;
            }
        }

        System.out.println("La suma de los numeros impares fue: " + sumatotal);
    }
}
