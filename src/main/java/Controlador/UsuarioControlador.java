
package Controlador;

import Modelo.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class UsuarioControlador {
      private Usuario usuario;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public void insertarUsuario(Usuario usuario) {
            try {
                String sql = "call AgregarUsuario('" + usuario.getNombre() + "','" + usuario.getContrasenia() + "');";
                ejecutar = (PreparedStatement) conectar.prepareCall(sql);
                var resultado = ejecutar.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Persona Creada con Éxito");                
                    ejecutar.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
                }
            } catch (SQLException e) {
                System.out.println("ERROR SQL");
            }
        }
        
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public  ArrayList<Object[]> datosUsuarios() {
    ArrayList<Object[]> listaObject = new ArrayList<>();

    try {
        String sql = "call ListarUsuarios();";
        ejecutar = (PreparedStatement) conectar.prepareCall(sql);
        res = ejecutar.executeQuery();
        int cont = 1;
        while (res.next()) {
            Object[] obUsuario = new Object[3];
            obUsuario[0] = cont;
            obUsuario[1] = res.getObject("NOMBRE");
            obUsuario[2] = res.getObject("CONTRASENA");

            listaObject.add(obUsuario);
            cont++;
        }
        ejecutar.close();
        return listaObject;
    } catch (SQLException e) {
        System.out.println("ERROR SQL CARGA USUARIOS");
    }

    return null;
}
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
 public void eliminarUsuario(String nombre, String contrasenia) {
    try {
        String sql = "DELETE FROM usuario WHERE NOMBRE = '" + nombre + "' AND CONTRASENA = '" + contrasenia + "'";
        ejecutar = (PreparedStatement) conectar.prepareStatement(sql);
        ejecutar.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Usuario eliminado con éxito");
    } catch (SQLException e) {
        System.out.println("Error al eliminar usuario: " + e.getMessage());
    } 
     
}
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public ArrayList<Object[]> buscarUsuarios(String nombreBuscado) {
    ArrayList<Object[]> listaObject = new ArrayList<>();

    try {
        String sql = "CALL sp_BuscarUsuariosPorNombre(?)";
        CallableStatement cs = conectar.prepareCall(sql);
        cs.setString(1, nombreBuscado);

        ResultSet rs = cs.executeQuery();

        int cont = 1; // Inicializar el contador

        while (rs.next()) {
            Object[] obUsuario = new Object[3]; // Cambiar a 3 elementos
            obUsuario[0] = cont;
            obUsuario[1] = rs.getObject("NOMBRE");
            obUsuario[2] = rs.getObject("CONTRASENA");

            listaObject.add(obUsuario);

            cont++; // Incrementar el contador
        }

        cs.close();
        return listaObject;
    } catch (SQLException e) {
        System.out.println("Error al buscar usuarios por nombre: " + e.getMessage());
    }

    return null;
}


 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

 
public void editarUsuario(String nombreAntiguo, String contraseniaAntigua, String nuevoNombre, String nuevaContrasenia) {
    try {
        String sql = "CALL EditarUsuario('" + nombreAntiguo + "', '" + contraseniaAntigua + "', '" + nuevoNombre + "', '" + nuevaContrasenia + "')";
        CallableStatement cs = conectar.prepareCall(sql);

        int resultado = cs.executeUpdate();

        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Usuario editado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al editar usuario");
        }

        cs.close();
    } catch (SQLException e) {
        System.out.println("Error al editar usuario: " + e.getMessage());
    }
}



}
