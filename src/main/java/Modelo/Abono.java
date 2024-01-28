
package Modelo;

import java.util.Date;

/**
 *
 * @author Leo
 */
public class Abono {

    private double Valor;
    private Date fecha; 
    private String BancosComp;

    public Abono(double Valor, Date fecha, String BancosComp) {
        this.Valor = Valor;
        this.fecha = fecha;
        this.BancosComp = BancosComp;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getBancosComp() {
        return BancosComp;
    }

    public void setBancosComp(String BancosComp) {
        this.BancosComp = BancosComp;
    }
          
            
}
