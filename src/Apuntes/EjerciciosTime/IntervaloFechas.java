package Apuntes.EjerciciosTime;

import java.time.LocalDate;
import java.time.Period;

public class IntervaloFechas {
    public static void main(String[] args) {

        LocalDate fechaAnterior = LocalDate.of(2003, 2, 11);
        Period periodo = Period.between(fechaAnterior, LocalDate.now());




        int dias = periodo.getDays();
        int años = periodo.getYears();
        int meses = periodo.getMonths();

        System.out.println(años + " " + meses + " " + dias);

        System.out.println(periodo);
        
    }
}
