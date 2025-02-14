package ud5.clasesejercicios.E0710;

import ud5.clasesejercicios.E0710.Personal.Maquinista;
import ud5.clasesejercicios.E0710.Personal.Mecanico;

import java.time.LocalDate;

import ud5.clasesejercicios.E0710.Maquinaria.Locomotora;
import ud5.clasesejercicios.E0710.Maquinaria.Tren;
import ud5.clasesejercicios.E0710.Personal.Especialidad;
import ud5.clasesejercicios.E0710.Personal.JefeEstacion;

public class app {
    public static void main(String[] args) {
        Maquinista maquinista = new Maquinista("Yago", "39511342X", 2000, "Jefe");
        // System.out.println(maquinista);

        Mecanico mecanico = new Mecanico("Anxo", "692433876", Especialidad.ELECTRICIDAD);
        // Mecanico mecanico2 = new Mecanico("Anxo", "692433876",
        // Mecanico.Especialidad.valueOf("FRENOS"));

        JefeEstacion jefe = new JefeEstacion("Pepa", "132456789X", LocalDate.of(2023, 10, 1));

        // Vago solo es visible por clases vecinas

        Locomotora locomotora = new Locomotora("1324AAA", 500, 2010, mecanico);

        Tren tren = new Tren(locomotora, maquinista, 5);

        // try {
        //     Tren tren2 = new Tren(locomotora, maquinista, 50);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }


        tren.addVagon(1, 10000, 1000, "Madera");
        tren.addVagon(2, 10000, 10, "Hierro");
        tren.addVagon(3, 10000, 50, "Madera");

        System.out.println(tren);

        System.out.println(jefe);

        mecanico.revisar(locomotora);



    }

}
