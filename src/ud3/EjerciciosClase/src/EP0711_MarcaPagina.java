
// Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro. Deberá disponer de métodos para incrementar la página leída, para obtener información de la última página que se ha leído y para comenzar desde el principio una nueva lectura del mismo libro.

public class EP0711_MarcaPagina {
    private int numeroPagina;

    // Getters & Setters
    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        if (numeroPagina < 0) {
            System.out.println("No puedes introducir páginas negativas");
        } else {

            this.numeroPagina = numeroPagina;
        }
    }

    // Constructores
    public EP0711_MarcaPagina() {
        this.numeroPagina = 0; // Inicializo con un valor por defecto
    }

    public EP0711_MarcaPagina(int numeroPaginaInicializada) {
        this();
        if (numeroPaginaInicializada < 0 ) {
            System.out.println("Error");
        } else{
            this.numeroPagina = numeroPaginaInicializada;
        }

    }

    // Métodos
    void aumentarPagina() {
        numeroPagina++;
    }

    void disminuirPagina() {

        if (numeroPagina <= 0) {
            numeroPagina = 0;
        } else {

            numeroPagina--;
        }
    }

    void mostrarInformacion() {
        System.out.println("La ult pag fue: " + numeroPagina);
    }

    void reiniciarLectura( ){
        numeroPagina = 0;
    }
}