/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Contrato;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarita
 */
public class ContratoControlador {
     private Contrato contrato;
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
    
    ///////////////////////////////////////////////////////////////////OBTENER DATOS POR PLACA Y CLIENTE///////////////////////////////////////////////////////////////////////77
    
    
    public ArrayList<Object[]> datosContratosPorPlacaYCliente() {
    ArrayList<Object[]> listaDatos = new ArrayList<>();
    String sql = "{CALL listarContratosPorPlacaYCliente()}"; 
    
    try (CallableStatement statement = conectar.prepareCall(sql);
         ResultSet resultSet = statement.executeQuery()) {
        int cont = 1;
        while (resultSet.next()) {
            Object[] fila = new Object[9]; 
            fila[0] = cont;
            fila[1] = resultSet.getString("NUMPLACA");
            fila[2] = resultSet.getString("CEDULA");
            fila[3] = resultSet.getString("DESTINO");
            fila[4] = resultSet.getDate("FECHA");
            fila[5] = resultSet.getString("NOMCONDUCTOR");
            fila[6] = resultSet.getInt("DIAS");
            fila[7] = resultSet.getInt("ASIENTOS");
            fila[8] = resultSet.getInt("VEHICULO");
            listaDatos.add(fila);
            cont++;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return listaDatos;
}
    //////////////////////////////////////////////////////////////////////OBTENER LISTA DE PLACAS///////////////////////////////////////////////////////////////////7
 
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
    
     ////////////////////////////////////////////////////OBTENER LISTA DE CLIENTES POR CEDULA///////////////////////////////////////////////////////////
    public List<String> obtenerListaClientesCedula() {
        List<String> placas = new ArrayList<>();
        String sql = "SELECT CEDULA FROM CLIENTE";

        try (PreparedStatement statement = conectar.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String numPlaca = resultSet.getString("CEDULA");
                placas.add(numPlaca);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de clientes por cedula: " + e.getMessage());
        }
        return placas;
    }
    //////////////////////////////////////////////////////////////////CREAR CONTRATO/////////////////////////////////////////////////////////////////////////
    
    public void agregarContrato(Contrato contrato) {
    try {
        String sql = "CALL CrearContrato(?, ?, ?, ?, ?, ?, ?, ?)";
        
        ejecutar = conectar.prepareStatement(sql);
        ejecutar.setString(1, contrato.getIdvehiculoc());
        ejecutar.setString(2, contrato.getIdcliente());
        ejecutar.setString(3, contrato.getDestino());
        ejecutar.setDate(4, new java.sql.Date(contrato.getFecha().getTime()));
        ejecutar.setString(5, contrato.getNombreConductor());
        ejecutar.setInt(6, contrato.getDias());
        ejecutar.setInt(7, contrato.getAsientos());
        ejecutar.setInt(8, contrato.getVehiculo());
        
        ejecutar.executeUpdate();
        ejecutar.close();
        System.out.println("Contrato creado con éxito");              
    } catch (SQLException e) {
        System.out.println("Error al agregar contrato: " + e.getMessage());
    }
}
    ///////////////////////////////////////////////////////////////MODIFICAR CONTRATO////////////////////////////////////////////////////////////////////////////////

    public void actualizarContrato(Contrato contrato, int contratoId) {
    String sql = "CALL ModificarContrato(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try (Connection conectar = parametros.conectar(); PreparedStatement ps = conectar.prepareStatement(sql)) {
        ps.setInt(1, contratoId);
        ps.setString(2, contrato.getIdvehiculoc());
        ps.setString(3, contrato.getIdcliente());
        ps.setString(4, contrato.getDestino());
        ps.setDate(5, new java.sql.Date(contrato.getFecha().getTime()));
        ps.setString(6, contrato.getNombreConductor());
        ps.setInt(7, contrato.getDias());
        ps.setInt(8, contrato.getAsientos());
        ps.setInt(9, contrato.getVehiculo());
        
        int resultado = ps.executeUpdate();
        if (resultado > 0) {
            System.out.println("Contrato actualizado con éxito");
            //JOptionPane.showMessageDialog(null, "Contrato actualizado con éxito");
        } else {
            System.out.println("Error al actualizar contrato");
            //JOptionPane.showMessageDialog(null, "Error al actualizar contrato");
        }
    } catch (SQLException e) {
        System.out.println("Error al actualizar contrato: " + e.getMessage());
    }
}
    
    /////////////////////////////////////////////////////////////////////BUSCAR CONTRATO POR CEDULA/////////////////////////////////////////////////////////////

    
    public ArrayList<Object[]> buscarContratosPorCedula(String cedulaCliente) {
    ArrayList<Object[]> listaContratos = new ArrayList<>();

    try {
        String sql = "CALL BuscarContratoPorCedula(?)";
        CallableStatement cs = conectar.prepareCall(sql);
        cs.setString(1, cedulaCliente);

        ResultSet rs = cs.executeQuery();

        int cont = 1; 

        while (rs.next()) {
            Object[] obContrato = new Object[9]; 
            obContrato[0] = cont;
            obContrato[1] = rs.getObject("NUMPLACA");
            obContrato[2] = rs.getObject("CEDULA");
            obContrato[3] = rs.getObject("DESTINO");
            obContrato[4] = rs.getObject("FECHA");
            obContrato[5] = rs.getObject("NOMCONDUCTOR");
            obContrato[6] = rs.getObject("DIAS");
            obContrato[7] = rs.getObject("ASIENTOS");
            obContrato[8] = rs.getObject("VEHICULO");

            listaContratos.add(obContrato);

            cont++;
        }

        cs.close();
        return listaContratos;
    } catch (SQLException e) {
        System.out.println("Error al buscar contratos por cédula: " + e.getMessage());
    }

    return null;
}
}
