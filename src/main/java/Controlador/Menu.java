package Controlador;

import Modelo.Abono;
import Modelo.Cliente;
import Modelo.Contrato;
import Modelo.Mantenimiento;
import Modelo.Usuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo
 */

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        setModelo();
    }    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel16 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtVehiculo = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtAsientos = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        FeachaContrato = new com.toedter.calendar.JDateChooser();
        txtConductor = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnGuardarU3 = new javax.swing.JButton();
        btnEditarU3 = new javax.swing.JButton();
        btnEliminarU3 = new javax.swing.JButton();
        btnNuevoU3 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        txtConductor1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableContrato = new javax.swing.JTable();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel15 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        txtCedula = new javax.swing.JTextField();
        txtApellidoC = new javax.swing.JTextField();
        txtNombreC = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardarCli = new javax.swing.JButton();
        btnEditarCli = new javax.swing.JButton();
        btnEliminarCli = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jPanel19 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        FeachaAbono = new com.toedter.calendar.JDateChooser();
        txtBanco = new javax.swing.JTextField();
        btnGuardarU4 = new javax.swing.JButton();
        btnEditarU4 = new javax.swing.JButton();
        btnEliminarU4 = new javax.swing.JButton();
        btnNuevoU4 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtComprobante = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jCheckBoxLiquidado = new javax.swing.JCheckBox();
        jCheckBoxSinLiquidar = new javax.swing.JCheckBox();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableAbono = new javax.swing.JTable();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        jPanel14 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        FeachaMantenimiento = new com.toedter.calendar.JDateChooser();
        btnGuardarM = new javax.swing.JButton();
        btnEditarM = new javax.swing.JButton();
        btnEliminarM = new javax.swing.JButton();
        btnNuevoM = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaAceite = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMantenimiento = new javax.swing.JTable();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jPanel13 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        txtNombreU = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        txtCorreo3 = new javax.swing.JTextField();
        txtcontra = new javax.swing.JPasswordField();
        jCheckBoxContra = new javax.swing.JCheckBox();
        btnBuscarU = new javax.swing.JButton();
        btnEditarU = new javax.swing.JButton();
        btnEliminarU = new javax.swing.JButton();
        btnNuevoU = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jInternalFrame6 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnContrato = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnAbono = new javax.swing.JButton();
        btnMantenimientos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        tipo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jInternalFrame1.setVisible(true);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 255));
        jLabel52.setText("Fecha");
        jPanel16.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 255));
        jLabel53.setText("Vehiculo");
        jPanel16.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 163, -1, -1));

        txtVehiculo.setBackground(new java.awt.Color(204, 204, 204));
        txtVehiculo.setBorder(null);
        txtVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehiculoActionPerformed(evt);
            }
        });
        jPanel16.add(txtVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 226, 30));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 255));
        jLabel54.setText("Asientos");
        jPanel16.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 219, -1, -1));

        txtAsientos.setBackground(new java.awt.Color(204, 204, 204));
        txtAsientos.setBorder(null);
        jPanel16.add(txtAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 243, 226, 30));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 255));
        jLabel55.setText("Dias");
        jPanel16.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jPanel35.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 226, 2));

        jPanel36.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 212, 226, 2));

        jPanel37.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 273, 226, 2));

        jPanel38.setBackground(new java.awt.Color(0, 110, 255));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("CONTRATOS");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel56)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        jPanel39.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 212, 226, 2));

        jPanel40.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 156, 226, 2));

        FeachaContrato.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.add(FeachaContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 30));

        txtConductor.setBackground(new java.awt.Color(204, 204, 204));
        txtConductor.setBorder(null);
        txtConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConductorActionPerformed(evt);
            }
        });
        jPanel16.add(txtConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 226, 30));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 255));
        jLabel57.setText("Destino");
        jPanel16.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel16.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 90));

        btnGuardarU3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\GuardarTodo.png")); // NOI18N
        btnGuardarU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarU3ActionPerformed(evt);
            }
        });
        jPanel16.add(btnGuardarU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarU3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarU3ActionPerformed(evt);
            }
        });
        jPanel16.add(btnEditarU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarU3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarU3ActionPerformed(evt);
            }
        });
        jPanel16.add(btnEliminarU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevoU3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoU3ActionPerformed(evt);
            }
        });
        jPanel16.add(btnNuevoU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Guardar");
        jPanel16.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, -1));

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Editar");
        jPanel16.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Nuevo");
        jPanel16.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Eliminar");
        jPanel16.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 255));
        jLabel60.setText("Conductor");
        jPanel16.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jPanel41.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 60, 2));

        txtConductor1.setBackground(new java.awt.Color(204, 204, 204));
        txtConductor1.setForeground(new java.awt.Color(0, 0, 0));
        txtConductor1.setBorder(null);
        txtConductor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConductor1ActionPerformed(evt);
            }
        });
        jPanel16.add(txtConductor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 60, 30));

        jTableContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTableContrato);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jTabbedPane1.addTab("1", jInternalFrame1);

        jInternalFrame2.setPreferredSize(new java.awt.Dimension(1110, 600));
        jInternalFrame2.setVisible(true);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 255));
        jLabel46.setText("Nombre");
        jPanel15.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 255));
        jLabel47.setText("Apellido");
        jPanel15.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 255));
        jLabel48.setText("Telefono");
        jPanel15.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefono.setBorder(null);
        jPanel15.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 226, 30));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 255));
        jLabel49.setText("Cedula");
        jPanel15.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jPanel28.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 226, 2));

        jPanel29.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 226, 2));

        jPanel30.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 226, 2));

        jPanel31.setBackground(new java.awt.Color(0, 110, 255));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("CLIENTES");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel50)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 60));

        jPanel32.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 226, 2));

        jPanel33.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 226, 2));

        txtCedula.setBackground(new java.awt.Color(204, 204, 204));
        txtCedula.setBorder(null);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel15.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 226, 30));

        txtApellidoC.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidoC.setBorder(null);
        txtApellidoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoCActionPerformed(evt);
            }
        });
        jPanel15.add(txtApellidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 226, 30));

        txtNombreC.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreC.setBorder(null);
        txtNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCActionPerformed(evt);
            }
        });
        jPanel15.add(txtNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 226, 30));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 255));
        jLabel51.setText("Direccion");
        jPanel15.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jPanel34.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 226, 2));

        txtDireccion.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccion.setBorder(null);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel15.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 226, 30));

        btnGuardarCli.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\GuardarTodo.png")); // NOI18N
        btnGuardarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCliActionPerformed(evt);
            }
        });
        jPanel15.add(btnGuardarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarCli.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCliActionPerformed(evt);
            }
        });
        jPanel15.add(btnEditarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarCli.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });
        jPanel15.add(btnEliminarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        jPanel15.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Guardar");
        jPanel15.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Editar");
        jPanel15.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Nuevo");
        jPanel15.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Eliminar");
        jPanel15.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableClientes);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("2", jInternalFrame2);

        jInternalFrame3.setVisible(true);

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 255));
        jLabel61.setText("Fecha");
        jPanel19.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 255));
        jLabel62.setText("Valor");
        jPanel19.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 163, -1, -1));

        txtValor.setBackground(new java.awt.Color(204, 204, 204));
        txtValor.setBorder(null);
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        jPanel19.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 226, 30));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 255));
        jLabel63.setText("Monto");
        jPanel19.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 219, -1, -1));

        txtMonto.setBackground(new java.awt.Color(204, 204, 204));
        txtMonto.setBorder(null);
        jPanel19.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 243, 226, 30));

        jPanel42.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 226, 2));

        jPanel43.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 212, 226, 2));

        jPanel44.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 273, 226, 2));

        jPanel45.setBackground(new java.awt.Color(0, 110, 255));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("ABONOS");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel65)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        jPanel46.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 212, 226, 2));

        jPanel47.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 156, 226, 2));

        FeachaAbono.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.add(FeachaAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 30));

        txtBanco.setBackground(new java.awt.Color(204, 204, 204));
        txtBanco.setBorder(null);
        txtBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBancoActionPerformed(evt);
            }
        });
        jPanel19.add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 226, 30));

        btnGuardarU4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\GuardarTodo.png")); // NOI18N
        btnGuardarU4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarU4ActionPerformed(evt);
            }
        });
        jPanel19.add(btnGuardarU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarU4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarU4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarU4ActionPerformed(evt);
            }
        });
        jPanel19.add(btnEditarU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarU4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarU4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarU4ActionPerformed(evt);
            }
        });
        jPanel19.add(btnEliminarU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevoU4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoU4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoU4ActionPerformed(evt);
            }
        });
        jPanel19.add(btnNuevoU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("Guardar");
        jPanel19.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, -1));

        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("Editar");
        jPanel19.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("Nuevo");
        jPanel19.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Eliminar");
        jPanel19.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        jLabel71.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 255));
        jLabel71.setText("Banco");
        jPanel19.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 255));
        jLabel72.setText("Comprobante");
        jPanel19.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        txtComprobante.setBackground(new java.awt.Color(204, 204, 204));
        txtComprobante.setBorder(null);
        jPanel19.add(txtComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 226, 30));

        jPanel50.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 226, 2));

        jLabel73.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 255));
        jLabel73.setText("Estado");
        jPanel19.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jCheckBoxLiquidado.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxLiquidado.setText("Liquidado");
        jCheckBoxLiquidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLiquidadoActionPerformed(evt);
            }
        });
        jPanel19.add(jCheckBoxLiquidado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jCheckBoxSinLiquidar.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxSinLiquidar.setText("Sin Liquidar");
        jPanel19.add(jCheckBoxSinLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        jTableAbono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTableAbono);

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addComponent(jScrollPane8)
        );

        jTabbedPane1.addTab("3", jInternalFrame3);

        jInternalFrame5.setVisible(true);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 255));
        jLabel40.setText("Fecha");
        jPanel14.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 255));
        jLabel41.setText("Kilometraje");
        jPanel14.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtKilometraje.setBackground(new java.awt.Color(204, 204, 204));
        txtKilometraje.setBorder(null);
        txtKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKilometrajeActionPerformed(evt);
            }
        });
        jPanel14.add(txtKilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 226, 30));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 255));
        jLabel42.setText("Cambios de aceite");
        jPanel14.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 255));
        jLabel43.setText("Cambios de filtro:");
        jPanel14.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jPanel22.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 226, 2));

        jPanel24.setBackground(new java.awt.Color(0, 110, 255));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("BITACORA DE MANTENIMIENTO");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel44)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        jPanel25.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 226, 2));

        jPanel26.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 156, 226, 2));

        FeachaMantenimiento.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.add(FeachaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 30));

        btnGuardarM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\GuardarTodo.png")); // NOI18N
        btnGuardarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMActionPerformed(evt);
            }
        });
        jPanel14.add(btnGuardarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMActionPerformed(evt);
            }
        });
        jPanel14.add(btnEditarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMActionPerformed(evt);
            }
        });
        jPanel14.add(btnEliminarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevoM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoMActionPerformed(evt);
            }
        });
        jPanel14.add(btnNuevoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Guardar");
        jPanel14.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, -1));

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Editar");
        jPanel14.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Nuevo");
        jPanel14.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Eliminar");
        jPanel14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        jTextArea2.setBackground(new java.awt.Color(187, 187, 187));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jScrollPane6.setViewportView(jTextArea2);

        jPanel14.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 230, -1));

        jScrollPane7.setBackground(new java.awt.Color(187, 187, 187));

        txtAreaAceite.setBackground(new java.awt.Color(187, 187, 187));
        txtAreaAceite.setColumns(20);
        txtAreaAceite.setRows(5);
        txtAreaAceite.setBorder(null);
        jScrollPane7.setViewportView(txtAreaAceite);

        jPanel14.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 230, -1));

        jTableMantenimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableMantenimiento);

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 379, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );

        jTabbedPane1.addTab("4", jInternalFrame5);

        jInternalFrame4.setVisible(true);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 255));
        jLabel36.setText("Contraseña");
        jPanel13.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jPanel17.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 226, 2));

        jPanel18.setBackground(new java.awt.Color(0, 110, 255));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("USUARIOS");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel39)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 60));

        txtNombreU.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreU.setBorder(null);
        txtNombreU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUActionPerformed(evt);
            }
        });
        jPanel13.add(txtNombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 226, 30));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 255));
        jLabel45.setText("Nombre");
        jPanel13.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jPanel27.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 226, -1));

        txtCorreo3.setBackground(new java.awt.Color(204, 204, 204));
        txtCorreo3.setBorder(null);
        txtCorreo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo3ActionPerformed(evt);
            }
        });
        jPanel13.add(txtCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 226, 30));

        txtcontra.setBackground(new java.awt.Color(204, 204, 204));
        txtcontra.setFont(txtcontra.getFont().deriveFont((float)12));
        txtcontra.setBorder(null);
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });
        jPanel13.add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 30));

        jCheckBoxContra.setForeground(new java.awt.Color(60, 63, 65));
        jCheckBoxContra.setText("Mostrar Contraseña");
        jCheckBoxContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxContraActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckBoxContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        btnBuscarU.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUActionPerformed(evt);
            }
        });
        jPanel13.add(btnBuscarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarU.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUActionPerformed(evt);
            }
        });
        jPanel13.add(btnEditarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarU.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUActionPerformed(evt);
            }
        });
        jPanel13.add(btnEliminarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevoU.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUActionPerformed(evt);
            }
        });
        jPanel13.add(btnNuevoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Buscar");
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Editar");
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Agregar");
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Eliminar");
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuario);

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("5", jInternalFrame4);

        jInternalFrame6.setVisible(true);

        javax.swing.GroupLayout jInternalFrame6Layout = new javax.swing.GroupLayout(jInternalFrame6.getContentPane());
        jInternalFrame6.getContentPane().setLayout(jInternalFrame6Layout);
        jInternalFrame6Layout.setHorizontalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame6Layout.setVerticalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("6", jInternalFrame6);

        jDesktopPane1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 6, 1100, 590));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1110, 600));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 110, 255));

        btnContrato.setBackground(new java.awt.Color(153, 153, 153));
        btnContrato.setForeground(new java.awt.Color(255, 255, 255));
        btnContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\contract_icon_194172.png")); // NOI18N
        btnContrato.setText("Contrato");
        btnContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContrato.setFocusable(false);
        btnContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(153, 153, 153));
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Clientes.png")); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientes.setFocusable(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnAbono.setBackground(new java.awt.Color(153, 153, 153));
        btnAbono.setForeground(new java.awt.Color(255, 255, 255));
        btnAbono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Carrito-de-compras.png")); // NOI18N
        btnAbono.setText("Abono");
        btnAbono.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbono.setFocusable(false);
        btnAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonoActionPerformed(evt);
            }
        });

        btnMantenimientos.setBackground(new java.awt.Color(153, 153, 153));
        btnMantenimientos.setForeground(new java.awt.Color(255, 255, 255));
        btnMantenimientos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Mantenimiento.png")); // NOI18N
        btnMantenimientos.setText("Mantenimiento");
        btnMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMantenimientos.setFocusable(false);
        btnMantenimientos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnMantenimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMantenimientosMouseClicked(evt);
            }
        });
        btnMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(153, 153, 153));
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Usuario.png")); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.setFocusable(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        tipo.setForeground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Logo.png")); // NOI18N

        btnBusqueda.setBackground(new java.awt.Color(153, 153, 153));
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\java\\Imagenes\\Lupa.png")); // NOI18N
        btnBusqueda.setText("Busquedas");
        btnBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBusqueda.setFocusable(false);
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMantenimientos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(tipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipo)
                .addGap(27, 27, 27)
                .addComponent(btnContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        jLabel38.setFont(new java.awt.Font("Yu Gothic Light", 3, 36)); // NOI18N
        jLabel38.setText("Sistema de parque Automotor ");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnContratoActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

        jTabbedPane1.setSelectedIndex(1);       
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonoActionPerformed
        //TODO add your handling code here:
        //LimpiarTable();
        //ListarProveedor();
        jTabbedPane1.setSelectedIndex(2);
        //btnEditarProveedor.setEnabled(true);
        //btnEliminarProveedor.setEnabled(true);
        //LimpiarProveedor();     
    }//GEN-LAST:event_btnAbonoActionPerformed

    private void btnMantenimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientosMouseClicked
        /*TODO add your handling code here:
        cbxProveedorPro.removeAllItems();
        llenarProveedor();
        */
    }//GEN-LAST:event_btnMantenimientosMouseClicked

    private void btnMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientosActionPerformed
        // TODO add your handling code here:
        //LimpiarTable();
        //ListarProductos();
        jTabbedPane1.setSelectedIndex(3);
        //btnEditarpro.setEnabled(false);
        //btnEliminarPro.setEnabled(false);
        //btnGuardarpro.setEnabled(true);
        //LimpiarProductos();
        
    }//GEN-LAST:event_btnMantenimientosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
        //LimpiarTable();
        //ListarVentas();
        
    }//GEN-LAST:event_btnUsuariosActionPerformed
private static final int MAX_LENGTH = 50;

    private void btnNuevoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUActionPerformed
     String nombre = txtNombreU.getText().trim();
    String contrasenia = txtcontra.getText().trim();

    if (nombre.isEmpty() || contrasenia.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos");
    } else {
        if (nombre.length() > MAX_LENGTH || contrasenia.length() > MAX_LENGTH) {
            JOptionPane.showMessageDialog(null, "Nombre o contraseña demasiado largos");
        } else {
   
            if (nombre.matches("^\\s*$") || contrasenia.matches("^\\s*$")) {
                JOptionPane.showMessageDialog(null, "Nombre o contraseña inválidos");
            } else {
                Usuario uM = new Usuario(nombre, contrasenia);
                UsuarioControlador uC = new UsuarioControlador();
                uC.insertarUsuario(uM);
                listaPersonas.add(uM);
                setDatos(uM);
            }
        }
    }

    }//GEN-LAST:event_btnNuevoUActionPerformed

    private void btnEliminarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUActionPerformed
       int filaSeleccionada = jTableUsuario.getSelectedRow();

    if (filaSeleccionada >= 0) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este usuario?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) jTableUsuario.getModel();
            String nombre = modelo.getValueAt(filaSeleccionada, 1).toString();
            String contrasenia = modelo.getValueAt(filaSeleccionada, 2).toString();
            
            UsuarioControlador usuarioControlador = new UsuarioControlador();
            usuarioControlador.eliminarUsuario(nombre, contrasenia);
            
            modelo.removeRow(filaSeleccionada);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
    }

    }//GEN-LAST:event_btnEliminarUActionPerformed

    private void btnEditarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUActionPerformed
        int filaSeleccionada = jTableUsuario.getSelectedRow();

    if (filaSeleccionada >= 0) {
        DefaultTableModel modelo = (DefaultTableModel) jTableUsuario.getModel();
        String nombreAntiguo = modelo.getValueAt(filaSeleccionada, 1).toString();
        String contraseniaAntigua = modelo.getValueAt(filaSeleccionada, 2).toString();

        String nuevoNombre = txtNombreU.getText().trim();
        String nuevaContrasenia = txtcontra.getText().trim();

        if (nuevoNombre.isEmpty() || nuevaContrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nuevo nombre y contraseña");
        } else {
            UsuarioControlador usuarioControlador = new UsuarioControlador();
            usuarioControlador.editarUsuario(nombreAntiguo, contraseniaAntigua, nuevoNombre, nuevaContrasenia);

            modelo.setValueAt(nuevoNombre, filaSeleccionada, 1);
            modelo.setValueAt(nuevaContrasenia, filaSeleccionada, 2);

            JOptionPane.showMessageDialog(null, "Usuario editado con éxito");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila para editar");
    }
    }//GEN-LAST:event_btnEditarUActionPerformed

    private void btnBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUActionPerformed
  String nombreBuscado = txtNombreU.getText().trim();

    if (!nombreBuscado.isEmpty()) {
        UsuarioControlador usuarioControlador = new UsuarioControlador();
        ArrayList<Object[]> resultados = usuarioControlador.buscarUsuarios(nombreBuscado);

        DefaultTableModel modelo = (DefaultTableModel) jTableUsuario.getModel();
        modelo.setRowCount(0);

        if (resultados != null) {
            for (Object[] fila : resultados) {
                modelo.addRow(fila);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al buscar usuarios por nombre");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese un nombre para buscar");
    }
    }//GEN-LAST:event_btnBuscarUActionPerformed

    private void jCheckBoxContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxContraActionPerformed

        if ( jCheckBoxContra.isSelected()) {

            txtcontra.setEchoChar((char) 0);
        } else {

            txtcontra.setEchoChar('•');
        }
    }//GEN-LAST:event_jCheckBoxContraActionPerformed

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraActionPerformed

    private void txtCorreo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo3ActionPerformed

    private void txtNombreUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUActionPerformed

    }//GEN-LAST:event_txtNombreUActionPerformed

    private void txtKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKilometrajeActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCActionPerformed

    private void txtApellidoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehiculoActionPerformed

    private void txtConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConductorActionPerformed

    private void btnGuardarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMActionPerformed

    private void btnEditarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarMActionPerformed

    private void btnEliminarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMActionPerformed

    private void btnNuevoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoMActionPerformed

    private void btnGuardarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCliActionPerformed

    private void btnEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCliActionPerformed

    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnGuardarU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarU3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarU3ActionPerformed

    private void btnEditarU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarU3ActionPerformed
    
    }//GEN-LAST:event_btnEditarU3ActionPerformed

    private void btnEliminarU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarU3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarU3ActionPerformed

    private void btnNuevoU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoU3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoU3ActionPerformed

    private void txtConductor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConductor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConductor1ActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBancoActionPerformed

    private void btnGuardarU4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarU4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarU4ActionPerformed

    private void btnEditarU4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarU4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarU4ActionPerformed

    private void btnEliminarU4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarU4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarU4ActionPerformed

    private void btnNuevoU4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoU4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoU4ActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        
        jTabbedPane1.setSelectedIndex(5);
        
    }//GEN-LAST:event_btnBusquedaActionPerformed

    
    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
     DefaultTableModel modelo = (DefaultTableModel) jTableUsuario.getModel();
     txtNombreU.setText((String )modelo.getValueAt(jTableUsuario.getSelectedRow(), 1));
     txtcontra.setText((String )modelo.getValueAt(jTableUsuario.getSelectedRow(), 2));

    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
     DefaultTableModel modelo = (DefaultTableModel)  jTableClientes.getModel();
        txtNombreC.setText((String) modelo.getValueAt(jTableClientes.getSelectedRow(), 1));
        txtApellidoC.setText((String) modelo.getValueAt(jTableClientes.getSelectedRow(), 2));
        txtTelefono.setText((String) modelo.getValueAt(jTableClientes.getSelectedRow(), 3));
        txtCedula.setText((String) modelo.getValueAt(jTableClientes.getSelectedRow(), 4));
        txtDireccion.setText((String) modelo.getValueAt(jTableClientes.getSelectedRow(), 5));
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jCheckBoxLiquidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLiquidadoActionPerformed

    }//GEN-LAST:event_jCheckBoxLiquidadoActionPerformed

    /**
     * @param args the command line arguments
     */
    
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Menu menu = new Menu();
            menu.setVisible(true);
        }  
    });
}

                            /////////////////////////////////////////////////////////////////////////////////////// TABLAS //////////////////////////////////////////////////////////////////////////////////////
  
  
    ArrayList<Usuario> listaPersonas = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    
               
public void setModelo() {
    String[] cabecera = {"Nro.", "Nombres", "Contraseñas"};
    modelo.setColumnIdentifiers(cabecera);

    UsuarioControlador usuarioControlador = new UsuarioControlador();
    ArrayList<Object[]> datos = usuarioControlador.datosUsuarios();

    if (datos != null) {
        for (Object[] fila : datos) {
            modelo.addRow(fila);
        }
    }

    jTableUsuario.setModel(modelo);
}

   
public void setDatos(Usuario usuario) {
    DefaultTableModel modelo = (DefaultTableModel) jTableUsuario.getModel();
    Object[] fila = new Object[3];

    fila[0] = modelo.getRowCount() + 1;
    fila[1] = usuario.getNombre();
    fila[2] = usuario.getContrasenia();

    modelo.addRow(fila);
    jTableUsuario.setModel(modelo); 


    txtNombreU.setText("");
    txtcontra.setText("");
}


 
 
 
 public void mostrarDatosClientes (Cliente cliente) {
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();      
        Object[] fila = new Object[6];
        
        fila[0] = modelo.getRowCount() + 1;
        fila[1] = cliente.getNombreCli();
        fila[2] = cliente.getApellido();
        fila[3] = cliente.getTelefono();
        fila[4] = cliente.getCedula();
        fila[5] = cliente.getDireccion();
        modelo.addRow(fila);
    }
      
 public void mostrarDatosContrato(Contrato contrato) {
     DefaultTableModel modelo = (DefaultTableModel) jTableContrato.getModel();
     Object[] fila = new Object[7];
     
     Date fechaContrato = FeachaContrato.getDate();
     contrato.setFecha(fechaContrato);
    
     fila[0] = modelo.getRowCount() + 1;
     fila[1] = contrato.getFechaFormateada();
     fila[2] = contrato.getVehiculo();
     fila[3] = contrato.getAsientos();
     fila[4] = contrato.getNombreConductor();
     fila[5] = contrato.getDestino();
     fila[6] = contrato.getDias();
     modelo.addRow(fila);
     
}
 
 public void mostrarDatosAbono(Abono abono) {
    DefaultTableModel modelo = (DefaultTableModel) jTableAbono.getModel();
    Object[] fila = new Object[8];  

    Date fechaAbono = FeachaAbono.getDate();
    abono.setFecha(fechaAbono);

    fila[0] = modelo.getRowCount() + 1;
    fila[1] = abono.getFechaFormateada();
    fila[2] = abono.getValor();
    fila[3] = abono.getMonto();
    fila[4] = abono.getBanco();
    fila[5] = abono.getBancosComp();
    fila[6] = abono.isLiquidado(); 
    fila[7] = abono.isSinLiquidar();  
    modelo.addRow(fila);
    
}
 public void mostrarDatosAbono(Mantenimiento mantenimiento) {
     DefaultTableModel modelo = (DefaultTableModel) jTableMantenimiento.getModel();
    Object[] fila = new Object[4];  
    
     Date fechaAbono = FeachaAbono.getDate();
     mantenimiento.setFecha(fechaAbono);
     fila[0] = modelo.getRowCount() + 1;
     fila[1] = mantenimiento.getFechaFormateada();
     fila[2] = mantenimiento.getKilometraje();
     fila[3] = mantenimiento.getCambiosDeAceite();
     fila[4] = mantenimiento.getCambiosDeFiltro();
    modelo.addRow(fila);
    
 }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FeachaAbono;
    private com.toedter.calendar.JDateChooser FeachaContrato;
    private com.toedter.calendar.JDateChooser FeachaMantenimiento;
    private javax.swing.JButton btnAbono;
    private javax.swing.JButton btnBuscarU;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnContrato;
    private javax.swing.JButton btnEditarCli;
    private javax.swing.JButton btnEditarM;
    private javax.swing.JButton btnEditarU;
    private javax.swing.JButton btnEditarU3;
    private javax.swing.JButton btnEditarU4;
    private javax.swing.JButton btnEliminarCli;
    private javax.swing.JButton btnEliminarM;
    private javax.swing.JButton btnEliminarU;
    private javax.swing.JButton btnEliminarU3;
    private javax.swing.JButton btnEliminarU4;
    private javax.swing.JButton btnGuardarCli;
    private javax.swing.JButton btnGuardarM;
    private javax.swing.JButton btnGuardarU3;
    private javax.swing.JButton btnGuardarU4;
    private javax.swing.JButton btnMantenimientos;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoM;
    private javax.swing.JButton btnNuevoU;
    private javax.swing.JButton btnNuevoU3;
    private javax.swing.JButton btnNuevoU4;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JCheckBox jCheckBoxContra;
    private javax.swing.JCheckBox jCheckBoxLiquidado;
    private javax.swing.JCheckBox jCheckBoxSinLiquidar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JInternalFrame jInternalFrame6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAbono;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableContrato;
    private javax.swing.JTable jTableMantenimiento;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextField txtApellidoC;
    private javax.swing.JTextArea txtAreaAceite;
    private javax.swing.JTextField txtAsientos;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtComprobante;
    private javax.swing.JTextField txtConductor;
    private javax.swing.JTextField txtConductor1;
    private javax.swing.JTextField txtCorreo3;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreU;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtVehiculo;
    private javax.swing.JPasswordField txtcontra;
    // End of variables declaration//GEN-END:variables

                            /////////////////////////////////////////////////////////////////////////////////////// METODOS DE TABLAS //////////////////////////////////////////////////////////////////////////////////////
    
    private void limpiarTabla() {
        int a = modelo.getRowCount() - 1;  
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

     public void cargarUsuarios() {
        UsuarioControlador usuarioControlador = new UsuarioControlador();
        ArrayList<Object[]> datos = usuarioControlador.datosUsuarios();
        if (datos != null) {
            for (Object[] fila : datos) {
                modelo.addRow(fila);
            }
        }
    }
    

}

