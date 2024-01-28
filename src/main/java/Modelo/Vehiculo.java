
package Modelo;

import java.util.Date;

/**
 *
 * @author Leo
 */
public class Vehiculo {
    
    
   private String NumPlaca,NombrePropietario;
   private int NumAsientos,Kilometraje;
   private Date AñoFabricacion;

    public Vehiculo(String NumPlaca, String NombrePropietario, int NumAsientos, int Kilometraje, Date AñoFabricacion) {
        this.NumPlaca = NumPlaca;
        this.NombrePropietario = NombrePropietario;
        this.NumAsientos = NumAsientos;
        this.Kilometraje = Kilometraje;
        this.AñoFabricacion = AñoFabricacion;
    }

    public String getNumPlaca() {
        return NumPlaca;
    }

    public void setNumPlaca(String NumPlaca) {
        this.NumPlaca = NumPlaca;
    }

    public String getNombrePropietario() {
        return NombrePropietario;
    }

    public void setNombrePropietario(String NombrePropietario) {
        this.NombrePropietario = NombrePropietario;
    }

    public int getNumAsientos() {
        return NumAsientos;
    }

    public void setNumAsientos(int NumAsientos) {
        this.NumAsientos = NumAsientos;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public Date getAñoFabricacion() {
        return AñoFabricacion;
    }

    public void setAñoFabricacion(Date AñoFabricacion) {
        this.AñoFabricacion = AñoFabricacion;
    }
   
   
}
