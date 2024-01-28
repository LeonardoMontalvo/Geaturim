
package Modelo;

/**
 *
 * @author Leo
 */
public class Cliente {
    
    private String NombreCli, Apellido, Telefono, Cedula, Direccion; 

    public Cliente(String NombreCli, String Apellido, String Telefono, String Cedula, String Direccion) {
        this.NombreCli = NombreCli;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
    }

    public String getNombreCli() {
        return NombreCli;
    }

    public void setNombreCli(String NombreCli) {
        this.NombreCli = NombreCli;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }


}