package ud5.clasesejercicios.E0710.Maquinaria;

import java.util.Arrays;

import ud5.clasesejercicios.E0710.Personal.Maquinista;

public class Tren {
    Locomotora locomotora;
    static final byte MAX_VAGONES = 5;
    Vagon[] vagones;
    Maquinista maquinista;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this(locomotora, maquinista, 0);
    }
    
    
    public Tren(Locomotora locomotora, Maquinista maquinista, int numVagones) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;

        vagones = new Vagon[numVagones];

        if (numVagones > MAX_VAGONES) {
            throw new ArrayIndexOutOfBoundsException("Demasiados vagones , el maixmo es "+ MAX_VAGONES);
        }


        for (int i = 0; i < numVagones; i++) {
            vagones[i] = new Vagon(i);
        }
    }

    public boolean addVagon(int id, int cargaMaxima, int cargaActual, String tipoMercancia){
        if (vagones.length == MAX_VAGONES) {
            return false;
        }

        Vagon vagon = new Vagon(id, cargaMaxima,cargaActual, tipoMercancia);

        vagones = Arrays.copyOf(vagones, vagones.length+1);

        vagones[vagones.length-1] = vagon;

        return true;

    }


    @Override
    public String toString() {
        String str = "TREN \n";
        str += "MAQUINISTA\n"  + maquinista + "\n";
        str += locomotora + "\n";
        


        for (Vagon vagon : vagones) {
            str += " - " + vagon + " - ";
        }

        str += "\n Carga Actual : " + getCargaActual();

        return str;
    }


    public int getNumVagones(){
        return vagones.length;
    }


    public int getCargaActual(){
        int cargaActual = 0;

        for (Vagon vagon : vagones) {
            cargaActual += vagon.cargaActual;
        }

        return cargaActual;
    }


    public int getCargaMaximo(){
        int cargaMaxima = 0;

        for (Vagon vagon : vagones) {
            cargaMaxima += vagon.cargaMaxima;
        }

        return cargaMaxima;
    }

    
    
}
