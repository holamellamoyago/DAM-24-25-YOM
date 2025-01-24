package ud2.EjerciciosYOM20241117.Propuestos;

public class EP0315_Triangulo_Pascal {
    public static void trianguoPascal(int num){

        for(int i = 0; i < num; i++){
            for( int j = 0; j<=i; j++){
                System.out.print("1");
                long valor = factorial(i) / factorial(j) * factorial(i-j);
                System.out.println(valor + " ");
            }
            System.out.println();
        }     

    }

    public static long factorial(int n){
        if (n==0) {
            return 1;
        } else {
            return n* factorial(n-1);
        }
    }

    
    public static void main(String[] args) {
        trianguoPascal(5);
    }
    
}
