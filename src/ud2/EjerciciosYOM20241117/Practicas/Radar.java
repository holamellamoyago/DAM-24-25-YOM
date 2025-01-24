package ud2.EjerciciosYOM20241117.Practicas;


public class Radar {

    static void calcularVelocidadMedia(double km, double segundos, int limiteLegal) {

        double horas = (segundos / 60) / 60;

        double kmH = km / horas;
        System.out.println("La velocidad media son " + kmH + " KM/H");

        // System.out.println(comprobarMulta(limite, limite, limite, limite, limite, limite));

        switch (limiteLegal) {
            case 20:
                System.out.println(comprobarMulta((int)kmH, 20, 40, 50, 60, 70));
                break;
            case 30:
                System.out.println(comprobarMulta((int)kmH, limiteLegal, 50, 60, 70, 80));
                break;
            case 40:
                System.out.println(comprobarMulta((int)kmH, 40, 60 , 70 , 80, 90));
            case 50:
                System.out.println(comprobarMulta((int)kmH, 50 , 70, 80, 90, 100));
                break;
            case 60:
                System.out.println(comprobarMulta((int)kmH, 60, 90, 110, 120, 130));
                break;
            case 70: 
                System.out.println(comprobarMulta((int)kmH, 70, 100, 120, 130, 140));
            case 80:
                System.out.println(comprobarMulta((int)kmH, 80, 110, 130, 140, 150));
            case 90: 
                System.out.println(comprobarMulta((int)kmH, 90, 120, 140, 150, 160));
            case 100:
                System.out.println(comprobarMulta((int)kmH, limiteLegal, 130, 150, 160, 170));
            case 110:
                System.out.println(comprobarMulta((int)kmH, limiteLegal, 140, 160, 170, 180));
            case 120:
                System.out.println(comprobarMulta((int)kmH, limiteLegal, 150, 170, 180, 190));
            default:
                System.out.println("Error, " + (int)kmH);
                break;
        }
    }

    static String comprobarMulta(int velocidadMedia, int limiteLegal, int limite2, int Limite4, int limite6,
            int limite66) {
        String frase;
        final String MULTA = "Multa de ";

        switch (limiteLegal) {
            case 60:
                if (velocidadMedia > limiteLegal && velocidadMedia <= limite2) {
                    frase = MULTA +  " 100 euros";
                } else if (velocidadMedia > limite2 && velocidadMedia <= Limite4) {
                    frase = MULTA + "300 euros y 2 puntos";
                } else if (velocidadMedia > Limite4 && velocidadMedia <= limite6) {
                    frase = MULTA + " 400 euros y 4 puntos";
                } else if (velocidadMedia > limite6 && velocidadMedia <= limite66) {
                    frase = MULTA + " 500€ y 6 puntos";
                } else {
                    frase = MULTA + " de 600 euros y 6 puntos";
                }
                break;
                
                default:
                frase = "Error";
                break;
            }
            return frase;

    }

    public static void main(String[] args) {
        calcularVelocidadMedia(125, 600, 60);
    }
}
