/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Leo
 */
public class HistorialM {
    

    private int idMantenimiento;
    private String accion;
    private int idUsuario;
    private Date fechaHora;

    public HistorialM(int idMantenimiento, String accion, int idUsuario, Date fechaHora) {
        this.idMantenimiento = idMantenimiento;
        this.accion = accion;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
    }

   

    public int getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(int idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }


}
