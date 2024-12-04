package compartircoche.bd;

import java.sql.Connection;
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
}
