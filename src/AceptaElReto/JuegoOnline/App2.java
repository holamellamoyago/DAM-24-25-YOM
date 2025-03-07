package AceptaElReto.JuegoOnline;

import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import AceptaElReto.JuegoOnline.Clases.Usuario;
import at.favre.lib.crypto.bcrypt.BCrypt;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario user;
        int opcionSeleccionada = 0;

        do {
            System.out.println("===============================");
            System.out.println("Bienvenido al 3 en raya ONLINE");
            System.out.println("===============================");
            System.out.println("\n1.Crear usuario");
            System.out.println("2.Iniciar sesion");
            System.out.println("3.Recuperar contrasena");
            System.out.println("\n¿Que te gustaría hacer?");

            opcionSeleccionada = sc.nextInt();

            switch (opcionSeleccionada) {
                case 1:
                    user = crearUsuario();
                    break;
                    case 2:
                    user = iniciarSesion();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcionSeleccionada != -1);
    }

    private static String generarStringHash2Y(String password) {
        char[] bcryptChars = BCrypt.with(BCrypt.Version.VERSION_2Y).hashToChar(13, password.toCharArray());
        return String.valueOf(bcryptChars);
    }

    static Usuario crearUsuario(){
        Scanner sc = new Scanner(System.in);
        Connection conexion = Conexion.conectar();
        Statement sentencia;
        
        String usuario, contrasenha;


        System.out.println("Introduce el nombre de usuario: ");
        usuario = sc.nextLine();

        System.out.println("Ahora la contrasela: ");
        contrasenha = sc.nextLine();

        try {
            sentencia = conexion.createStatement();
            sentencia.executeUpdate("INSERT INTO USER (NOMBRE,CONTRASENHA) VALUES ('"
                    + usuario + "', '" + generarStringHash2Y(contrasenha) + "')");
            sentencia.close();
            conexion.close();
            return new Usuario(usuario, contrasenha);
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            throw new ArithmeticException("Error al crear usuario");
        } 

        
    }

    public static Usuario iniciarSesion() {
        do {
            System.out.println("LOGIN DE USUARIO");
            System.out.print("Usuario: ");
            String usuario = System.console().readLine();
            System.out.print("Contraseña: ");
            String password = new String(System.console().readPassword());
            if (loginUsuario(usuario, password)) {
                return new Usuario(usuario, password);
            } else {
                System.out.println("Usuario o contraseña incorrectos");
            }
        } while (true);
    }

    public static boolean loginUsuario(String username, String password) {
        boolean loginOk = false;
        Connection conexion = Conexion.conectar();

        Statement sentencia;
        try {
            sentencia = conexion.createStatement();

            ResultSet resultado = sentencia.executeQuery("SELECT * FROM USER WHERE NOMBRE LIKE '" + username + "'");

            if (resultado.next()) {
                // Si existe el usuario valida la contraseña con BCrypt
                byte[] passwordHashed = resultado.getString("CONTRASENHA").getBytes(StandardCharsets.UTF_8);
                BCrypt.Result resultStrict = BCrypt.verifyer(BCrypt.Version.VERSION_2Y).verifyStrict(
                        password.getBytes(StandardCharsets.UTF_8),
                        passwordHashed);
                loginOk = resultStrict.verified;
                loginOk = validarHash2Y(password, resultado.getString("CONTRASENHA"));
            }

            resultado.close();
            sentencia.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return loginOk;
    }

    private static boolean validarHash2Y(String password, String hash2y) {
        return BCrypt.verifyer(BCrypt.Version.VERSION_2Y)
                .verifyStrict(password.getBytes(StandardCharsets.UTF_8),
                        hash2y.getBytes(StandardCharsets.UTF_8)).verified;
    }
}
