/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Contrato;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
            Object[] fila = new Object[8]; 
            fila[0] = cont;
            fila[1] = resultSet.getString("NUMPLACA");
            fila[2] = resultSet.getString("CEDULA");
            fila[3] = resultSet.getString("DESTINO");
            fila[4] = resultSet.getDate("FECHA");
            fila[5] = resultSet.getString("NOMCONDUCTOR");
            fila[6] = resultSet.getInt("DIAS");
            fila[7] = resultSet.getInt("ASIENTOS");
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
        String sql = "CALL CrearContrato(?, ?, ?, ?, ?, ?, ?)";
        
        ejecutar = conectar.prepareStatement(sql);
        ejecutar.setString(1, contrato.getIdvehiculoc());
        ejecutar.setString(2, contrato.getIdcliente());
        ejecutar.setString(3, contrato.getDestino());
        ejecutar.setDate(4, new java.sql.Date(contrato.getFecha().getTime()));
        ejecutar.setString(5, contrato.getNombreConductor());
        ejecutar.setInt(6, contrato.getDias());
        ejecutar.setInt(7, contrato.getAsientos());
        
        ejecutar.executeUpdate();
        ejecutar.close();
        System.out.println("Contrato creado con éxito");              
    } catch (SQLException e) {
        System.out.println("Error al agregar contrato: " + e.getMessage());
    }
}

    
   
    ///////////////////////////////////////////////////////////////MODIFICAR CONTRATO////////////////////////////////////////////////////////////////////////////////

      public boolean editarContrato(int contratoId, String nuevaPlaca, String nuevaCedulaCliente, String nuevoDestino, Date nuevaFecha, String nuevoConductor, int nuevosDias, int nuevosAsientos) {
        try {
            String sql = "CALL editarContrato(?, ?, ?, ?, ?, ?, ?)";
            CallableStatement cs = conectar.prepareCall(sql);
            cs.setString(1, nuevaPlaca);
            cs.setString(2, nuevaCedulaCliente);
            cs.setString(3, nuevoDestino);
            java.sql.Date sqlNuevaFecha = new java.sql.Date(nuevaFecha.getTime());
            cs.setDate(4, sqlNuevaFecha); 
            cs.setString(5, nuevoConductor);
            cs.setInt(6, nuevosDias);
            cs.setInt(7, nuevosAsientos);
            cs.executeUpdate();
            cs.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al editar contrato: " + e.getMessage());
            return false;
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
            Object[] obContrato = new Object[8]; 
            obContrato[0] = cont;
            obContrato[1] = rs.getObject("NUMPLACA");
            obContrato[2] = rs.getObject("CEDULA");
            obContrato[3] = rs.getObject("DESTINO");
            obContrato[4] = rs.getObject("FECHA");
            obContrato[5] = rs.getObject("NOMCONDUCTOR");
            obContrato[6] = rs.getObject("DIAS");
            obContrato[7] = rs.getObject("ASIENTOS");

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

    ////////////////////////////////////////////////////////////////////ELIMINAR CONTRATO/////////////////////////////////////////////////////////////////77

public void eliminarContrato(Date fecha, String numeroPlaca, String cedulaCliente) {
    try {
        String sql = "CALL EliminarContrato(?, ?, ?)";

        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setDate(1, new java.sql.Date(fecha.getTime()));
        ps.setString(2, numeroPlaca);
        ps.setString(3, cedulaCliente);
        ps.executeUpdate();
        ps.close();

        System.out.println("Contrato eliminado con éxito.");
    } catch (SQLException e) {
        System.out.println("Error al eliminar contrato: " + e.getMessage());
    }
}



 
}
