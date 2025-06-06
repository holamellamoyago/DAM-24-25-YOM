package ud5.yomexamen;
// Yago Otero Martínez

import java.util.Arrays;

public class Servidor extends Host {

    // Tu código aquí
    int puertoServicio;
    String nombreServicio;
    Servicio[] servicios = new Servicio[0];

    public Servidor(String nombre, String ip, String mac) {
        super(nombre, ip, mac);
    }

    boolean addServicio(String nombre, int num, String protocolo) {

        Servicio servicioNuevo = new Servicio(nombre, num, protocolo);

        if (!comprobarExistenciaServicio(servicioNuevo)) {
            servicios = Arrays.copyOf(servicios, servicios.length + 1);
            servicios[servicios.length - 1] = servicioNuevo;
            return true;
        } else {
            return false;
        }

    }

    boolean comprobarExistenciaServicio(Servicio servicio) {
        boolean existeProtocolo = false;

        for (int i = 0; i < servicios.length; i++) {
            if (servicios[i].puerto == servicio.puerto && servicios[i].protocolo.equals(servicio.protocolo)) {
                existeProtocolo = true;
            }
        }

        return existeProtocolo;
    }

    @Override
    public String toString() {

        String linea1 = "\n" + nombre + "(" + ip + ")";
        String linea2 = "";

        for (int i = 0; i < servicios.length; i++) {
            linea2 += "\n*" + servicios[i].nombre + " (" + servicios[i].puerto + "/" + servicios[i].protocolo;
        }

        return linea1.concat(linea2);
    }

    public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");

        Servidor[] servidores = { s1, s2, s3 };
        for (Servidor s : servidores) {
            System.out.println(s);
        }

        // Tu código aquí

        System.out.println("\nORDENADOS POR NUMERO DE SERVICIOS");
        Arrays.sort(servidores, new ComparatorNumServicios().reversed());
        for (Servidor s : servidores) {
            System.out.println(s);

        }
    }

}
