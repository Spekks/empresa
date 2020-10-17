package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase Conector para conectar con una base de datos MySQL.
 * @author Héctor
 * @since 16/10/2020
 */
public class Conector {
	
	/**
	 * JDBC driver
	 */
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	/**
	 * URL de la base de datos
	 */
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gestion_nomina?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    /**
     * Usuario de la base de datos
     */
    private static final String DB_USER = "suprimo";
    /**
     * Contraseña de la base de datos
     */
    private static final String DB_PASS = "suprimo";

    /**
     * Método que establece la conexión con una base de datos establecida por parámetros.
     * @return Conexión correctamente establecida
     */
    public static Connection getconnection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Loading driver error");
            e.printStackTrace(System.out);
        } catch (SQLException e) {
            System.out.println("Connection error");
            e.printStackTrace(System.out);
        }
        return conn;
    }

    /**
     * Método que cierra un ResultSet.
     * @param resultSet ResultSet 
     * @throws SQLException 
     */
    public static void close(ResultSet resultSet) {
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    /**
     * Método que cierra una PreparedStatement.
     * @param preparedStatement PreparedStatement 
     * @throws SQLException 
     */
    public static void close(PreparedStatement preparedStatement) {
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    /**
     * Método que cierra una Connection.
     * @param conn Connection
     * @throws SQLException
     */
    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
