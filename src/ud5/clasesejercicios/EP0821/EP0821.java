package ud5.clasesejercicios.EP0821;

public class EP0821 {

    static boolean esNumero(Object ob) {
        return ob instanceof Number;
    }

    static boolean sumar(Object a, Object b) {
        if (esNumero(a) && esNumero(b)) {
            Double r = (((Number) a).doubleValue() + ((Number) b).doubleValue());

            if (r - r.longValue() == 0) {

            }
        } else if (a instanceof String && b instanceof String) {
            System.out.println("La concatenacion es: " +a + b);
        } else{
            System.out.println("No sumables");
        }

        return true;
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
