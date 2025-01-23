package ud4.Ejercicios;

public class E0602 {
    public static void main(String[] args) {
        String f1 = "Holaa mundo";
        String f2 = "Holaa mundo Yago";

        if (f1.length() > f2.length()) {
            System.out.println("La frase f1 es mas larga");
        } else if(f2.length() == f1.length()){
            System.out.println("Son de igual largo");
        } else{
            System.out.println("La frase f2 es mas larga");

        }
    }
}
