package ud5.clasesejercicios.E0710.Maquinaria;

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
    
}
