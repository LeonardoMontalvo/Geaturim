/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.HistorialM;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Leo
 */
public class HistorialControlador {
     private HistorialM historial;

     ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public HistorialM getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialM historial) {
        this.historial = historial;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Object[]> listarHistorialMantenimiento() {
    ArrayList<Object[]> listaHistorial = new ArrayList<>();

    try {
        String sql = "CALL ListarHistorialMantenimiento()";
        CallableStatement cs = conectar.prepareCall(sql);

        ResultSet rs = cs.executeQuery();

        int cont = 1;

        while (rs.next()) {
            Object[] obHistorial = new Object[5];
            obHistorial[0] = cont;
            obHistorial[1] = rs.getObject("NUMPLACA");
            obHistorial[2] = rs.getObject("ACCION");
            obHistorial[3] = rs.getObject("NOMBRE_USUARIO");
            obHistorial[4] = rs.getObject("FECHA_HORA");

            listaHistorial.add(obHistorial);

            cont++;
        }

        cs.close();
        return listaHistorial;
    } catch (SQLException e) {
        System.out.println("Error al listar historial de mantenimiento ordenado: " + e.getMessage());
    }

    return null;
}

    
}
