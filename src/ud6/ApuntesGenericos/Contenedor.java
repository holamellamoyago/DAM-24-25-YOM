package ud6.ApuntesGenericos;

class Contenedor<T> { 
 
    private T objeto; // se inicializa a null: contenedor vacío 
 
    public Contenedor() { 
    } 
 
    void guardar(T nuevo) { 
        objeto = nuevo; 
    } 
 
    T extraer() { 
        T res = objeto; 
        objeto = null; // el contenedor vuelve a estar vacio 
        return res; 
    } 

    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<Integer>(); 
        // Contenedor<Integer> c = new Contenedor<>(); 
    }
} 