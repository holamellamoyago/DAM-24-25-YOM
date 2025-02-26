package ud5.clasesejercicios.EP0821;

public class EP0821 {


    static boolean esNumero(Object ob){
        return ob instanceof Number;
    }

    public static void main(String[] args) {
        double n = 3.3;
        Integer n3 = 4;
        String s = "Hola";

        // int n2 = (int)n;

        System.out.println(esNumero(n));
        System.out.println(esNumero(s));

        // Double n2 = (double) n;
        // System.out.println(n.getClass().getSimpleName());

        
        

    }
}
