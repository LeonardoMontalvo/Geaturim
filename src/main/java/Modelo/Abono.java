
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Leo
 */
public class Abono {

    private double Valor, Monto;
    private Date fecha; 
    private String BancosComp, Banco;
     private boolean liquidado, SinLiquidar;
 
     public String getFechaFormateada() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.fecha);
    }
    public Abono(double Valor, double Monto, Date fecha, String BancosComp, String Banco, boolean liquidado, boolean SinLiquidar) {
        this.Valor = Valor;
        this.Monto = Monto;
        this.fecha = fecha;
        this.BancosComp = BancosComp;
        this.Banco = Banco;
        this.liquidado = liquidado;
        this.SinLiquidar = SinLiquidar;
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

    public boolean isLiquidado() {
        return liquidado;
    }

    public void setLiquidado(boolean liquidado) {
        this.liquidado = liquidado;
    }

    public boolean isSinLiquidar() {
        return SinLiquidar;
    }

    public void setSinLiquidar(boolean SinLiquidar) {
        this.SinLiquidar = SinLiquidar;
    }

}
