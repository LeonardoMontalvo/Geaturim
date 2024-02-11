
package Controlador;



import Modelo.Vehiculo;
import java.beans.Statement;
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
 * @author Leo
 */
public class VehiculoControlador {
    
    
   private Vehiculo vehiculo;
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

    

/////////////////////////////////////////////////////////////////////////////////////// datosVehiculo ///////////////////////////////////////////////////////////////////////////////////////
  
  
    public  ArrayList<Object[]> datosVehiculo() {
    ArrayList<Object[]> listaObject = new ArrayList<>();

 try {
        String sql = "call ListarVehiculos();";
        ejecutar = (PreparedStatement) conectar.prepareCall(sql);
        res = ejecutar.executeQuery();
        int cont = 1;
        while (res.next()) {
            Object[] obVehiculo = new Object[6];
            obVehiculo[0] = cont;
            obVehiculo[1] = res.getObject("NUMPLACA");
            obVehiculo[2] = res.getObject("NUMASIENTOS");
            obVehiculo[3] = res.getObject("KILOMETRAJE");
            obVehiculo[4] = res.getObject("NOMBREPROPIETARIO");
            obVehiculo[5] = res.getObject("ANOFABRICACION");

            listaObject.add(obVehiculo);
            cont++;
        }
        ejecutar.close();
        return listaObject;
    } catch (SQLException e) {
        System.out.println("ERROR SQL CARGA VEHICULOS");
    }


    return null;
}
    

    /////////////////////////////////////////////////////////////////////////////////////// AGREGAR VEHICULO ///////////////////////////////////////////////////////////////////////////////////////

public void agregarVehiculo(Vehiculo vehiculo) {
    try {
        String sql = "CALL CrearVehiculo('" + vehiculo.getNumPlaca() + "', "
                   + vehiculo.getNumAsientos() + ", "
                   + vehiculo.getKilometraje() + ", '"
                   + vehiculo.getNombrePropietario() + "', '"
                   + new java.sql.Date(vehiculo.getAñoFabricacion().getTime()) + "')";
        
        ejecutar = conectar.prepareStatement(sql);
        ejecutar.executeUpdate();
        ejecutar.close();
        JOptionPane.showMessageDialog(null, "Cliente Creado con Éxito");                
    } catch (SQLException e) {
        System.out.println("Error al agregar vehículo: " + e.getMessage());
    }
}

    /////////////////////////////////////////////////////////////////////////////////////// ELIMINAR VEHICULO ///////////////////////////////////////////////////////////////////////////////////////

public void eliminarVehiculo(String numPlaca) {
    try {
        String sql = "CALL EliminarVehiculo('" + numPlaca + "')";
        ejecutar = conectar.prepareStatement(sql);
        ejecutar.executeUpdate();
        ejecutar.close();
        
        System.out.println("Vehículo eliminado con éxito.");
    } catch (SQLException e) {
        System.out.println("Error al eliminar vehículo: " + e.getMessage());
    }
}


    /////////////////////////////////////////////////////////////////////////////////////// EDITAR  VEHICULO ///////////////////////////////////////////////////////////////////////////////////////


public void editarVehiculo(Vehiculo vehiculo, String numPlacaAntiguo) {
    String sql = "CALL EditarVehiculo(?, ?, ?, ?, ?, ?)";
    try (Connection conectar = parametros.conectar();
         PreparedStatement ps = conectar.prepareStatement(sql)) {

        ps.setString(1, numPlacaAntiguo);
        ps.setString(2, vehiculo.getNumPlaca());
        ps.setInt(3, vehiculo.getNumAsientos());
        ps.setInt(4, vehiculo.getKilometraje());
        ps.setString(5, vehiculo.getNombrePropietario());
        ps.setDate(6, new java.sql.Date(vehiculo.getAñoFabricacion().getTime()));

        int resultado = ps.executeUpdate();

        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Vehículo editado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al editar vehículo");
        }
    } catch (SQLException e) {
        System.out.println("Error al editar vehículo: " + e.getMessage());
    }
}

    /////////////////////////////////////////////////////////////////////////////////////// BUSCAR  VEHICULO ///////////////////////////////////////////////////////////////////////////////////////

public ArrayList<Object[]> buscarVehiculos(String numPlaca) {
    ArrayList<Object[]> listaObject = new ArrayList<>();

    try {
        String sql = "CALL BuscarVehiculoPorPlaca(?)";
        CallableStatement cs = conectar.prepareCall(sql);
        cs.setString(1, numPlaca);

        ResultSet rs = cs.executeQuery();

        int cont = 1; 

        while (rs.next()) {
            Object[] obVehiculo = new Object[6]; 
            obVehiculo[0] = cont;
            obVehiculo[1] = rs.getObject("NUMPLACA");
            obVehiculo[2] = rs.getObject("NUMASIENTOS");
            obVehiculo[3] = rs.getObject("KILOMETRAJE");
            obVehiculo[4] = rs.getObject("NOMBREPROPIETARIO");
            obVehiculo[5] = rs.getObject("ANOFABRICACION");

            listaObject.add(obVehiculo);

            cont++;
        }

        cs.close();
        return listaObject;
    } catch (SQLException e) {
        System.out.println("Error al buscar vehículos por número de placa: " + e.getMessage());
    }

    return null;

    
}
 public List<String> obtenerListaPlacasVehiculos() {
        List<String> listaPlacas = new ArrayList<>();
        try {
            String sql = "SELECT NUMPLACA FROM VEHICULO";
            ejecutar = conectar.prepareStatement(sql);
            ResultSet rs = ejecutar.executeQuery();
            while (rs.next()) {
                String numPlaca = rs.getString("NUMPLACA");
                listaPlacas.add(numPlaca);
            }
            ejecutar.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaPlacas;
    }



}
