/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Abono;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarita
 */
public class AbonoControlador {
     private Abono abono;
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
    /////////////////////////////////////////////////////////////OBTENER DATOS DE ABONO///////////////////////////////////////////////////////////////////////77
    
    public ArrayList<Object[]> datosAbonos() {
    ArrayList<Object[]> listaDatos = new ArrayList<>();
    String sql = "{CALL ObtenerDatosAbonoS()}";

    try (CallableStatement statement = conectar.prepareCall(sql);
         ResultSet resultSet = statement.executeQuery()) {
        int cont = 1;
        while (resultSet.next()) {
            Object[] fila = new Object[8]; 
            fila[0] = cont;
            fila[1] = resultSet.getString("DESTINO");
            fila[2] = resultSet.getDouble("VALOR");
            fila[3] = resultSet.getDate("FECHA");
            fila[4] = resultSet.getString("BANCOSCOMP");
            fila[5] = resultSet.getDouble("MONTO");
            fila[6] = resultSet.getString("ESTADO");
            fila[7] = resultSet.getString("BANCO");
            listaDatos.add(fila);

            cont++;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return listaDatos;
}
    //////////////////////////////////////////////OBTENER DESTINO ////////////////////////////////////////77
    
    public String obtenerDestinoPorContrato(int contratoId) {
    String destino = null;
    try {
        CallableStatement statement = conectar.prepareCall("{CALL ObtenerDestinoPorContrato(?)}");
        statement.setInt(1, contratoId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            destino = resultSet.getString("DESTINO");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return destino;
}
    
    //////////////////////////////////////////////////CREAR ABONO/////////////////////////////////////////////////
    
   public void agregarAbono(Abono abono) {
    try {
        String sql = "{CALL InsertarAbono(?, ?, ?, ?, ?, ?, ?)}";
        
        CallableStatement statement = conectar.prepareCall(sql);
     
        statement.setString(1, abono.getDestino());
        statement.setDouble(2, abono.getValor());
        statement.setDate(3, new java.sql.Date(new Date().getTime())); 
        statement.setString(4, abono.getBancosComp()); 
        statement.setDouble(5, abono.getMonto()); 
        statement.setString(6, abono.getEstado()); 
        statement.setString(7, abono.getBanco());

        statement.executeUpdate();
        statement.close();
        System.out.println("Abono insertado con éxito");              
    } catch (SQLException e) {
        System.out.println("Error al insertar abono: " + e.getMessage());
    }
} 
   ////////////////////////////////////////////////////////////BUSCAR ABONO//////////////////////////////////////////////////////////////////
   
   public ArrayList<Object[]> buscarAbonosPorContrato(int idContrato) {
    ArrayList<Object[]> listaAbonos = new ArrayList<>();

    try {
        String sql = "CALL BuscarAbonosPorContrato(?)";
        CallableStatement cs = conectar.prepareCall(sql);
        cs.setInt(1, idContrato);

        ResultSet rs = cs.executeQuery();

        int cont = 1; 
        while (rs.next()) {
            Object[] abono = new Object[8]; 
            abono[0] = cont;
            abono[1] = rs.getObject("DESTINO");
            abono[2] = rs.getObject("VALOR");
            abono[3] = rs.getObject("FECHA");
            abono[4] = rs.getObject("BANCOSCOMP");
            abono[5] = rs.getObject("MONTO");
            abono[6] = rs.getObject("ESTADO");
            abono[7] = rs.getObject("BANCO");

            listaAbonos.add(abono);
            cont++;
        }

        cs.close();
        return listaAbonos;
    } catch (SQLException e) {
        System.out.println("Error al buscar abonos por contrato: " + e.getMessage());
    }

    return null;
}
   /////////////////////////////////////////////////////////ELIMINAR ABONO/////////////////////////////////////////////////////////////77
   
   public void eliminarAbono(int idAbono) {
    try {
        String sql = "CALL EliminarAbono(?)";
        CallableStatement cs = conectar.prepareCall(sql);
        cs.setInt(1, idAbono);
        cs.executeUpdate();
        cs.close();
        
        System.out.println("Abono eliminado con éxito.");
    } catch (SQLException e) {
        System.out.println("Error al eliminar abono: " + e.getMessage());
    }
}
   ///////////////////////////////////////////////EDITAR ABONO/////////////////////////////////////////////////////////////////////
   
 public void editarAbono(int idAbono, String destino, double valor, Date fecha, String bancosComp, double monto, String estado, String banco) {
    try {
        String sql = "CALL EditarAbono(?, ?, ?, ?, ?, ?, ?, ?)";
        CallableStatement cs = conectar.prepareCall(sql);

        cs.setInt(1, idAbono);
        cs.setString(2, destino);
        cs.setDouble(3, valor);
        cs.setDate(4, new java.sql.Date(fecha.getTime()));
        cs.setString(5, bancosComp);
        cs.setDouble(6, monto);
        cs.setString(7, estado);
        cs.setString(8, banco);

        int resultado = cs.executeUpdate();

        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Abono editado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al editar abono");
        }

        cs.close();
    } catch (SQLException e) {
        System.out.println("Error al editar abono: " + e.getMessage());
    }
}
   /////////////////////////////////////77OBTENER ID /////////////////////////////////////////////////////////////7777
   
   public Abono obtenerAbono(int abonoId) {
    Abono abono = null;
    try {
        CallableStatement statement = conectar.prepareCall("{CALL ObtenerDatosAbono(?)}");
        statement.setInt(1, abonoId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String destino = resultSet.getString("DESTINO");
            double valor = resultSet.getDouble("VALOR");
            Date fecha = resultSet.getDate("FECHA");
            String bancosComp = resultSet.getString("BANCOSCOMP");
            double monto = resultSet.getDouble("MONTO");
            String estado = resultSet.getString("ESTADO");
            String banco = resultSet.getString("BANCO");
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return abono;
}
}