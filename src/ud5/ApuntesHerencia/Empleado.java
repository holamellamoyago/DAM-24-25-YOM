package ud5.ApuntesHerencia;

public class Empleado extends Persona {
    double salario;
    String estatura;

    Empleado(){

    }

    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(String nombre, int edad, String estatura, double salario) {
        super(nombre, edad);
        this.estatura = estatura;
        this.salario = salario;
    }





    @Override
    public void mostrarDatos() {
        System.out.println("EMPLEADO:");
        System.out.println(nombre);
        System.out.println(estatura);
        System.out.println(salario);
    }

    public static void main(String[] args) {
        Empleado maria = new Empleado("María", 200);
        Empleado pepe = new Empleado("Pepe", 21, "XL", 2000);
        pepe.setApellido2("Moncho");
        // System.out.println(pepe.getEdad());

        
        Persona p = pepe;
        System.out.println(p.estatura);
        p.mostrarDatos();

        Empleado nuevoPepe = (Empleado) p;
        System.out.println(nuevoPepe.estatura);
        nuevoPepe.mostrarDatos();



    }
}
