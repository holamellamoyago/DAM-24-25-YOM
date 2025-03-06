package ud5.Practicas.MulleresTraballadoras;

import ud5.Practicas.MulleresTraballadoras.Interfaces.IActivista;

public class Politica extends MullerTraballadora implements IActivista{
    String causa;

    

    public Politica(String nome, String apelidos, int anoNacemento, String causa) {
        super(nome, apelidos, anoNacemento);
        this.causa = causa;
    }

    @Override
    String descricionContribucion() {
        // TODO Auto-generated method stub
        return causa;
    }

    @Override
    public String getCausaDefendida() {
        return causa;
    }

}
