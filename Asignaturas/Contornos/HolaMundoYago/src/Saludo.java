public class Saludo {
    String nombre;


    public Saludo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void saludar (){
        System.out.println("Hola " + this.nombre);
    }
}
