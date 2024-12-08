package ud3.EjercicioYago;

import java.util.Scanner;

public class Dardos {
    Scanner sc = new Scanner(System.in);
    private JugadorDardo j1; // Jugador 1
    private JugadorDardo j2;
    private boolean partidaTerminada;
    private int contadorRondas = 0;

    public Dardos(JugadorDardo j1, JugadorDardo j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    public int quienComienza() {
        System.out.println("Elegiendo quien empieza al azar ...  ");

        int numero = (int) (Math.random() * 2) + 1;
        System.out.println("Comienza el jugador: " + numero);
        confirmar();
        return numero;
    }

    public void empezarPartida() {

        int jugador = quienComienza();
        mostrarReglas();

        do {
            switch (jugador) {
                case 1: {
                    tirarDardos(j1);
                    break;
                }
                case 2: {
                    tirarDardos(j2);
                    break;
                }

                default: {
                    throw new IllegalArgumentException("Error al tirar dardos");
                }
            }

            if (jugador == 1) {
                jugador = 2;
            } else {
                jugador = 1;
            }

        } while (partidaTerminada != true);

    }

    private void tirarDardos(JugadorDardo jugador) {

        contadorRondas++;

        for (int i = 3; i > 0; i--) {
            int puntosDiana = (int) (Math.random() * 24) + 1;
            int puntosRestantes = jugador.getPUNTOS();

            System.out.println("Dardo " + i + " acerto: " + puntosDiana + " puntos");
            puntosRestantes -= puntosDiana;
            jugador.setPUNTOS(puntosRestantes);

        }

        mostrarResultado(jugador);

        
    }
    
    private void mostrarResultado(JugadorDardo jugador){
        System.out.println(
                "Resultado de la ronda: " + contadorRondas + " jugador: " + jugador.getNombre() + ", le quedan "
                        + jugador.getPUNTOS());
        if (jugador.getPUNTOS() <= 0) {
            partidaTerminada = true;
            System.out.println("-------------------------");
            System.out.println("Felicidades " + jugador.getNombre() + "! Eres el ganador de esta partida");
        } else {
    
            System.out.println("Pulsa enter para avanzar al siguiente turno");
            sc.nextLine();
        }

    }

    private void mostrarReglas() {
        System.out.println("REGLAS DEL JUEGO\n1.Son 3 dardos por ronda");
        System.out.println("2.La diana da un máximo de 24 puntos por daroo");
        confirmar();
    }

    private void confirmar() {
        System.out.println("--------------------------------------------------");
        System.out.println("Presiona ENTER si lo entendiste");
        System.out.println("--------------------------------------------------");
        sc.nextLine();

    }

    public JugadorDardo getJ1() {
        return j1;
    }

    public void setJ1(JugadorDardo j1) {
        this.j1 = j1;
    }

    public JugadorDardo getJ2() {
        return j2;
    }

    public void setJ2(JugadorDardo j2) {
        this.j2 = j2;
    }

    public static void main(String[] args) {
        JugadorDardo j1 = new JugadorDardo("Yago", 21, "hombre");
        JugadorDardo j2 = new JugadorDardo("Pedro", 21, "hombre");

        Dardos dardos = new Dardos(j1, j2);

        dardos.empezarPartida();

        

    }

    
    
}
