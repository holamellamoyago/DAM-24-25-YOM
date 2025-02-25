package ud5.herenciaejercicios.EP0813;
import ud5.*;
import ud5.herenciaejercicios.EP0812.Caja;


public class CajaCarton extends Caja {

    double volumenCaja; // 80%
    int ancho, alto, fondo; // en CM
    int superficieTotalCarton;


    double calcularVolumenReal(Caja caja){
        double volumen;

        if (caja.getUnidad() == Unidad.M) {
            volumen = (caja.getVolumen(caja) * 100) * 0.8;
            superficieTotalCarton += volumen;
            return volumen;
        } else{
            volumen = caja.getVolumen(caja) * 0.8;
            superficieTotalCarton += volumen;
            return volumen;
        }

    }

    
    
}
