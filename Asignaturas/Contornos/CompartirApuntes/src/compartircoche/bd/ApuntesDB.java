package compartircoche.bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ApuntesDB {
        public static boolean crearApunte(String usuario, String fechaHora, String origen, String destino, int plazas) {
        Connection conexion = Conexion.conectar();
        Statement sentencia;
        try {
            sentencia = conexion.createStatement();
            //TODO Corregit
            sentencia.executeUpdate("INSERT INTO apunte (nombre, ) VALUES ('"
                    + usuario + "', '" + fechaHora + "', '" + origen + "', '" + destino + "', " + plazas + ")");
            sentencia.close();
            conexion.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    

    public static boolean crearInstituto(String nombre, int estudiantes){
        Connection conexion = Conexion.conectar();
        Statement sentencia;
        try {
            sentencia = conexion.createStatement();
            sentencia.executeUpdate("INSERT INTO Instituto (nombre,numEstudiantes) VALUES ('"
                    + nombre + "', '" + estudiantes + "')");
            sentencia.close();
            conexion.close();
            return true;
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            return false;
        } 
    }
    public static boolean crearCiclo(String nombre){
        Connection conexion = Conexion.conectar();
        Statement sentencia;
        try {
            sentencia = conexion.createStatement();
            sentencia.executeUpdate("INSERT INTO ciclo (nombre,id_instituto) VALUES ('" 
            + nombre + "', '1')");

            sentencia.close();
            conexion.close();
            return true;
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            return false;
        } 
    }



public static boolean cogerIdCiclo(String nombre) {
    Connection conexion = Conexion.conectar();
    Statement sentencia;
    try {
        sentencia = conexion.createStatement();
        try {
            // Usar executeQuery para SELECT
            ResultSet resultado = sentencia.executeQuery("SELECT id FROM ciclo WHERE nombre = '" + nombre + "'");
            if (resultado.next()) { // Comprueba si hay resultados
                int idCiclo = resultado.getInt("id");
                System.out.println(idCiclo); // Imprime el ID del ciclo
            } else {
                System.out.println("No se encontró ningún ciclo con el nombre: " + nombre);
            }
            resultado.close(); // Cierra el ResultSet
        } catch (Exception e) {
            System.out.println("E idCiclo: " + e.getMessage());
        }
        sentencia.close();
        conexion.close();
        return true;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }
}


    public static boolean crearAsignatura(String nombre){
        Connection conexion = Conexion.conectar();
        Statement sentencia;
        try {
            sentencia = conexion.createStatement();
            sentencia.executeUpdate("INSERT INTO asignatura (nombre) VALUES ('" 
            + nombre + "')");

            


            sentencia.close();
            conexion.close();
            return true;
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            return false;
        } 
    }


    



    public static void main(String[] args) {
        // (System.out.println(crearInstituto("Chan do monte",200)); // Funciona
            // System.out.println(crearCiclo("DAM")); 
        // System.out.println(crearAsignatura("Programacion 2"));
        System.out.println(cogerIdCiclo("DAM"));
    
    }
}
