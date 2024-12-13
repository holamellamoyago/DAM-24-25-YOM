package ud3.EjercicioYago;

public class JugadorDardo {
    enum Sexo {
        HOMBRE, MUJER
    }

    private String nombre;
    private int edad;
    private Sexo sexo;
    private int PUNTOS; 

    public JugadorDardo(String nombre, int edad, String sexo) {

        try {
            sexo = sexo.toUpperCase();
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = (Sexo.valueOf(sexo));
            this.PUNTOS = 316;

        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }

    }






        

    public String getNombre() {
        return nombre;
    }








    public int getPUNTOS() {
        return PUNTOS;
    }


    public void setPUNTOS(int pUNTOS) {
        PUNTOS = pUNTOS;
    }




    public void mostrarInformacion() {
        System.out.println(nombre + " " + edad + " " + sexo + " puntos " + PUNTOS);
    }


    public static void main(String[] args) {
        JugadorDardo jg = new JugadorDardo("Yago", 21, "hombre");


        System.out.println(jg.getPUNTOS());
    }

}
