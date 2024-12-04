package Clases;

import java.util.Scanner;

public class Calendario {
    int año, mes, dia;
    private boolean fechaCorrecta = false;

    // Constructor
    public Calendario(int año, int mes, int dia) {

        if ((año >= 0 && año < 2030) && (mes > 0 && mes < 13) && (dia > 0 && dia < 32)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Hubo un error");
        }
    }

    public void incrementarDia() {

        if (dia == 31) {
            dia = 1;
            incrementarMes();

        } else {
            dia++;
            mostrar();
        }

    }

    public void incrementarMes() {
        if (mes == 12) {
            mes = 1;
            incrementarAños(1);
        } else {
            mes++;
            mostrar();
        }
    }

    public void incrementarAños(int años) {
        this.año += años;
        mostrar();
    }

    void mostrar() {
        System.out.println(dia + " - " + mes + " - " + año);
    }

    void iguales() {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Introduce una fecha, así : dd mm aaaa,  (si es solo una cifra añadir un 0 delante, (01, 02, 03...))");
        String fecha = sc.nextLine();

        do {

            try {
                String dias = fecha.charAt(0) + "" + fecha.charAt(1);
                String meses = fecha.charAt(3) + "" + fecha.charAt(4);
                String años = fecha.charAt(6) + "" + fecha.charAt(7) + fecha.charAt(8) + fecha.charAt(9);

                String diasConstructor = this.dia.toString();

                fechaCorrecta = true;
            } catch (Exception e) {
                System.out.println("Hubo un error, recuerda, en este formato: dd mm aaaa");
                fecha = sc.nextLine();
            }

        } while (fechaCorrecta == false);




    }

    public static void main(String[] args) {
        Calendario c = new Calendario(2024, 12, 30);
        c.incrementarDia();
        c.incrementarDia();
        c.iguales();

    }

}
