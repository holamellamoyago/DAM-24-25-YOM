package ud2;

public class Util {
    static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || anho % 4 == 0 && anho % 100 != 0;
    }

    static int mayorQue(int n1, int n2){
        return n1>n2 ? n1 : n2;
    }

    static boolean esCasiCero(int n){
        if(n == 0){
            return false;
        } else if(n<1){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(esPar(2));
        System.out.println(esBisiesto(2025));
        System.out.println(mayorQue(353, 55));
        System.out.println(es);
    }
}
