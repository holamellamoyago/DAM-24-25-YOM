package ud5.yomexamen;
// Yago Otero Martínez

import java.util.Arrays;
import java.util.Comparator;

public class Cliente extends Host implements Comparable {

    // Tu código aquí
    enum SO {
        WINDOWS, LINUX, MAC, ANDROID, IOS
    }

    SO so;
    String resolucion;

    public Cliente(String nombre, String ip, String mac, SO so, String resolucion) {
        super(nombre, ip, mac);
        this.so = so;

        if (resolucion.contains("x")) {
            this.resolucion = resolucion;
        } else {
            throw new IllegalArgumentException("resolucion no tiene x");
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + so + " " + resolucion + ")";
    }

    public static void main(String[] args) {
        System.out.println("\nClase Cliente");
        System.out.println("=============\n");
        Cliente cWin1 = new Cliente("Cliente1", "192.168.1.2", "02:1A:2B:3C:4D:5E",
                SO.WINDOWS, "1920x1080");
        Cliente cLin2 = new Cliente("Cliente2", "192.168.1.3", "01:1A:2B:3C:4D:5F",
                SO.LINUX, "1366x768");
        Cliente cMac3 = new Cliente("Cliente3", "192.168.1.4", "04:1A:2B:3C:4D:60",
                SO.MAC, "2560x1440");
        Cliente cAnd4 = new Cliente("Cliente4", "192.168.1.5", "03:1A:2B:3C:4D:61",
                SO.ANDROID, "1080x2340");
        Cliente cIos5 = new Cliente("Cliente5", "192.168.1.6", "05:1A:2B:3C:4D:62",
                SO.IOS, "1170x2532");

        Cliente[] clientes = { cWin1, cLin2, cMac3, cAnd4, cIos5 };
        Arrays.sort(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        // Tu código aquí //TODO ARREGLAR
        // System.out.println("\nCLIENTES ORDENADORS POR SO");
        // Arrays.sort(clientes, new ComparatorAlfabetico());

        // for (Cliente c : clientes) {
        // System.out.println(c);
        // }

        System.out.println("\n CLIENTES ORDENDOS POR RESOLUCION");
        Arrays.sort(clientes, new ComparatorResolucion().reversed());

        for (Cliente c : clientes) {
            System.out.println(c);
        }

    }

}
