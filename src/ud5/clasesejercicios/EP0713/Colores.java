package ud5.clasesejercicios.EP0713;

import java.util.Arrays;

public class Colores {
    String[] colores = {"ROJO", "VERDE", "VIOLETA"};

    public Colores(String[] colores) {
        this.colores = colores;
        int contador = 0;



        Arrays.sort(this.colores);
        System.out.println(Arrays.toString(this.colores));    
        
        for (int i = 0; i < this.colores.length; i++) {
            

            System.out.println(Arrays.binarySearch(this.colores, "ROJO"));
            
        }


        
        
        System.out.println(Arrays.toString(this.colores));

    }


 

    
}
