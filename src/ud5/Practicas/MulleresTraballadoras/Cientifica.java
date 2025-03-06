package ud5.Practicas.MulleresTraballadoras;

import ud5.Practicas.MulleresTraballadoras.Interfaces.IPioneira;

public class Cientifica extends MullerTraballadora implements IPioneira {
    String descubrimento;

    public Cientifica(String nome, String apelidos, int anoNacemento, String descubrimento) {
        super(nome, apelidos, anoNacemento);
        this.descubrimento = descubrimento;
    }

    @Override
    String descricionContribucion() {
        return descubrimento;
    }

    @Override
    public String getDescubrimentoOuAporte() {
        return descubrimento;
    }
}
