/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Controlador.Menu;

/**
 *
 * @author Leo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Crea una instancia del formulario Menu y lo hace visible
            Menu menu = new Menu();
            menu.setVisible(true);
        }
    });
        
        
    }
    
}
