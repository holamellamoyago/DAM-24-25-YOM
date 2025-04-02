package Contornos.MalosCheirosEva;

class Nomina {
    private double salario;

    public Nomina(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class Empleado {
    private String nombre;
    private Nomina nomina;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.nomina = new Nomina(salario);
    }

    public void aumentarSalario(double incremento) {
        double salarioActual = nomina.getSalario();
        nomina.setSalario(salarioActual + incremento); // Acceso directo a los detalles de Nomina
    }

    public void mostrarSalario() {
        System.out.println(nombre + " tiene un salario de: " + nomina.getSalario());
    }
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan", 3000);
        emp.mostrarSalario();
        emp.aumentarSalario(500);
        emp.mostrarSalario();
    }

}

