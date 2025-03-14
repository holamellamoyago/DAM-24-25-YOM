
package ud5.Practicas.praiasdegalicia;

import java.util.Comparator;

public class Praia implements Comparable{
    private int id;
    private String nome;
    private String concello;
    private String provincia;
    private double lat;
    private double lon;

    public Praia() {
    }

    public Praia(int id) {
        this.id = id;
    }

    public Praia(int id, String nome, String concello, String provincia) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
    }

    public Praia(int id, String nome, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConcello() {
        return concello;
    }

    public void setConcello(String concello) {
        this.concello = concello;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }





    void mostrarDetalles() {
        System.out.println("DETALLES: " + id + " - " + nome + "- " + concello + " - " + provincia + " - ("
                + lat + ", " + lon + ")");
    }

    @Override
    public String toString() {
        return id + " - " + nome + "- " + concello + " - " + provincia + " - ("
                + lat + ", " + lon + ")";
    }

    static void imprimirLista(Praia[] p, int praiasMax) {
        for (int i = 0; i < praiasMax; i++) {
            System.out.println(p[i].toString());
        }
    }

    @Override
    public int compareTo(Object o) {
        Praia p = (Praia) o;
        return p.id;
    }


    

}
