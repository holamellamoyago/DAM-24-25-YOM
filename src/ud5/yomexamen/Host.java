package ud5.yomexamen;
// Yago Otero Martínez

import java.util.Arrays;

public class Host implements Comparable {

    // Tu código aquí
    String nombre, mac, ip;
    final String mascaraDeRed = "255.255.255.0";
    final String puertaEnlace = "192.168.0.11";
    final String servidorDNS = "192.168.0.9";

    public Host(String nombre, String ip, String mac) {
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Nombre no válido");
        }

        if (ip == null) {
            this.ip = null;
        } else if (validarIP(ip)) {
            this.ip = ip;
        } else {
            throw new IllegalArgumentException("IP no valida");
        }

        if (validarMAC(mac)) {
            this.mac = mac;
        } else {
            throw new IllegalArgumentException("MAC no valida");
        }

    }

    static String cambiarMac(String mac) {

        char[] macChar = mac.toCharArray();
        String maccambiada = "";

        for (int i = 0; i < macChar.length; i++) {
            if (macChar[i] == '-') {
                macChar[i] = ':';
            }

            maccambiada += macChar[i];
        }
        return maccambiada;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Host other = (Host) obj;
        if (mac == null) {
            if (other.mac != null)
                return false;
        } else if (!cambiarMac(mac).equals(cambiarMac(other.mac)))
            return false;
        return true;
    }

    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    @Override
    public int compareTo(Object o) {
        return nombre.compareTo(((Host) o).nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + ip + " / " + mac + ")";
    }

    public static void main(String[] args) {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h100, h101, h102, h103 };
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }

        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }

}
