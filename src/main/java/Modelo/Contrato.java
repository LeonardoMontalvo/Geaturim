
package Modelo;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Leo
 */
public class Contrato {
    private String idvehiculoc , idcliente;
    private String Destino, NombreConductor;
    private int vehiculo;
    private Date fecha; 
    private int Dias, Asientos; 

     public String getFechaFormateada() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.fecha);
    }

    public Contrato(String idvehiculoc, String idcliente, String Destino, Date fecha, String NombreConductor, int Dias, int Asientos, int vehiculo) {
        this.idvehiculoc = idvehiculoc;
        this.idcliente = idcliente;
        this.Destino = Destino;
        this.NombreConductor = NombreConductor;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.Dias = Dias;
        this.Asientos = Asientos;
    }

    public String getIdvehiculoc() {
        return idvehiculoc;
    }

    public void setIdvehiculoc(String idvehiculoc) {
        this.idvehiculoc = idvehiculoc;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }
        
    

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getNombreConductor() {
        return NombreConductor;
    }

    public void setNombreConductor(String NombreConductor) {
        this.NombreConductor = NombreConductor;
    }

    public int getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(int vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    public int getAsientos() {
        return Asientos;
    }

    public void setAsientos(int Asientos) {
        this.Asientos = Asientos;
    }    
    
}
