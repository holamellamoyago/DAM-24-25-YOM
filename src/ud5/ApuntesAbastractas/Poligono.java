package ud5.ApuntesAbastractas;

public abstract class Poligono {                                                                            
  
    private int numLados;
    public Poligono() {
    }

    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }
    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    //Declaración del método abstracto area()                                                               
    public abstract double area();


    public static void main(String[] args) {
        Triangulo t = new Triangulo(3.25,4.55,2.71);
        System.out.printf("Área del triángulo: %.2f %n" , t.area());                                        
        Rectangulo r = new Rectangulo(5.70,2.29);
        System.out.printf("Área del rectángulo: %.2f %n" , r.area());                                       
}
}