package Clases;

public class Calendario2 {
    private int año, mes, dia;

    public Calendario2(int año, int mes, int dia) {
        if (fechaCorrecta(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;

        } else {
            throw new IllegalArgumentException("La fecha no es correcta");
        }

    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void incrementarDia() {
        if (dia == diaMes(mes, año)) {
            dia = 0;
            incrementarMes();
        } else {
            dia++;
        }
    }

    public void incrementarMes() {
        if (mes == 12) {
            mes = 1;
            incrementarAño(1);

        } else {
            mes++;
        }
    }

    public void incrementarAño(int cantidad) {

        año += cantidad;
        if (año == 0) {

            año = cantidad < 0 ? -1 : 1;
        }

    }

    public static int diaMes(int mes, int año) {

        if (mes < 1 || mes > 12) {
            return -1;
        } else {

            switch (mes) {
                case 2:
                    if (esBisiesto(año)) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }

    }

    private static boolean esBisiesto(int año) {
        return ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0));
    }

    public static boolean fechaCorrecta(int año, int mes, int dia) {
        boolean diaCorrecto, mesCorrecto, anyoCorrecto;
        anyoCorrecto = (año != 0);
        mesCorrecto = (mes >= 1) && (mes <= 12);
        diaCorrecto = (dia >= 1 && dia <= diaMes(mes, año));

        return diaCorrecto && mesCorrecto && anyoCorrecto;
    }

    public void mostrar() {
        System.out.println(dia + " - " + mes + " - " + año);
    }

    public boolean iguales(Calendario2 otraFecha) {
        boolean iguales = true;

        if (this.dia != otraFecha.dia) {
            iguales = false;
        } else if (mes != otraFecha.mes) {
            iguales = false;
        } else if (año != otraFecha.año) {
            iguales = false;
        }

        return iguales;
    }

}
