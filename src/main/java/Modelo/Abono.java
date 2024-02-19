
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Leo
 */
public class Abono {
     private String destino;
    private double Valor, Monto;
    private Date fecha; 
    private String BancosComp, Banco;
     private String Estado;
 
     public String getFechaFormateada() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.fecha);
    }

    public Abono(String destino, double Valor, double Monto, Date fecha, String BancosComp, String Estado, String Banco) {
        this.destino = destino;
        this.Valor = Valor;
        this.Monto = Monto;
        this.fecha = fecha;
        this.BancosComp = BancosComp;
        this.Banco = Banco;
        this.Estado = Estado;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
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

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
    