package compartircoche.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexion {
    /*
    // Datos de conexión a la base de datos de Desarrollo (localhost)
    static final String HOST = "localhost";
    static final String DATABASE = "compartirviaje";
    static final String USER = "root";
    static final String PASSWORD = "";
    static final String PORT = "3306";
    */ 

    // Base de datos de Producción (filess.io)
    static final String HOST = "4-ygf.h.filess.io";
    static final String DATABASE = "compartirApuntes2_middlepoem";
    static final String USER = "compartirApuntes2_middlepoem";
    static final String PASSWORD = "771acdce9806cbcc195a6f4ca960922ccb36e81b";
    static final String PORT = "3305";
 


    /**
     * Conecta con la base de datos
     * 
     * @return Conexión con la base de datos
     */
    public static Connection conectar() {
        Connection con = null;

        String url = "jdbc:mysql://" + Conexion.HOST + ":" + Conexion.PORT + "/" + Conexion.DATABASE;

        try {
            con = DriverManager.getConnection(url, Conexion.USER, Conexion.PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la BD.");
        }

        return con;
    }
}


/*
 * // Datos de conexión a la base de datos (freedb.tech)
 * static final String HOST = "sql.freedb.tech";
 * static final String DATABASE = "freedb_dam12425";
 * static final String USER = "freedb_dam12425";
 * static final String PASSWORD = "N6ynS8#UsHUKRpG";
 * static final String PORT = "3306";
 */