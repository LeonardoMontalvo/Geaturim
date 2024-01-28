
package Modelo;

import java.util.Date;

/**
 *
 * @author Leo
 */
public class Contrato {
   
    private String Destino, NombreConductor;
    private Date fecha; 
    private int Dias;
    private Estado estado;

    public Contrato(String Destino, String NombreConductor, Date fecha, int Dias, Estado estado) {
        this.Destino = Destino;
        this.NombreConductor = NombreConductor;
        this.fecha = fecha;
        this.Dias = Dias;
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
     public enum Estado {
        LIQUIDADO, SIN_LIQUIDAR
    }
     
     
  
    
    
}
