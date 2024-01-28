
package Modelo;

import java.util.Date;

/**
 *
 * @author Leo
 */
public class Mantenimiento {
    
    
    private String Notas,Estado;
    private Date Fecha;

    public Mantenimiento(String Notas, String Estado, Date Fecha) {
        this.Notas = Notas;
        this.Estado = Estado;
        this.Fecha = Fecha;
    }

    public String getNotas() {
        return Notas;
    }

    public void setNotas(String Notas) {
        this.Notas = Notas;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
}
