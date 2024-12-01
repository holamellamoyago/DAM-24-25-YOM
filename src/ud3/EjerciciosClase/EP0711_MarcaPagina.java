package ud3.EjerciciosClase;

public class EP0711_MarcaPagina {
    private int numeroPagina;

    EP0711_MarcaPagina() {
    }

    EP0711_MarcaPagina(int numeroPagina) {
        if (numeroPagina < 0) {
            this.numeroPagina = 0;
        } else {
            this.numeroPagina = numeroPagina;
        }
    }

    void avanzarPagina() {
        numeroPagina++;
    }

    void retrasarPagina() {
        if (numeroPagina <= 0) {
            System.out.println("Ya estás en la primera página");
        } else {
            numeroPagina--;
        }
    }

    void volverEmpezar() {
        numeroPagina = 0;
    }
}
