package ud5.ApuntesHerencia;

public class Estudiante extends Persona {
    String curso;

    public Estudiante(String nombre, String curso) {
        super(nombre);
        this.curso = curso;
    }



    @Override
    public void mostrarDatos() {
        System.out.println("ESTUDIANTE");
        System.out.println(nombre + " - " + curso);
        super.mostrarDatos();
    }

    public static void main(String[] args) {
        Persona[] p = new Persona[5];

        p[0] = new Persona("Marta");
        p[1] = new Empleado("Marta" , 2000);
        p[2] = new Estudiante("Yago", "Primero");
        
        for (int i = 0; i < p.length; i++) {
            p[i].mostrarDatos();

            if (p[i] instanceof Estudiante) {
                System.out.println("Practucas");
            }
        }


    }

    
}
