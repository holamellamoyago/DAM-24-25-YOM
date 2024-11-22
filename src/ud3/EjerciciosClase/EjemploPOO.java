package ud3.EjerciciosClase;

public class EjemploPOO {
    public static void main(String[] args) {
   
        //se crea un objeto de tipo Persona
        Persona p ;
        p = new Persona(); 
    
        //se utilizan los métodos definidos en la clase Persona                                    
        p.inicializar("Yago","Otero","Martínez",21);
        String nombre2 = p.nombreCompleto();
        if(p.esMayorEdad()){
           System.out.println(nombre2 + " es mayor de edad");
        }else{
           System.out.println(nombre2 + " no es mayor de edad");
        }

        Persona p2;
        p2 = new Persona();

        p2.inicializar("Maria", "Ape1", "Ape2", 33);
        p2.inicializar("Fernando", "Alonso", "Díaz", 33);

        System.out.println(p2.nombreCompleto());

        System.out.println(Persona.contadorPersonas);
        Persona.incrementarContador();
        System.out.println(Persona.contadorPersonas);

        Persona p4 = null;
        p4 = p;
        p4.incrementarAnhos();
        System.out.println(p4.getEdad());

        System.out.println(p4.nombreCompleto() + " tiene " + p4.getEdad() + " años");
    }
}
