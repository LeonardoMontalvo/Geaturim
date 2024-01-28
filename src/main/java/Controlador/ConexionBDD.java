package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leo
 */

public class ConexionBDD {
    Connection con;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Geaturim", "root", "Leonardox_x2004");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar a la base de datos...");
        }
        return con;
    }
}
