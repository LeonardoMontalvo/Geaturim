
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leo
 */
public class LoginControlador {

    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;  
    

public boolean autenticarUsuario(String nombre, String contrasenia) {
    try {
        String sql = "SELECT * FROM usuario WHERE NOMBRE = ? AND CONTRASENA = ?";
        try (PreparedStatement ps = conectar.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, contrasenia);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al autenticar usuario: " + e.getMessage());
        return false;
    }
}

}
