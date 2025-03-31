package ud6.ApuntesGenericos2;

public class ContenedorO {
    private Object objeto;

    public ContenedorO() {
    }

    void guardar(Object nuevo){
        objeto = nuevo;
    }

    Object extraer(){
        Object res = objeto;
        objeto = null;
        return res;
    }

    public static void main(String[] args) {
        ContenedorO c  = new ContenedorO();
        c.guardar(new String("Hola"));
        c.guardar(7);
        c.guardar(new String("H"));
        Double x = (Double) c.extraer();
    }
    
}
