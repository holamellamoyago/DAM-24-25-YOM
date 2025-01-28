package AceptaElReto;

public class RelojDeArenaRealista {
    public static void main(String[] args) throws InterruptedException {
        int altura = 10; // Altura del reloj de arena
        while (true) {
            // Vaciar la parte superior y llenar la inferior
            for (int i = 0; i < altura; i++) {
                dibujarRelojDeArena(i, altura - i, altura);
                Thread.sleep(200); // Pausa para crear la animación
                limpiarConsola();
            }
            // Vaciar la parte inferior y llenar la superior
            for (int i = altura - 1; i >= 0; i--) {
                dibujarRelojDeArena(altura - i, i, altura);
                Thread.sleep(200); // Pausa para crear la animación
                limpiarConsola();
            }
        }
    }

    private static void dibujarRelojDeArena(int nivelSuperior, int nivelInferior, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar la parte superior del reloj de arena
                if (i < nivelSuperior && (j >= i && j < altura - i)) {
                    System.out.print("* ");
                }
                // Dibujar la parte inferior del reloj de arena
                else if (i >= altura - nivelInferior && (j >= altura - i - 1 && j <= i)) {
                    System.out.print("* ");
                }
                // Dibujar el contorno del reloj de arena
                else if (i == j || i + j == altura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void limpiarConsola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}