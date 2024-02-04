
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Leo
 */
public class Mantenimiento {
    
    private String CambiosDeAceite, CambiosDeFiltro;
    private Date fecha;
    private int Kilometraje;

     public String getFechaFormateada() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.fecha);
    }
    public Mantenimiento(String CambiosDeAceite, String CambiosDeFiltro, Date Fecha, int Kilometraje) {
        this.CambiosDeAceite = CambiosDeAceite;
        this.CambiosDeFiltro = CambiosDeFiltro;
        this.fecha = Fecha;
        this.Kilometraje = Kilometraje;
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

    public void setFecha(Date Fecha) {
        this.fecha = Fecha;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }
    
    
    
}