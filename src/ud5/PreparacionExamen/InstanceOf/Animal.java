package ud5.PreparacionExamen.InstanceOf;

public class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }


        public static void main(String[] args) {
            int contadorPerros = 0;
            int contadorGatos = 0;

            Animal[] animales = {
                    new Perro("Rex"),
                    new Gato("Misu"),
                    new Perro("Bobby"),
                    new Gato("Luna")
            };

            for (Animal animal : animales) {
                // Aquí debes usar instanceof para verificar el tipo de animal
               if (animal instanceof Perro) {
                    contadorPerros++;
               } 

               if (animal instanceof Gato) {
                    contadorGatos++;
               }
            }

            System.out.println(contadorGatos);
            System.out.println(contadorPerros);
        }
    }

