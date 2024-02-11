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
}
