
package Controlador;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/**
 *
 * @author Leo
 */
public class Login extends javax.swing.JFrame {
    private int tiempoLimite = 30;
    private Timer timer;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
         iniciarContador();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblInisiarS1 = new javax.swing.JLabel();
        lblCorreoE1 = new javax.swing.JLabel();
        lblContraseña1 = new javax.swing.JLabel();
        btnIngresar1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtcontra = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBoxContra1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInisiarS1.setFont(new java.awt.Font("Eras Light ITC", 0, 40)); // NOI18N
        lblInisiarS1.setForeground(new java.awt.Color(255, 255, 255));
        lblInisiarS1.setText("Iniciar Sesión");
        jPanel3.add(lblInisiarS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 275, 53));

        lblCorreoE1.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        lblCorreoE1.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoE1.setText("CORREO ELECTRÓNICO");
        jPanel3.add(lblCorreoE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        lblContraseña1.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        lblContraseña1.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña1.setText("CONTRASEÑA");
        jPanel3.add(lblContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        btnIngresar1.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar1.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        btnIngresar1.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar1.setText("Ingresar");
        btnIngresar1.setBorderPainted(false);
        btnIngresar1.setContentAreaFilled(false);
        btnIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar1.setFocusPainted(false);
        btnIngresar1.setFocusable(false);
        btnIngresar1.setRequestFocusEnabled(false);
        btnIngresar1.setVerifyInputWhenFocusTarget(false);
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 210, 60));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(153, 153, 153));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 270, 40));

        txtcontra.setBackground(new java.awt.Color(255, 255, 255));
        txtcontra.setFont(txtcontra.getFont().deriveFont(txtcontra.getFont().getSize()+7f));
        txtcontra.setForeground(new java.awt.Color(0, 0, 0));
        txtcontra.setBorder(null);
        txtcontra.setCaretColor(new java.awt.Color(153, 153, 153));
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });
        jPanel3.add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 270, 36));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\arroba.png")); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 48, 36));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\candado.png")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 48, 42));

        jCheckBoxContra1.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBoxContra1.setFont(new java.awt.Font("Eras Light ITC", 0, 14)); // NOI18N
        jCheckBoxContra1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxContra1.setText("Mostrar contraseña");
        jCheckBoxContra1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBoxContra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxContra1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBoxContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 600));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Logo.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 180, 180));

        lblFondo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Fondo Loggin.png")); // NOI18N
        lblFondo2.setOpaque(true);
        getContentPane().add(lblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void iniciarContador() {
        timer = new Timer(1000, (ActionEvent e) -> {
            tiempoLimite--;
            if (tiempoLimite <= 0) {
                timer.stop();
                JOptionPane.showMessageDialog(null, "Se ha agotado el tiempo para el registro");
                System.exit(0);
            }
        });

        timer.start();
    }
        
        public void validar() {
        String nombre = txtNombre.getText();
        String contrasenia = new String(txtcontra.getPassword());


        if (!nombre.isEmpty() && !contrasenia.isEmpty()) {
            LoginControlador usuarioControlador = new LoginControlador();
            if (usuarioControlador.autenticarUsuario(nombre, contrasenia)) {
                timer.stop();

                this.dispose();
                Menu ventanaPrincipal = new Menu();
                ventanaPrincipal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos");
        }
    }
    
    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        validar();
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jCheckBoxContra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxContra1ActionPerformed
               if ( jCheckBoxContra1.isSelected()) {

            txtcontra.setEchoChar((char) 0);
        } else {

            txtcontra.setEchoChar('•');
        }
    }//GEN-LAST:event_jCheckBoxContra1ActionPerformed

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fol------------d>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JCheckBox jCheckBoxContra1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblCorreoE1;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblInisiarS1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtcontra;
    // End of variables declaration//GEN-END:variables
}
