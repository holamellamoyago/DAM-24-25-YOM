package ud2.EjerciciosFunciones;

public class E0411_MCD {
    private static int calcularMCD(int a, int b) {
        int resultado = 0;

        // if (a>=b) {
        // resultado = calcularMCD(a - b, b);
        // } else if( b> a){
        // resultado = calcularMCD(a, b -a);
        // } else if(b==0){
        // resultado = a;
        // } else{
        // resultado = b;
        // }

        if (a == 0) {
            resultado = b;
        } else if (b == 0) {
            resultado = a;
        } else if (a >= b)
            resultado = calcularMCD(a - b, b);
        else
            resultado = calcularMCD(a, b - a);

        return resultado;

    }

    public static void main(String[] args) {

        System.out.println(calcularMCD(6, 2));
    }
}
