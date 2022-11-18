package edu.umss.ejercicios.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    public static final String DB_URL = "jdbc:mysql://localhost/academico?user=root&password=root";
    public static Connection abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DB_URL);
    }

    public static void cerrarConexion(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
