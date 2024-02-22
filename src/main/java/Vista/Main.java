
package Vista;

import Controlador.Login;
import Controlador.Menu;


/**
 *
 * @author Leo 
 */

public class Main {

 public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login menu = new Login();
                menu.setVisible(true);
             }
        });
    }
}