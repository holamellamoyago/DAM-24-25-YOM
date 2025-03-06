package ud5.Practicas.MulleresTraballadoras;

import ud5.Practicas.MulleresTraballadoras.Interfaces.IActivista;
import ud5.Practicas.MulleresTraballadoras.Interfaces.IPioneira;

public class App {
    public static void main(String[] args) {
        // Instanciación de mulleres destacadas
        Cientifica marieCurie = new Cientifica("Marie", "Curie", 1867, "Descubriu o radio e o polonio");
        Artista fridaKahlo = new Artista("Frida", "Kahlo", 1907, "Surrealismo e pintura autobiográfica");
        Politica rosaParks = new Politica("Rosa", "Parks", 1913,
                "Loita polos dereitos civís e contra a segregación racial");
        Cientifica adaLovelace = new Cientifica("Ada", "Lovelace", 1815, "Primeira programadora da historia");

        // Array de Mulleres Traballadoras Destacadas
        MullerTraballadora[] mulleres = { marieCurie, fridaKahlo, rosaParks, adaLovelace };

        imprimirInformacion(mulleres);
        imprimirInformacionDetallada(mulleres);
    }

    static void imprimirInformacion(MullerTraballadora[] mulleres) {
        for (MullerTraballadora muller : mulleres) {
            if (muller instanceof Cientifica) {
                System.out.println(muller.nome + " " + muller.apelidos + " foi unha científica que descubriu: "
                        + muller.descricionContribucion());
            } else if (muller instanceof Artista) {
                System.out.println(muller.nome + " " + muller.apelidos + "  destacou na arte co estilo: "
                        + muller.descricionContribucion());
            } else {
                System.out.println(
                        muller.nome + " " + muller.apelidos + "   foi unha política e activista destacada por:  "
                                + muller.descricionContribucion());
            }

        }
    }

    static void imprimirInformacionDetallada(MullerTraballadora[] mulleres2) {
        System.out.println("\n=== Detaller Específicos ===");
        for (MullerTraballadora muller : mulleres2) {
            if (muller instanceof IPioneira) {
                System.out.println(muller.nome + " foi pionera en: " + muller.descricionContribucion());
            } else if (muller instanceof IActivista) {
                System.out.println(muller.nome + " defendeu a causa: " + muller.descricionContribucion());
            }

        }
    }
}
