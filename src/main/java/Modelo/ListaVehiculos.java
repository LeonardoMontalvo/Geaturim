/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Sarita
 */
public class ListaVehiculos {
    ArrayList<Vehiculo>Lista;
    
    public ListaVehiculos(){
        Lista = new ArrayList();
    }
    public void AgregarVehiculos(Vehiculo v){
    Lista.add(v);
    }
    
}
