package ud5.clasesejercicios.E0825;

public class Punto {
    int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distancia(Punto otroPunto) {
        double parentesis = Math.pow((this.x - otroPunto.x), 2) + Math.pow((this.y - otroPunto.y), 2);

        return Math.sqrt(parentesis);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto other = (Punto) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    
}
