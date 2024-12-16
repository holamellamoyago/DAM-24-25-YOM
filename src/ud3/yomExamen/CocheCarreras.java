package ud3.yomExamen;

import java.util.Random;

// Yago Otero Martínez

public class CocheCarreras {
    private String nombre;
    private int velocidadMaxima;
    private int turbosMaximo;
    private int autonomiaMaxima;
    // TODO Crear turbosMaximo
    private int autonomiaRestante;
    private int turbosRestantes;
    private int distanciaRecorrida;

    public CocheCarreras(String nombre, int velocidadMaxima, int turbos, int autonomia) {

        if (velocidadMaxima > 100 || velocidadMaxima < 1) {
            throw new IllegalAccessError("Error en la velocidad , entre 1 y 100");
        } else {

            this.nombre = nombre;
            this.velocidadMaxima = velocidadMaxima;
            this.turbosMaximo = turbos;
            // Aquí digo que si la autonomia es negativa ponga 0
            this.autonomiaMaxima = autonomia < 0 ? 0 : autonomia;
            // Aquí tbn hay que cambiar por el this.
            this.autonomiaRestante = this.autonomiaMaxima;
            this.turbosRestantes = turbos;
            this.distanciaRecorrida = 0;

        }
    }

    public CocheCarreras(String nombre, int velocidadMaxima, int autonomia) {
        this(nombre, velocidadMaxima, 3, autonomia);
    }

    public void avanzar() {
        int metrosAleatorio = new Random().nextInt(1, velocidadMaxima);

        if (metrosAleatorio >= autonomiaRestante) {
            distanciaRecorrida += autonomiaRestante;
            autonomiaRestante = 0;
            // System.out.println("No puedes avanzar mas porque quedaste sin autonomia");
        } else {
            distanciaRecorrida += metrosAleatorio;
            autonomiaRestante -= metrosAleatorio;
            if (autonomiaRestante <= 0) {
                // System.out.println("Te quedas sin gasolina");
                this.autonomiaRestante = 0;
            }
            // System.out.println("Metros aleatorio: " + metrosAleatorio);
            // System.out.println("Metros recorridos: " + autonomiaRestante);
        }

    }

    public int usarTurbo() {
        int metrosRecorridos = 0;

        if (turbosRestantes > 0) {
            // Resto turbos
            turbosRestantes--;

            //TODO Aqui no me dio tiempo a arreglar este bug , al quitar los turbos del while no me dio tiempo a que surgiera efecto en l siguiente linea de .mostrar()
            this.turbosRestantes = turbosRestantes;


            // Aqui calculo los metros correspondientes al 150 de velocidad maxima
            int metrosTurbo = velocidadMaxima + (velocidadMaxima / 2);
            // System.out.println("Metro a avanzar: " + metrosTurbo);

            if (metrosTurbo >= autonomiaRestante) {
                distanciaRecorrida += autonomiaRestante;
                autonomiaRestante = 0;
                metrosRecorridos = distanciaRecorrida += autonomiaRestante;
                // Aquí es cuando se queda sin gasolina , limita los metros a la restante y
                // marca la restante como 0
                // System.out.println("No gasolina");

            } else {
                distanciaRecorrida += metrosTurbo;
                autonomiaRestante -= metrosTurbo;
                metrosRecorridos = distanciaRecorrida;

                if (autonomiaRestante <= 0) {
                    // También puede ser que se quede aquí sin gasolina
                    autonomiaRestante = 0;
                    // System.out.println("No gasolina");
                }
                // System.out.println("Metros recorridos en total: " + distanciaRecorrida);
                // System.out.println("Autonomia restante: " + autonomiaRestante);
            }

        } else {
            throw new IllegalAccessError("No quedan turbos");
        }

        return metrosRecorridos;
    }

    public void repostar() {
        autonomiaRestante = autonomiaMaxima;
        turbosRestantes = turbosMaximo;

        // System.out.println(autonomiaRestante);
        // System.out.println(turbosRestantes);

        // TODO EN las funciones de hsajhs mirar si estan utilizando "autonomiaMaxima"
    }

    public void reiniciarDistancia() {
        distanciaRecorrida = 0;
    }

    public void mostrar() {
        System.out.println("Coche: " + nombre);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
        System.out.println("Turbos: " + turbosRestantes + "/" + turbosRestantes);
        System.out.println("Autonomia " + autonomiaRestante + "/" + autonomiaMaxima);
    }

    // Coche: <Nombre>
    // Velocidad Máxima: <velocidadMaxima> mps
    // Turbos: <turbosRestantes>/<maxTurbos>
    // Autonomía: <autonomiaRestante>/<autonomiaMaxima>

    public String getNombre() {
        return nombre;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getTurbos() {
        return turbosMaximo;
    }

    public int getAutonomia() {
        return autonomiaMaxima;
    }

    public int getAutonomiaRestante() {
        return autonomiaRestante;
    }

    public int getTurbosRestantes() {
        return turbosRestantes;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public static void main(String[] args) {
        // CocheCarreras cc = new CocheCarreras("Rayo", 100, 3, -1);
        // CocheCarreras cc2 = new CocheCarreras("Rayo", 100, 2, 400);

        // System.out.println(cc.getNombre());
        // System.out.println(cc.getAutonomiaRestante());
        // System.out.println(cc.getTurbosRestantes());
        // System.out.println(cc.getDistanciaRecorrida());

        // cc.avanzar();
        // System.out.println(cc2.usarTurbo());

        // cc2.usarTurbo();
        // System.out.println("Quedan" + cc2.getTurbosRestantes());
        // cc.respostar();

        // cc.mostrar();


         // OScar
        System.out.println("RAYO");
        System.out.println("====");
        CocheCarreras rayo = new CocheCarreras("Rayo", 90, 400);
        rayo.mostrar();
        rayo.avanzar();
        rayo.usarTurbo();
        rayo.mostrar();
        System.out.println("TRUENO");
        System.out.println("======");
        CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);
        trueno.mostrar();
        while (trueno.getAutonomiaRestante() != 0)
            trueno.usarTurbo();
            //TODO Leer comentario linea 67
        trueno.mostrar();
        trueno.repostar();
        trueno.mostrar();

    }

}
