package ud4.Apuntes;

import ud3.yomExamen.CocheCarreras;

public class Referencias {
    public static void main(String[] args) {
        CocheCarreras[] coches = new CocheCarreras[10];
        // ¿Si no pones ningun numero dentro cuanto es el max y min?
        CocheCarreras[] coches2, coches3 , cochesRojos;

        coches[4] = new CocheCarreras("Rayo", 100, 50);
        coches2 = coches;

        coches2[4].mostrar();




        System.out.println("Fin programa");
        
    }
}
