
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Leo
 */
public class Mantenimiento {
    private String idvehiculo;
    private String CambiosDeAceite, CambiosDeFiltro;
    private Date fecha;
    private int Kilometraje;

     public String getFechaFormateada() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.fecha);
    }

    public Mantenimiento(String idvehiculo, String CambiosDeAceite, String CambiosDeFiltro, Date fecha, int Kilometraje) {
        this.idvehiculo = idvehiculo;
        this.CambiosDeAceite = CambiosDeAceite;
        this.CambiosDeFiltro = CambiosDeFiltro;
        this.fecha = fecha;
        this.Kilometraje = Kilometraje;
    }

    public String getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(String idvehiculo) {
        this.idvehiculo = idvehiculo;
    }


    public String getCambiosDeAceite() {
        return CambiosDeAceite;
    }

    public void setCambiosDeAceite(String CambiosDeAceite) {
        this.CambiosDeAceite = CambiosDeAceite;
    }

    public String getCambiosDeFiltro() {
        return CambiosDeFiltro;
    }

    public void setCambiosDeFiltro(String CambiosDeFiltro) {
        this.CambiosDeFiltro = CambiosDeFiltro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }
    
    
    
    
}