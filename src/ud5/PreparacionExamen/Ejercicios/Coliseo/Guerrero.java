package ud5.PreparacionExamen.Ejercicios.Coliseo;

public class Guerrero {
    enum Tipo {LANZADOR, DEFENSOR,ASESINO}
    String nombre;
    int edad, habilidad;
    Tipo tipo;

    public Guerrero(String nombre, int edad, int habilidad, Tipo tipo) {
        this.nombre = nombre;
        this.edad = comprobarNumerico(edad);
        this.habilidad = comprobarNumerico(habilidad);
        this.tipo = tipo;


    }

    private int comprobarNumerico(int n){
        if (n < 0) {
            throw new ArithmeticException("Numero negativo no válido");
        }

        return  n;
    }

    
}
