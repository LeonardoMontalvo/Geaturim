/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class ClienteControlador {
    
    private Cliente cliente;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////////  insertarClientes //////////////////////////////////////////////////////////////////////////////////////////////

    
    public void insertarClientes(Cliente cliente) {
            try {
                String sql = "call InsertarCliente('" + cliente.getNombreCli() + "','" + cliente.getApellido() + "','" + cliente.getTelefono() + "','" + cliente.getCedula() + "','" + cliente.getDireccion() + "');";
                ejecutar = (PreparedStatement) conectar.prepareCall(sql);
                var resultado = ejecutar.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Creado con Éxito");                
                    ejecutar.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
                }
            } catch (SQLException e) {
                System.out.println("ERROR SQL");
            }
        }
    
    
    
/////////////////////////////////////////////////////////////////////////////////////// datosCliente ///////////////////////////////////////////////////////////////////////////////////////
    
    public  ArrayList<Object[]> datosCliente() {
    ArrayList<Object[]> listaObject = new ArrayList<>();

    try {
        String sql = "call ListarClientes();";
        ejecutar = (PreparedStatement) conectar.prepareCall(sql);
        res = ejecutar.executeQuery();
        int cont = 1;
        while (res.next()) {
            Object[] obCliente = new Object[6];
            obCliente[0] = cont;
            obCliente[1] = res.getObject("NOMBRE");
            obCliente[2] = res.getObject("APELLIDO");
            obCliente[3] = res.getObject("TELEFONO");
            obCliente[4] = res.getObject("CEDULA");
            obCliente[5] = res.getObject("DIRECCION");

            listaObject.add(obCliente);
            cont++;
        }
        ejecutar.close();
        return listaObject;
    } catch (SQLException e) {
        System.out.println("ERROR SQL CARGA USUARIOS");
    }

    return null;
}
    
    /////////////////////////////////////////////////////////////////////////////////////// eliminarCliente ///////////////////////////////////////////////////////////////////////////////////////

    public void eliminarCliente(String nombre, String apellido, String telefono, String cedula, String direccion) {
        try {
            String sql = "CALL EliminarCliente('" + nombre + "', '" + apellido + "', '" + telefono + "', '" + cedula + "', '" + direccion + "')";
            ejecutar = conectar.prepareStatement(sql);
            ejecutar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito");
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }

    }


    
        /////////////////////////////////////////////////////////////////////////////////////// EDITAR CLIENTE ///////////////////////////////////////////////////////////////////////////////////////

    
public void editarCliente(String nombreAntiguo, String apellidoAntiguo, String telefonoAntiguo, String cedulaAntigua, String direccionAntigua, String nombreNuevo,String apellidoNuevo, String telefonoNuevo, String cedulaNueva, String direccionNueva ) {
    try {
        String sql = "CALL EditarCliente('" + nombreAntiguo + "', '" + apellidoAntiguo + "', '" + telefonoAntiguo + "', '" + cedulaAntigua + "', '" + direccionAntigua + "', '" + nombreNuevo + "', '" + apellidoNuevo + "', '" + telefonoNuevo + "', '" + cedulaNueva + "', '" + direccionNueva + "')";
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
