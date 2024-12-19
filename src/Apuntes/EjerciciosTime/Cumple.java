package Apuntes.EjerciciosTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cumple {
    public static void main(String[] args) {
        int diaNacimiento = 11, mesNacimiento = 2, añoNacimiento=2003;
        LocalDate fechaHoy = LocalDate.now();
        int siguienteAño = fechaHoy.getYear() + 1;
        System.out.println(siguienteAño);

        LocalDate nacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
        LocalDate proxCumpleaños = LocalDate.of(siguienteAño, mesNacimiento, diaNacimiento);
        Period periodo = Period.between(fechaHoy, proxCumpleaños);

        int mesesRestantes = periodo.getMonths();
        int diasRestantes = periodo.getDays();

        System.out.println("Faltan " + diasRestantes + " dias y " + mesesRestantes + " meses");
        
        // DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // String nacimientoFormateada = nacimiento.format(formatoFecha);

        // System.out.println(nacimientoFormateada);
    }
}
