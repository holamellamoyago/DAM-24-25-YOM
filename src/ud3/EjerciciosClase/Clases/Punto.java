package ud3.EjerciciosClase.Clases;

public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {return x;}
    public double getY() {return y;}



    public void desplazaX(double x){
        this.x +=x;
    }
    public void desplazaY(double y){
        this.y +=y;
    }

    public void desplaza(double x, double y){
        this.x +=x;
        this.y +=y;
    }

    public double distanciaEuclidea(Punto punto){
        double x = punto.getX();
        double y = punto.getY();

        double distanciaX = this.x - x;
        double distanciaY = this.y - y;

        return distanciaX + distanciaY;
    }


    public static void main(String[] args) {
        Punto p = new Punto(100, 50);

        p.desplazaX(-40);
        System.out.println(p.getX());
        
    }

    
}
