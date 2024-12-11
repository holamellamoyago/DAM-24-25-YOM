package ud3.Test;

public class Clase {
    private String nombre;
    private int edad;
    private String apellido1;

    public Clase(String nombre, int edad, String apellido1) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido1 = apellido1;
    }

    public Clase(String nombre, int edad){
        this(nombre, edad, ""); // Aquí me falto poner apellido
    }

    public Clase(String nombre){
        this(nombre, 21, "apellido1");
    }

    public Clase(){
        this("", 99, "");
    }


    int n = 5;
    Integer n2 = n;

    String s1 = "25", s2="82.2";


    int n3 = Integer.parseInt(s1);
    double n4 = Double.parseDouble(s2);

    Integer n5 = Integer.valueOf(s1);
    Double n6 = Double.valueOf(s2);
    


    
}
