package ud6.Practicas.AP1205;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente implements Comparable<Cliente> {
    String nombre, dni;
    LocalDate fechaNacimiento;

    public Cliente(String nombre, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formato);
    }

    @Override
    public int compareTo(Cliente o) {
        return this.fechaNacimiento.compareTo(o.fechaNacimiento);
    }

    @Override
    public String toString() {
        return nombre + ", " + fechaNacimiento;
    }

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Yago", "39511342X", "11/02/2003");
        Cliente c2 = new Cliente("María", "39511342X", "12/02/2003");
        Cliente c3 = new Cliente("Adrian", "39511342X", "11/02/2004");

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        clientes.sort(null);

        Cliente[] clientes2 = new Cliente[]{c1,c2, c3};
        Arrays.sort(clientes2);

        // System.out.println(Arrays.toString(clientes2));

        System.out.println(clientes);
    }

    
}
