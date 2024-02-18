/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mantenimiento;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarita
 */
public class MantenimientoControlador {
    
     private Mantenimiento mantenimiento;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public Connection getConectar() {
        return conectar;
    }

    public void setConectar(Connection conectar) {
        this.conectar = conectar;
    }
    
   ///////////////////////////////////////////////////////////DATOS DE MANTENIMIENTO POR PLACA/////////////////////////////////////////////////////////////////////7
    
     public ArrayList<Object[]> datosMantenimiento() {
        ArrayList<Object[]> listaDatos = new ArrayList<>();
        String sql = "SELECT  v.NUMPLACA, m.CAMBIOSACEITE, m.CAMBIOSFILTRO, m.FECHA, m.KILOMETRAJE " +
                     "FROM MANTENIMIENTO m " +
                     "JOIN VEHICULO v ON m.IDVEHICULO = v.IDVEHICULO";
        
        try (PreparedStatement statement = conectar.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            int cont = 1;
            while (resultSet.next()) {
                Object[] fila = new Object[6];
                fila[0] = cont;
                fila[1] = resultSet.getString("NUMPLACA");
                fila[2] = resultSet.getString("CAMBIOSACEITE");
                fila[3] = resultSet.getString("CAMBIOSFILTRO");
                fila[4] = resultSet.getDate("FECHA");
                fila[5] = resultSet.getInt("KILOMETRAJE");
                listaDatos.add(fila);
                
                cont++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaDatos;
    }

    ////////////////////////////////////////////////////OBTENER LISTA DE PLACAS///////////////////////////////////////////////////////////
    public List<String> obtenerListaPlacasVehiculos() {
        List<String> placas = new ArrayList<>();
        String sql = "SELECT NUMPLACA FROM VEHICULO";

        try (PreparedStatement statement = conectar.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String numPlaca = resultSet.getString("NUMPLACA");
                placas.add(numPlaca);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de placas de vehículos: " + e.getMessage());
        }
        return placas;
    }
   
  /////////////////////////////////////////////////////////////CREAR MANTENIMENTO///////////////////////////////////////////////////////////////////7  
    
 

    public void agregarMantenimiento(Mantenimiento mantenimiento) {
    try {
        String sql = "CALL CrearMantenimiento('" + mantenimiento.getIdvehiculo() + "', '"
                   + mantenimiento.getCambiosDeAceite() + "', '"
                   + mantenimiento.getCambiosDeFiltro() + "', '"
                   + new java.sql.Date(mantenimiento.getFecha().getTime()) + "', '"
                   + mantenimiento.getKilometraje() + "')";
        
        ejecutar = conectar.prepareStatement(sql);
        ejecutar.executeUpdate();
        ejecutar.close();
        JOptionPane.showMessageDialog(null, "Mantenimiento creado con éxito");                
    } catch (SQLException e) {
        System.out.println("Error al agregar mantenimiento: " + e.getMessage());
    }
}
//////////////////////////////////////////////////////////////////ACTUALIZAR MANTENIMIENTO///////////////////////////////////////////////////////////////


    public void editarMantenimiento(Mantenimiento mantenimiento, int MantenimientoAntiguo) {
        String sql = "{CALL EditarMantenimiento(?, ?, ?, ?, ?, ?)}";
        try (final Connection conectar = parametros.conectar();final PreparedStatement ps = conectar.prepareStatement(sql)) {
            ps.setInt(1, MantenimientoAntiguo);
            ps.setString(2, mantenimiento.getIdvehiculo());
            ps.setString(3, mantenimiento.getCambiosDeAceite());
            ps.setString(4, mantenimiento.getCambiosDeFiltro());
            ps.setDate(5, new java.sql.Date(mantenimiento.getFecha().getTime()));
            ps.setInt(6, mantenimiento.getKilometraje());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                System.out.println("Mantenimiento editado con éxito");
                //JOptionPane.showMessageDialog(null, "Mantenimiento editado con éxito");
            } else {
                System.out.println("Error al editar mantenimiento");
                //JOptionPane.showMessageDialog(null, "Error al editar mantenimiento");
            }
        }catch (SQLException e) {
            System.out.println("Error al editar mantenimiento: " + e.getMessage());
        }
    }
    //////////////////////////////////////////////////////////////////BUSCAR MANTENIMIENTO POR PLACA//////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Object[]> buscarMantenimientosPorPlaca(String numPlaca) {
    ArrayList<Object[]> listaMantenimientos = new ArrayList<>();

    try {
        String sql = "CALL BuscarMantenimientoPorPlaca(?)";
        CallableStatement cs = conectar.prepareCall(sql);
        cs.setString(1, numPlaca);

        ResultSet rs = cs.executeQuery();

        int cont = 1; 

        while (rs.next()) {
            Object[] obMantenimiento = new Object[6]; 
            obMantenimiento[0] = cont;
            obMantenimiento[1] = rs.getObject("NUMPLACA");
            obMantenimiento[2] = rs.getObject("CAMBIOSACEITE");
            obMantenimiento[3] = rs.getObject("CAMBIOSFILTRO");
            obMantenimiento[4] = rs.getObject("FECHA");
            obMantenimiento[5] = rs.getObject("KILOMETRAJE");

            listaMantenimientos.add(obMantenimiento);

            cont++;
        }

        cs.close();
        return listaMantenimientos;
    } catch (SQLException e) {
        System.out.println("Error al buscar mantenimientos por número de placa: " + e.getMessage());
    }

    return null;
}
   //////////////////////////////////////////////////////////////////////ELIMINAR MANTENIMIENTO//////////////////////////////////////////////////////////////////////////// 
    
    public void eliminarMantenimiento(int idMantenimiento) {
    try {
        String sql = "CALL EliminarMantenimiento(?)";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setInt(1, idMantenimiento);
        ps.executeUpdate();
        ps.close();
        
        System.out.println("Mantenimiento eliminado con éxito.");
    } catch (SQLException e) {
        System.out.println("Error al eliminar mantenimiento: " + e.getMessage());
    }
}
    
    
    
    
    
    
     
}
    

