
package Modelo;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Leo
 */
public class Contrato {
   
    private String Destino, NombreConductor, vehiculo;
    private Date fecha; 
    private int Dias, Asientos; 

     public String getFechaFormateada() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.fecha);
    }
        
    public Contrato(String Destino, String NombreConductor, String vehiculo, Date fecha, int Dias, int Asientos) {
       this.Destino = Destino;
        this.NombreConductor = NombreConductor;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.Dias = Dias;
        this.Asientos = Asientos;
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

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
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
