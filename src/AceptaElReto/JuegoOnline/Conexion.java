package AceptaElReto.JuegoOnline;

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
    static final String HOST = "ayw3e.h.filess.io";
    static final String DATABASE = "JuegoOnline_citizenbow";
    static final String USER = "JuegoOnline_citizenbow";
    static final String PASSWORD = "6f22c711d246bd50ef4d96c50e7a23f304f68153";
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