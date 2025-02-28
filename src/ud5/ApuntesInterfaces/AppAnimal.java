package ud5.ApuntesInterfaces;

public class AppAnimal {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Caracol caracol = new Caracol();
        Leon leon = new Leon();

        // System.out.println(Sonido.version);
        // System.out.println(Perro.version);

        // perro.voz();
        // perro.vozDurmiendo();
        // leon.voz();

        // Sonido.bostezo();

        Sonido s = perro;
        s.voz();
        s= gato;
        s.voz();

        System.out.println("\nPoliformismo con interfaces\n");

        Sonido[] sonidos ={ perro, gato, leon};

        for (Sonido sonido : sonidos) {
            System.out.println("Esto es un ..." + sonido.getClass().getSimpleName());
            sonido.voz();
            sonido.vozDurmiendo();
        }

        System.out.println("\n CLASES ANÓNIMAS\n");
        Sonido son = () -> System.out.println("jajajejejijijoo");

        // Sonido son = new Sonido (){

        //     @Override
        //     public void voz() {
        //         System.out.println("JAJEJIJOJU");
                
        //     }
            
        // };

        son.voz();
        son.vozDurmiendo();
    }
}
