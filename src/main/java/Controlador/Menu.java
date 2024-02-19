package Controlador;

import Modelo.Abono;
import Modelo.Cliente;
import Modelo.Contrato;
import Modelo.Mantenimiento;
import Modelo.Usuario;
import Modelo.Vehiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import Controlador.VehiculoControlador;
import Modelo.HistorialM;
import Modelo.Pdfs;
import java.awt.Desktop;
import java.io.File;






/**
 *
 * @author Leo
 */

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        setModelo();
        setModeloCli();
        setModeloVehiculos();
        mostrarListaPlacas();
        setModeloMantenimientos();
        setModeloContratos();
        setModeloAbonos();
        mostrarListaPlacasVehiculo();
        mostrarListaClientesCedula();
        setModeloHistorialMantenimientos();
        
    }    
    private static final int MAX_LENGTH = 50;
        private static final int MAX_PLACA_LENGTH = 12;

    
        public void mostrarListaPlacas() {

            VehiculoControlador controlador = new VehiculoControlador();
            java.util.List<String> listaPlacas = controlador.obtenerListaPlacasVehiculos();
            comboBoxPlacas.removeAllItems();
            for (String placa : listaPlacas) {
                comboBoxPlacas.addItem(placa);

                comboBoxPlacas.setEditable(true);

        JComboBox<String> combo = (JComboBox<String>) comboBoxPlacas;
        JTextField editor = (JTextField) combo.getEditor().getEditorComponent();
            }
        }


        public void mostrarListaPlacasVehiculo() {
            VehiculoControlador controlador = new VehiculoControlador();
            java.util.List<String> listaPlacas = controlador.obtenerListaPlacasVehiculos();
            cbbPlacas.removeAllItems();
            for (String placa : listaPlacas) {
                cbbPlacas.addItem(placa);

                cbbPlacas.setEditable(true);

        JComboBox<String> combo = (JComboBox<String>) cbbPlacas;
        JTextField editor = (JTextField) combo.getEditor().getEditorComponent();
            }
        }
    
    
    public void mostrarListaClientesCedula() {
        ContratoControlador controladorr = new ContratoControlador();
        java.util.List<String> listaClinetes = controladorr.obtenerListaClientesCedula();
        cbbCliente.removeAllItems();
        for (String listaClinete : listaClinetes) {
            cbbCliente.addItem(listaClinete);
            
            cbbCliente.setEditable(true);
    
    JComboBox<String> combo = (JComboBox<String>) cbbCliente;
    JTextField editor = (JTextField) combo.getEditor().getEditorComponent();
        }
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableContrato = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        FeachaContrato = new com.toedter.calendar.JDateChooser();
        txtAsientos = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDestino = new javax.swing.JTextArea();
        btnBuscarContrato = new javax.swing.JButton();
        btnEditarContrato = new javax.swing.JButton();
        btnEliminarContrato = new javax.swing.JButton();
        btnNuevoContrato = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        cbbCliente = new javax.swing.JComboBox<>();
        cbbPlacas = new javax.swing.JComboBox<>();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        txtDias = new javax.swing.JTextField();
        jPanel60 = new javax.swing.JPanel();
        txtConductor1 = new javax.swing.JTextField();
        PDF3 = new javax.swing.JLabel();
        btnPDFContrato = new javax.swing.JButton();
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
        btnBuscarClientes = new javax.swing.JButton();
        btnEditarCli = new javax.swing.JButton();
        btnEliminarCli = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        PDF1 = new javax.swing.JLabel();
        btnPDFClientes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableAbono = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        FeachaAbono = new com.toedter.calendar.JDateChooser();
        txtBanco = new javax.swing.JTextField();
        btnBuscarAbono = new javax.swing.JButton();
        btnEditarAbono = new javax.swing.JButton();
        btnEliminarAbono = new javax.swing.JButton();
        btnNuevoAbono = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtComprobante = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jcheckboxLiquidado = new javax.swing.JCheckBox();
        jCheckBoxSinLiquidar = new javax.swing.JCheckBox();
        jPanel58 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblConductor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblCedulas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMantenimiento = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtKilometrajeM = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        FeachaMantenimiento = new com.toedter.calendar.JDateChooser();
        btnBuscarM = new javax.swing.JButton();
        btnEditarM = new javax.swing.JButton();
        btnEliminarM = new javax.swing.JButton();
        btnNuevoM = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        PDF = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCambioFiltro = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaAceite = new javax.swing.JTextArea();
        comboBoxPlacas = new javax.swing.JComboBox<>();
        jLabel82 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnPDFMantenimiento = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jPanel13 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        txtcontra = new javax.swing.JPasswordField();
        jCheckBoxContra = new javax.swing.JCheckBox();
        btnBuscarU = new javax.swing.JButton();
        btnEditarU = new javax.swing.JButton();
        btnEliminarU = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnNuevoU = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtNombreU = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jInternalFrame6 = new javax.swing.JInternalFrame();
        jPanel20 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txtNombreProp = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        txtNumPlaca = new javax.swing.JTextField();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        FeachaFabricacion = new com.toedter.calendar.JDateChooser();
        txtNumAsientos = new javax.swing.JTextField();
        btnBuscarVehiculo = new javax.swing.JButton();
        btnEditarVehiculo = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        btnNuevoVehiculo = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        txtKilometrajeTotal = new javax.swing.JTextField();
        jPanel55 = new javax.swing.JPanel();
        PDF2 = new javax.swing.JLabel();
        btnPDFVehiculo = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableVehiculo = new javax.swing.JTable();
        jInternalFrame7 = new javax.swing.JInternalFrame();
        jPanel23 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        btnContratoH = new javax.swing.JButton();
        btnAbonoH = new javax.swing.JButton();
        btnMantenimientosH = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableHistorialM = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnContrato = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnAbono = new javax.swing.JButton();
        btnMantenimientos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        tipo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnVehiculos = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jInternalFrame1.setVisible(true);

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
        jTableContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContratoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableContrato);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 255));
        jLabel52.setText("Fecha");
        jPanel16.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 255));
        jLabel53.setText("Placa Vehiculo");
        jPanel16.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 255));
        jLabel54.setText("Asientos");
        jPanel16.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

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
                .addGap(89, 89, 89)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel56)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        FeachaContrato.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.add(FeachaContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 210, 30));

        txtAsientos.setBackground(new java.awt.Color(204, 204, 204));
        txtAsientos.setBorder(null);
        txtAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsientosActionPerformed(evt);
            }
        });
        jPanel16.add(txtAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, 20));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 255));
        jLabel57.setText("Destino");
        jPanel16.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        txtDestino.setBackground(new java.awt.Color(204, 204, 204));
        txtDestino.setColumns(20);
        txtDestino.setRows(5);
        txtDestino.setBorder(null);
        jScrollPane4.setViewportView(txtDestino);

        jPanel16.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 230, 60));

        btnBuscarContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarContratoActionPerformed(evt);
            }
        });
        jPanel16.add(btnBuscarContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarContratoActionPerformed(evt);
            }
        });
        jPanel16.add(btnEditarContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarContratoActionPerformed(evt);
            }
        });
        jPanel16.add(btnEliminarContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevoContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoContratoActionPerformed(evt);
            }
        });
        jPanel16.add(btnNuevoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Buscar");
        jPanel16.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 70, -1));

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Editar");
        jPanel16.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Nuevo");
        jPanel16.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 60, -1));

        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Eliminar");
        jPanel16.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 255));
        jLabel60.setText("Conductor");
        jPanel16.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jPanel41.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 492, 50, 0));

        jPanel56.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 312, 220, 0));

        cbbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbClienteActionPerformed(evt);
            }
        });
        jPanel16.add(cbbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 30));

        jPanel16.add(cbbPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 222, 220, 30));

        jLabel83.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 0, 255));
        jLabel83.setText("Cliente");
        jPanel16.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel84.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 255));
        jLabel84.setText("Dias");
        jPanel16.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

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

        jPanel16.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 226, -1));

        jPanel39.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, -1));

        txtDias.setBackground(new java.awt.Color(204, 204, 204));
        txtDias.setBorder(null);
        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });
        jPanel16.add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 70, 20));

        jPanel60.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        txtConductor1.setBackground(new java.awt.Color(204, 204, 204));
        txtConductor1.setBorder(null);
        txtConductor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConductor1ActionPerformed(evt);
            }
        });
        jPanel16.add(txtConductor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 226, 30));

        PDF3.setForeground(new java.awt.Color(0, 0, 0));
        PDF3.setText("PDF : ");
        jPanel16.add(PDF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 60, -1));

        btnPDFContrato.setBackground(new java.awt.Color(187, 187, 187));
        btnPDFContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\PDF.png")); // NOI18N
        btnPDFContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFContratoActionPerformed(evt);
            }
        });
        jPanel16.add(btnPDFContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 40, 40));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
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
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
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

        btnBuscarClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });
        jPanel15.add(btnBuscarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 40, 35));

        btnEditarCli.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCliActionPerformed(evt);
            }
        });
        jPanel15.add(btnEditarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 40, 40));

        btnEliminarCli.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });
        jPanel15.add(btnEliminarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 40, 35));

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        jPanel15.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 40, 35));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Buscar");
        jPanel15.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 70, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Editar");
        jPanel15.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 40, -1));

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Nuevo");
        jPanel15.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 60, -1));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Eliminar");
        jPanel15.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 60, -1));

        PDF1.setForeground(new java.awt.Color(0, 0, 0));
        PDF1.setText("PDF : ");
        jPanel15.add(PDF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 60, -1));

        btnPDFClientes.setBackground(new java.awt.Color(187, 187, 187));
        btnPDFClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\PDF.png")); // NOI18N
        btnPDFClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFClientesActionPerformed(evt);
            }
        });
        jPanel15.add(btnPDFClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 40, 40));

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );

        jTabbedPane1.addTab("2", jInternalFrame2);

        jInternalFrame3.setVisible(true);

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
        jTableAbono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAbonoMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTableAbono);

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 255));
        jLabel61.setText("Fecha");
        jPanel19.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 255));
        jLabel62.setText("Valor");
        jPanel19.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtValor.setBackground(new java.awt.Color(204, 204, 204));
        txtValor.setBorder(null);
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        jPanel19.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 20));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 255));
        jLabel63.setText("Monto");
        jPanel19.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        txtMonto.setBackground(new java.awt.Color(204, 204, 204));
        txtMonto.setBorder(null);
        jPanel19.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 90, 20));

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

        jPanel19.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 226, 2));

        jPanel44.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 70, 2));

        jPanel45.setBackground(new java.awt.Color(0, 110, 255));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("ABONOS");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel65)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        FeachaAbono.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.add(FeachaAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 30));

        txtBanco.setBackground(new java.awt.Color(204, 204, 204));
        txtBanco.setBorder(null);
        txtBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBancoActionPerformed(evt);
            }
        });
        jPanel19.add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 226, 20));

        btnBuscarAbono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAbonoActionPerformed(evt);
            }
        });
        jPanel19.add(btnBuscarAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarAbono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAbonoActionPerformed(evt);
            }
        });
        jPanel19.add(btnEditarAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarAbono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAbonoActionPerformed(evt);
            }
        });
        jPanel19.add(btnEliminarAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevoAbono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAbonoActionPerformed(evt);
            }
        });
        jPanel19.add(btnNuevoAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("Buscar");
        jPanel19.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 40, -1));

        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("Editar");
        jPanel19.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 40, -1));

        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("Nuevo");
        jPanel19.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 40, -1));

        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Eliminar");
        jPanel19.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        jLabel71.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 255));
        jLabel71.setText("Banco");
        jPanel19.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 255));
        jLabel72.setText("Comprobante");
        jPanel19.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        txtComprobante.setBackground(new java.awt.Color(204, 204, 204));
        txtComprobante.setBorder(null);
        txtComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComprobanteActionPerformed(evt);
            }
        });
        jPanel19.add(txtComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 226, 20));

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

        jPanel19.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 226, 2));

        jLabel73.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 255));
        jLabel73.setText("Estado");
        jPanel19.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jcheckboxLiquidado.setForeground(new java.awt.Color(0, 0, 0));
        jcheckboxLiquidado.setText("Liquidado");
        jcheckboxLiquidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckboxLiquidadoActionPerformed(evt);
            }
        });
        jPanel19.add(jcheckboxLiquidado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jCheckBoxSinLiquidar.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxSinLiquidar.setText("Sin Liquidar");
        jPanel19.add(jCheckBoxSinLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        jPanel58.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));

        jLabel12.setText("Conductor:");

        jLabel2.setText("Cedula del Cliente:");

        jLabel3.setText("Destino:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCedula)
                    .addComponent(lblCedulas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 100));

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("3", jInternalFrame3);

        jInternalFrame5.setVisible(true);

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
        jTableMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMantenimientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMantenimiento);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 255));
        jLabel40.setText("Fecha");
        jPanel14.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 255));
        jLabel41.setText("Placa del Vehiculo");
        jPanel14.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtKilometrajeM.setBackground(new java.awt.Color(204, 204, 204));
        txtKilometrajeM.setBorder(null);
        txtKilometrajeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKilometrajeMActionPerformed(evt);
            }
        });
        jPanel14.add(txtKilometrajeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 226, 30));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 255));
        jLabel42.setText("Cambios de aceite");
        jPanel14.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 255));
        jLabel43.setText("Cambios de filtro:");
        jPanel14.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

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

        jPanel14.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 226, 2));

        FeachaMantenimiento.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.add(FeachaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 30));

        btnBuscarM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMActionPerformed(evt);
            }
        });
        jPanel14.add(btnBuscarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMActionPerformed(evt);
            }
        });
        jPanel14.add(btnEditarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMActionPerformed(evt);
            }
        });
        jPanel14.add(btnEliminarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevoM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoMActionPerformed(evt);
            }
        });
        jPanel14.add(btnNuevoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Buscar");
        jPanel14.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 70, -1));

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Editar");
        jPanel14.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        PDF.setForeground(new java.awt.Color(0, 0, 0));
        PDF.setText("PDF : ");
        jPanel14.add(PDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 60, -1));

        txtCambioFiltro.setBackground(new java.awt.Color(187, 187, 187));
        txtCambioFiltro.setColumns(20);
        txtCambioFiltro.setRows(5);
        txtCambioFiltro.setBorder(null);
        jScrollPane6.setViewportView(txtCambioFiltro);

        jPanel14.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 432, 230, 70));

        jScrollPane7.setBackground(new java.awt.Color(187, 187, 187));

        txtAreaAceite.setBackground(new java.awt.Color(187, 187, 187));
        txtAreaAceite.setColumns(20);
        txtAreaAceite.setRows(5);
        txtAreaAceite.setBorder(null);
        jScrollPane7.setViewportView(txtAreaAceite);

        jPanel14.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 70));

        comboBoxPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPlacasActionPerformed(evt);
            }
        });
        jPanel14.add(comboBoxPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 30));

        jLabel82.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 0, 255));
        jLabel82.setText("Kilometraje");
        jPanel14.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Agregar");
        jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Editar");
        jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        btnPDFMantenimiento.setBackground(new java.awt.Color(187, 187, 187));
        btnPDFMantenimiento.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\PDF.png")); // NOI18N
        btnPDFMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFMantenimientoActionPerformed(evt);
            }
        });
        jPanel14.add(btnPDFMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 40, 40));

        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Eliminar");
        jPanel14.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel39)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 60));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 255));
        jLabel45.setText("Nombre");
        jPanel13.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jPanel27.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 226, -1));

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

        btnBuscarU.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUActionPerformed(evt);
            }
        });
        jPanel13.add(btnBuscarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarU.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUActionPerformed(evt);
            }
        });
        jPanel13.add(btnEditarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarU.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUActionPerformed(evt);
            }
        });
        jPanel13.add(btnEliminarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Buscar");
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Editar");
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Eliminar");
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        btnNuevoU.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUActionPerformed(evt);
            }
        });
        jPanel13.add(btnNuevoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Agregar");
        jPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        jPanel21.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 226, 2));

        txtNombreU.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreU.setBorder(null);
        txtNombreU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUActionPerformed(evt);
            }
        });
        jPanel13.add(txtNombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 226, 30));

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("5", jInternalFrame4);

        jInternalFrame6.setVisible(true);

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 255));
        jLabel64.setText("Fecha de Fabricacion");
        jPanel20.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 255));
        jLabel66.setText("Nombre  de Propietario");
        jPanel20.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 163, -1, -1));

        txtNombreProp.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreProp.setBorder(null);
        txtNombreProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePropActionPerformed(evt);
            }
        });
        jPanel20.add(txtNombreProp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 226, 30));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 255));
        jLabel74.setText("Numero de Placa");
        jPanel20.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 219, -1, -1));

        txtNumPlaca.setBackground(new java.awt.Color(204, 204, 204));
        txtNumPlaca.setBorder(null);
        jPanel20.add(txtNumPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 243, 226, 30));

        jPanel48.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 226, 2));

        jPanel49.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 212, 226, 2));

        jPanel51.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 273, 226, 2));

        jPanel52.setBackground(new java.awt.Color(0, 110, 255));

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Vehiculo");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel75)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        jPanel53.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 212, 226, 2));

        jPanel54.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 156, 226, 2));

        FeachaFabricacion.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.add(FeachaFabricacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 30));

        txtNumAsientos.setBackground(new java.awt.Color(204, 204, 204));
        txtNumAsientos.setBorder(null);
        txtNumAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumAsientosActionPerformed(evt);
            }
        });
        jPanel20.add(txtNumAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 226, 30));

        btnBuscarVehiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiculoActionPerformed(evt);
            }
        });
        jPanel20.add(btnBuscarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarVehiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVehiculoActionPerformed(evt);
            }
        });
        jPanel20.add(btnEditarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarVehiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVehiculoActionPerformed(evt);
            }
        });
        jPanel20.add(btnEliminarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevoVehiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoVehiculoActionPerformed(evt);
            }
        });
        jPanel20.add(btnNuevoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setText("Buscar");
        jPanel20.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, -1));

        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Editar");
        jPanel20.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setText("Agregar");
        jPanel20.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Eliminar");
        jPanel20.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        jLabel80.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 0, 255));
        jLabel80.setText("Numero de Asientos");
        jPanel20.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 255));
        jLabel81.setText("Kilometraje");
        jPanel20.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        txtKilometrajeTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtKilometrajeTotal.setBorder(null);
        jPanel20.add(txtKilometrajeTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 226, 30));

        jPanel55.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 226, 2));

        PDF2.setForeground(new java.awt.Color(0, 0, 0));
        PDF2.setText("PDF : ");
        jPanel20.add(PDF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 60, -1));

        btnPDFVehiculo.setBackground(new java.awt.Color(187, 187, 187));
        btnPDFVehiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\PDF.png")); // NOI18N
        btnPDFVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFVehiculoActionPerformed(evt);
            }
        });
        jPanel20.add(btnPDFVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 40, 40));

        jTableVehiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVehiculoMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTableVehiculo);

        javax.swing.GroupLayout jInternalFrame6Layout = new javax.swing.GroupLayout(jInternalFrame6.getContentPane());
        jInternalFrame6.getContentPane().setLayout(jInternalFrame6Layout);
        jInternalFrame6Layout.setHorizontalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame6Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
        );
        jInternalFrame6Layout.setVerticalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame6Layout.createSequentialGroup()
                .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addContainerGap())
        );

        jTabbedPane1.addTab("6", jInternalFrame6);

        jInternalFrame7.setVisible(true);

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));

        jPanel59.setBackground(new java.awt.Color(0, 110, 255));

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Historial");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel85)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnContratoH.setBackground(new java.awt.Color(153, 153, 153));
        btnContratoH.setForeground(new java.awt.Color(255, 255, 255));
        btnContratoH.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\contract_icon_194172.png")); // NOI18N
        btnContratoH.setText("Contrato");
        btnContratoH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContratoH.setFocusable(false);
        btnContratoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoHActionPerformed(evt);
            }
        });

        btnAbonoH.setBackground(new java.awt.Color(153, 153, 153));
        btnAbonoH.setForeground(new java.awt.Color(255, 255, 255));
        btnAbonoH.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Carrito-de-compras.png")); // NOI18N
        btnAbonoH.setText("Abono");
        btnAbonoH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbonoH.setFocusable(false);
        btnAbonoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonoHActionPerformed(evt);
            }
        });

        btnMantenimientosH.setBackground(new java.awt.Color(153, 153, 153));
        btnMantenimientosH.setForeground(new java.awt.Color(255, 255, 255));
        btnMantenimientosH.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Mantenimiento.png")); // NOI18N
        btnMantenimientosH.setText("Mantenimiento");
        btnMantenimientosH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMantenimientosH.setFocusable(false);
        btnMantenimientosH.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnMantenimientosH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMantenimientosHMouseClicked(evt);
            }
        });
        btnMantenimientosH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientosHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnContratoH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbonoH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMantenimientosH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnContratoH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(btnAbonoH)
                .addGap(123, 123, 123)
                .addComponent(btnMantenimientosH)
                .addGap(98, 98, 98))
        );

        jTableHistorialM.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(jTableHistorialM);

        javax.swing.GroupLayout jInternalFrame7Layout = new javax.swing.GroupLayout(jInternalFrame7.getContentPane());
        jInternalFrame7.getContentPane().setLayout(jInternalFrame7Layout);
        jInternalFrame7Layout.setHorizontalGroup(
            jInternalFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame7Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame7Layout.setVerticalGroup(
            jInternalFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane10)
        );

        jTabbedPane1.addTab("7", jInternalFrame7);

        jDesktopPane1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 670));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1110, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 110, 255));

        btnContrato.setBackground(new java.awt.Color(153, 153, 153));
        btnContrato.setForeground(new java.awt.Color(255, 255, 255));
        btnContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\contract_icon_194172.png")); // NOI18N
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
        btnClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Clientes.png")); // NOI18N
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
        btnAbono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Carrito-de-compras.png")); // NOI18N
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
        btnMantenimientos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Mantenimiento.png")); // NOI18N
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
        btnUsuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Usuario.png")); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.setFocusable(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        tipo.setForeground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Logo.png")); // NOI18N

        btnVehiculos.setBackground(new java.awt.Color(153, 153, 153));
        btnVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        btnVehiculos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\bus.png")); // NOI18N
        btnVehiculos.setText("Vehiculos");
        btnVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVehiculos.setFocusable(false);
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });

        btnHistorial.setBackground(new java.awt.Color(153, 153, 153));
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Historial.png")); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHistorial.setFocusable(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMantenimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(tipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVehiculos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(38, 38, 38)
                .addComponent(btnVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 770));

        jPanel2.setBackground(new java.awt.Color(0, 110, 255));

        jLabel38.setFont(new java.awt.Font("Yu Gothic Light", 3, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Sistema de parque Automotor ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(289, 289, 289))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1110, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoActionPerformed
        limpiarTablaContrato();
        modeloContrato();
        jTabbedPane1.setSelectedIndex(0);
        limpiarTablaContrato();
        modeloContrato();

    }//GEN-LAST:event_btnContratoActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        limpiarTablaContrato();
        modeloClientes();
        jTabbedPane1.setSelectedIndex(1);       
       limpiarTablaContrato();
       modeloClientes();

    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonoActionPerformed

//        jTabbedPane1.setSelectedIndex(2);
   //TODO add your handling code here:
        int filaSeleccionada = jTableContrato.getSelectedRow();
    if (filaSeleccionada != -1) {
        // Obtener los datos del contrato seleccionado
        int idContrato = (int) jTableContrato.getValueAt(filaSeleccionada, 0);  
        String conductor = (String) jTableContrato.getValueAt(filaSeleccionada, 5); 
        String cedula = (String) jTableContrato.getValueAt(filaSeleccionada, 2);
        String destino = (String) jTableContrato.getValueAt(filaSeleccionada, 3);

        lblConductor.setText(conductor);
        lblCedulas.setText(cedula);
        lblDestino.setText(destino);
        
        AbonoControlador  ControladorAbono  = new AbonoControlador();
        
        String destinos = ControladorAbono.obtenerDestinoPorContrato(idContrato);
        
        jTabbedPane1.setSelectedIndex(2);

    } else {
        JOptionPane.showMessageDialog(this, "Debes seleccionar un contrato.", "Error", JOptionPane.ERROR_MESSAGE);
    }     
    }//GEN-LAST:event_btnAbonoActionPerformed

    private void btnMantenimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientosMouseClicked

    }//GEN-LAST:event_btnMantenimientosMouseClicked

    private void btnMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientosActionPerformed
       
        limpiarTablaMantenimiento();
        modeloMantenimiento();
        jTabbedPane1.setSelectedIndex(3);
        limpiarTablaMantenimiento();
        modeloMantenimiento();

    }//GEN-LAST:event_btnMantenimientosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
       
        limpiarTablaUsuario();
        modeloUsuario();
        jTabbedPane1.setSelectedIndex(4);
        limpiarTablaUsuario();
        modeloUsuario();
        
    }//GEN-LAST:event_btnUsuariosActionPerformed

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

        String nuevoNombre = txtNombreU.getText();
        String nuevaContrasenia = txtcontra.getText();

        if (nuevoNombre.isEmpty() || nuevaContrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nuevo nombre y contraseña");
        } else {
            UsuarioControlador usuarioControlador = new UsuarioControlador();
            usuarioControlador.editarUsuario(nombreAntiguo, contraseniaAntigua, nuevoNombre, nuevaContrasenia);

            modelo.setValueAt(nuevoNombre, filaSeleccionada, 1);
            modelo.setValueAt(nuevaContrasenia, filaSeleccionada, 2);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila para editar");
    }
    }//GEN-LAST:event_btnEditarUActionPerformed

    private void btnBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUActionPerformed
  String nombreBuscado = txtNombreU.getText();

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

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed
      String CedulaBuscada = txtCedula.getText();

    if (!CedulaBuscada.isEmpty()) {
        ClienteControlador clienteControlador = new ClienteControlador();
        ArrayList<Object[]> resultados = clienteControlador.buscarClientePorCedula(CedulaBuscada);

        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        modelo.setRowCount(0);

        if (resultados != null) {
            for (Object[] fila : resultados) {
                modelo.addRow(fila);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al buscar el Cliente por su Cedula");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese la Cedula para buscar");
    }  
    
    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void btnEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCliActionPerformed
  int filaSeleccionada = jTableClientes.getSelectedRow();

    if (filaSeleccionada >= 0) {
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        String cedulaAntigua = modelo.getValueAt(filaSeleccionada, 4).toString();
        String nombreAntiguo = modelo.getValueAt(filaSeleccionada, 1).toString();
        String apellidoAntiguo = modelo.getValueAt(filaSeleccionada, 2).toString();
        String telefonoAntiguo = modelo.getValueAt(filaSeleccionada, 3).toString();
        String direccionAntigua = modelo.getValueAt(filaSeleccionada, 5).toString();

        String nuevoNombre = txtNombreC.getText(); 
        String nuevoApellido = txtApellidoC.getText(); 
        String nuevoTelefono = txtTelefono.getText(); 
        String nuevaCedula = txtCedula.getText(); 
        String nuevaDireccion = txtDireccion.getText();

        if (nuevoNombre.isEmpty() || nuevoApellido.isEmpty() || nuevoTelefono.isEmpty() || nuevaCedula.isEmpty() || nuevaDireccion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese nuevos valores para todos los campos");
        } else {
            ClienteControlador clienteControlador = new ClienteControlador();
            clienteControlador.editarCliente(cedulaAntigua, nuevoNombre, nuevoApellido, nuevoTelefono, nuevaCedula, nuevaDireccion);

            // Actualizar la tabla de clientes
            modelo.setValueAt(nuevoNombre, filaSeleccionada, 1);
            modelo.setValueAt(nuevoApellido, filaSeleccionada, 2);
            modelo.setValueAt(nuevoTelefono, filaSeleccionada, 3);
            modelo.setValueAt(nuevaCedula, filaSeleccionada, 4);
            modelo.setValueAt(nuevaDireccion, filaSeleccionada, 5);

            // Actualizar el JComboBox de clientes
            mostrarListaClientesCedula();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila para editar");
    }
    }//GEN-LAST:event_btnEditarCliActionPerformed

    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed
                                   
  int filaSeleccionada = jTableClientes.getSelectedRow();

    if (filaSeleccionada >= 0) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este cliente?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
            String nombre = modelo.getValueAt(filaSeleccionada, 1).toString();
            String apellido = modelo.getValueAt(filaSeleccionada, 2).toString();
            String telefono = modelo.getValueAt(filaSeleccionada, 3).toString();
            String cedula = modelo.getValueAt(filaSeleccionada, 4).toString();
            String direccion = modelo.getValueAt(filaSeleccionada, 5).toString();
            
            ClienteControlador clienteControlador = new ClienteControlador();
            clienteControlador.eliminarCliente(nombre, apellido, telefono, cedula, direccion);
            
            modelo.removeRow(filaSeleccionada);

            // Actualizar el JComboBox de clientes
            mostrarListaClientesCedula();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
    }
    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
       
    String nombre = txtNombreC.getText();
    String apellido = txtApellidoC.getText();
    String telefono = txtTelefono.getText();
    String cedula = txtCedula.getText();
    String direccion = txtDireccion.getText();

    if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || cedula.isEmpty() || direccion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos");
    } else {
        if (nombre.length() > MAX_LENGTH || apellido.length() > MAX_LENGTH || telefono.length() > MAX_LENGTH || cedula.length() > MAX_LENGTH || direccion.length() > MAX_LENGTH) {
            JOptionPane.showMessageDialog(null, "Alguno de los campos es demasiado largo");
        } else {
            if (nombre.matches("^\\s*$") || apellido.matches("^\\s*$") || telefono.matches("^\\s*$") || cedula.matches("^\\s*$") || direccion.matches("^\\s*$")) {
                JOptionPane.showMessageDialog(null, "Alguno de los campos es inválido");
            } else {
                Cliente nuevoCliente = new Cliente(nombre, apellido, telefono, cedula, direccion);
                ClienteControlador clienteControlador = new ClienteControlador();
                    
                clienteControlador.insertarClientes(nuevoCliente);
                listaClientes.add(nuevoCliente);
                mostrarDatosClientes(nuevoCliente);
                mostrarListaClientesCedula();
            }
        }
    }
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
        
        limpiarTablaVehiculo();
        modeloVehiculo();
        jTabbedPane1.setSelectedIndex(5);
        limpiarTablaVehiculo();
        modeloVehiculo();
    }//GEN-LAST:event_btnVehiculosActionPerformed

    
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

    private void txtNombrePropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePropActionPerformed
    }//GEN-LAST:event_txtNombrePropActionPerformed

    private void txtNumAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumAsientosActionPerformed
    }//GEN-LAST:event_txtNumAsientosActionPerformed

    private void btnBuscarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoActionPerformed
   String PlacaBuscada = txtNumPlaca.getText();

    if (!PlacaBuscada.isEmpty()) {
        VehiculoControlador vehiculoControlador = new VehiculoControlador();
        ArrayList<Object[]> resultados = vehiculoControlador.buscarVehiculos(PlacaBuscada);

        DefaultTableModel modelo = (DefaultTableModel) jTableVehiculo.getModel();
        modelo.setRowCount(0);

        if (resultados != null) {
            for (Object[] fila : resultados) {
                modelo.addRow(fila);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al buscar el Vehiculo por su Placa");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese la placa  para buscar");
    }  
    
    }//GEN-LAST:event_btnBuscarVehiculoActionPerformed

    private void btnEditarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVehiculoActionPerformed
        String numPlacaAntiguo = (String) cbbPlacas.getSelectedItem();
        String numPlacaNuevo = txtNumPlaca.getText();
        String nombrePropietario = txtNombreProp.getText();
        String strNumAsientos = txtNumAsientos.getText();
        String strKilometraje = txtKilometrajeTotal.getText();
        Date fechaFabricacion = FeachaFabricacion.getDate();

        if (numPlacaNuevo.isEmpty() || nombrePropietario.isEmpty() || fechaFabricacion == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos obligatorios deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int numAsientos, kilometraje;
        try {
            numAsientos = Integer.parseInt(strNumAsientos);
            kilometraje = Integer.parseInt(strKilometraje);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los campos de número de asientos y kilometraje deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (numAsientos <= 0) {
            JOptionPane.showMessageDialog(this, "El número de asientos debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (kilometraje < 0) {
            JOptionPane.showMessageDialog(this, "El kilometraje debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Vehiculo vehiculo = new Vehiculo(numPlacaNuevo, nombrePropietario, numAsientos, kilometraje, fechaFabricacion);
        VehiculoControlador controlador = new VehiculoControlador();
        controlador.editarVehiculo(vehiculo, numPlacaAntiguo);
        limpiarCamposVehiculos();
        actualizarTablaVehiculos();
        mostrarListaPlacasVehiculo();
        mostrarListaPlacas();
    }//GEN-LAST:event_btnEditarVehiculoActionPerformed

    private void btnEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVehiculoActionPerformed
        int filaSeleccionada = jTableVehiculo.getSelectedRow();

        if (filaSeleccionada >= 0) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este vehículo?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                DefaultTableModel modelo = (DefaultTableModel) jTableVehiculo.getModel();
                String numPlaca = modelo.getValueAt(filaSeleccionada, 1).toString();

                VehiculoControlador vehiculoControlador = new VehiculoControlador();
                vehiculoControlador.eliminarVehiculo(numPlaca);

                modelo.removeRow(filaSeleccionada);
                 mostrarListaPlacasVehiculo();
                 mostrarListaPlacas();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
        }

    }//GEN-LAST:event_btnEliminarVehiculoActionPerformed

    private void btnNuevoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoVehiculoActionPerformed
          String numPlaca = txtNumPlaca.getText();
    String nombrePropietario = txtNombreProp.getText();
    String strNumAsientos = txtNumAsientos.getText();
    String strKilometraje = txtKilometrajeTotal.getText();
    Date fechaFabricacion = FeachaFabricacion.getDate();

    if (numPlaca.isEmpty() || nombrePropietario.isEmpty() || fechaFabricacion == null) {
        JOptionPane.showMessageDialog(this, "Todos los campos obligatorios deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    int numAsientos, kilometraje;
    try {
        numAsientos = Integer.parseInt(strNumAsientos);
        kilometraje = Integer.parseInt(strKilometraje);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Los campos de número de asientos y kilometraje deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (numAsientos <= 0 || kilometraje < 0) {
        JOptionPane.showMessageDialog(this, "El número de asientos debe ser mayor que cero y el kilometraje debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    Vehiculo vehiculo = new Vehiculo(numPlaca, nombrePropietario, numAsientos, kilometraje, fechaFabricacion);
    VehiculoControlador controlador = new VehiculoControlador();
    
    controlador.agregarVehiculo(vehiculo);
    limpiarCamposVehiculos();
    actualizarTablaVehiculos();
    mostrarListaPlacasVehiculo();
    mostrarListaPlacas();
    }//GEN-LAST:event_btnNuevoVehiculoActionPerformed
        
    private void jTableVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVehiculoMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jTableVehiculo.getModel();
        txtNumPlaca.setText((String) modelo.getValueAt(jTableVehiculo.getSelectedRow(), 1));
        txtNumAsientos.setText((String) modelo.getValueAt(jTableVehiculo.getSelectedRow(), 2).toString());
        txtKilometrajeTotal.setText(modelo.getValueAt(jTableVehiculo.getSelectedRow(), 3).toString());
        txtNombreProp.setText((String) modelo.getValueAt(jTableVehiculo.getSelectedRow(), 4));

        try {
            String fechaStr = (String) modelo.getValueAt(jTableVehiculo.getSelectedRow(), 5);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaFabricacion = sdf.parse(fechaStr);
            FeachaFabricacion.setDate(fechaFabricacion);
        } catch (ParseException ex) {
            System.out.println("Error al parsear la fecha: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTableVehiculoMouseClicked

    private void jTableMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMantenimientoMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jTableMantenimiento.getModel();
        comboBoxPlacas.setSelectedItem((String) modelo.getValueAt(jTableMantenimiento.getSelectedRow(), 1));
        txtAreaAceite.setText((String) modelo.getValueAt(jTableMantenimiento.getSelectedRow(), 2));
        txtCambioFiltro.setText((String) modelo.getValueAt(jTableMantenimiento.getSelectedRow(), 3));
        Date fecha = (Date) modelo.getValueAt(jTableMantenimiento.getSelectedRow(), 4);
        FeachaMantenimiento.setDate(fecha);
        txtKilometrajeM.setText(String.valueOf((int) modelo.getValueAt(jTableMantenimiento.getSelectedRow(), 5)));
    }//GEN-LAST:event_jTableMantenimientoMouseClicked

    private void btnNuevoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUActionPerformed
         String nombre = txtNombreU.getText();
    String contrasenia = txtcontra.getText();

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

    private void txtNombreUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        
        jTabbedPane1.setSelectedIndex(6);

    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnContratoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContratoHActionPerformed

    private void btnAbonoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonoHActionPerformed
    }//GEN-LAST:event_btnAbonoHActionPerformed

    private void btnMantenimientosHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientosHMouseClicked
    }//GEN-LAST:event_btnMantenimientosHMouseClicked

    private void btnMantenimientosHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientosHActionPerformed
    setModeloHistorialMantenimientos();
    }//GEN-LAST:event_btnMantenimientosHActionPerformed

    private void txtKilometrajeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKilometrajeMActionPerformed
    }//GEN-LAST:event_txtKilometrajeMActionPerformed

    private void btnBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMActionPerformed
 String placaBuscada = comboBoxPlacas.getSelectedItem().toString();

    if (!placaBuscada.isEmpty()) {
        MantenimientoControlador mantenimientoControlador = new MantenimientoControlador();
        ArrayList<Object[]> resultados = mantenimientoControlador.buscarMantenimientosPorPlaca(placaBuscada);

        DefaultTableModel modelo = (DefaultTableModel) jTableMantenimiento.getModel();
        modelo.setRowCount(0);

        if (resultados != null) {
            for (Object[] fila : resultados) {
                modelo.addRow(fila);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al buscar los mantenimientos por placa");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una placa para buscar los mantenimientos");
    }
    }//GEN-LAST:event_btnBuscarMActionPerformed

    private void btnEditarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMActionPerformed
   int filaSeleccionada = jTableMantenimiento.getSelectedRow();

if (filaSeleccionada >= 0) {
    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de editar este mantenimiento?", "Confirmar Edición", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        String cambiosAceite = txtAreaAceite.getText();
        String cambiosFiltro = txtCambioFiltro.getText();
        Date fecha = FeachaMantenimiento.getDate();

        if (cambiosAceite.isEmpty() || cambiosFiltro.isEmpty() || fecha == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos obligatorios deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int kilometrajeM = Integer.parseInt(txtKilometrajeM.getText());
            if (kilometrajeM < 0) {
                JOptionPane.showMessageDialog(this, "El kilometraje debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Obtener el ID del mantenimiento seleccionado en la tabla
            DefaultTableModel modelo = (DefaultTableModel) jTableMantenimiento.getModel();
            int idMantenimiento = (int) modelo.getValueAt(filaSeleccionada, 0);
            String placaVehiculo = comboBoxPlacas.getSelectedItem().toString();

            // Llamar al controlador para ejecutar el procedimiento almacenado
            MantenimientoControlador mantenimientoControlador = new MantenimientoControlador();

            // Crear un objeto Mantenimiento con los datos actualizados
            Mantenimiento mantenimiento = new Mantenimiento(placaVehiculo, idMantenimiento, cambiosAceite, cambiosFiltro, fecha, kilometrajeM);

            mantenimientoControlador.editarMantenimiento(mantenimiento);
            limpiarTablaMantenimiento();
            actualizarTablaMantenimientos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El campo de kilometraje debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
} else {
    JOptionPane.showMessageDialog(null, "Seleccione una fila para editar");
}

    }//GEN-LAST:event_btnEditarMActionPerformed

    private void btnEliminarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMActionPerformed
int filaSeleccionada = jTableMantenimiento.getSelectedRow();

    if (filaSeleccionada >= 0) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este mantenimiento?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) jTableMantenimiento.getModel();
            String placa = modelo.getValueAt(filaSeleccionada, 1).toString();
            Date fecha = (Date) modelo.getValueAt(filaSeleccionada, 4);

            MantenimientoControlador mantenimientoControlador = new MantenimientoControlador();
            mantenimientoControlador.eliminarMantenimiento(placa, fecha);

            modelo.removeRow(filaSeleccionada);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
    }
    }//GEN-LAST:event_btnEliminarMActionPerformed

    private void btnNuevoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoMActionPerformed
  String cambiosAceite = txtAreaAceite.getText();
    String cambiosFiltro = txtCambioFiltro.getText();
    Date fecha = FeachaMantenimiento.getDate();

    if (cambiosAceite.isEmpty() || cambiosFiltro.isEmpty() || fecha == null) {
        JOptionPane.showMessageDialog(this, "Todos los campos obligatorios deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int kilometrajeM = Integer.parseInt(txtKilometrajeM.getText());
        if (kilometrajeM < 0) {
            JOptionPane.showMessageDialog(this, "El kilometraje debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String placaVehiculo = comboBoxPlacas.getSelectedItem().toString();

        Mantenimiento mantenimiento = new Mantenimiento(placaVehiculo, 0, cambiosAceite, cambiosFiltro, fecha, kilometrajeM);
        VehiculoControlador vehiculoControlador = new VehiculoControlador();
        MantenimientoControlador mantenimientoControlador = new MantenimientoControlador();
        mantenimientoControlador.agregarMantenimiento(mantenimiento, vehiculoControlador);
        limpiarTablaMantenimiento();
        actualizarTablaMantenimientos();

        JOptionPane.showMessageDialog(this, "Mantenimiento agregado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "El campo de kilometraje debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnNuevoMActionPerformed

    private void comboBoxPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPlacasActionPerformed

    }//GEN-LAST:event_comboBoxPlacasActionPerformed

    private void jTableAbonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAbonoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAbonoMouseClicked

    private void btnPDFMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFMantenimientoActionPerformed

        String[] opciones = {"Crear PDF", "Abrir PDF"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada == 0) {

            String fileName = "reporte Mantenimientos.pdf";
            String titulo = "Reporte de Mantenimientos";
            Pdfs.generarPDF(jTableMantenimiento, fileName, titulo);
        } else if (opcionSeleccionada == 1) {
            try {
                String fileName = "reporte Mantenimientos.pdf";
                File file = new File(fileName);

                if (!Desktop.isDesktopSupported()) {
                    JOptionPane.showMessageDialog(null, "El sistema no soporta la apertura automática de archivos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Desktop desktop = Desktop.getDesktop();

                if (file.exists() && file.isFile()) {
                    desktop.open(file);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo PDF no existe o no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnPDFMantenimientoActionPerformed

    private void btnPDFClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFClientesActionPerformed

        String[] opciones = {"Crear PDF", "Abrir PDF"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada == 0) {

            String fileName = "reporte Clientes.pdf";
            String titulo = "Reporte de Clientes de Geaturim";
            Pdfs.generarPDF(jTableClientes, fileName, titulo);
        } else if (opcionSeleccionada == 1) {
            try {
                String fileName = "reporte Clientes.pdf";
                File file = new File(fileName);

                if (!Desktop.isDesktopSupported()) {
                    JOptionPane.showMessageDialog(null, "El sistema no soporta la apertura automática de archivos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Desktop desktop = Desktop.getDesktop();

                if (file.exists() && file.isFile()) {
                    desktop.open(file);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo PDF no existe o no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnPDFClientesActionPerformed

    private void btnPDFVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFVehiculoActionPerformed
        String[] opciones = {"Crear PDF", "Abrir PDF"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada == 0) {

            String fileName = "reporte Vehiculos.pdf";
            String titulo = "Reporte de Vehiculos de Geaturim";
            Pdfs.generarPDF(jTableVehiculo, fileName, titulo);
        } else if (opcionSeleccionada == 1) {
            try {
                String fileName = "reporte Vehiculos.pdf";
                File file = new File(fileName);

                if (!Desktop.isDesktopSupported()) {
                    JOptionPane.showMessageDialog(null, "El sistema no soporta la apertura automática de archivos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Desktop desktop = Desktop.getDesktop();

                if (file.exists() && file.isFile()) {
                    desktop.open(file);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo PDF no existe o no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnPDFVehiculoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBancoActionPerformed

    private void btnBuscarAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAbonoActionPerformed
        // TODO add your handling code here:
        // Obtener el ID del contrato seleccionado desde la tabla
        int filaSeleccionada = jTableContrato.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idContrato = (int) jTableContrato.getValueAt(filaSeleccionada, 0);

            AbonoControlador AbonoControlador = new AbonoControlador();
            ArrayList<Object[]> abonos = AbonoControlador.buscarAbonosPorContrato(idContrato);

            if (abonos != null) {
                limpiarTablaAbonos();

                for (Object[] abono : abonos) {
                    modeloAbonos.addRow(abono);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron abonos para este contrato.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un contrato.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarAbonoActionPerformed

    private void btnEditarAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAbonoActionPerformed
        // TODO add your handling code here:
        int filaSeleccionadaContrato = jTableContrato.getSelectedRow();
        int filaSeleccionadaAbono = jTableAbono.getSelectedRow();

        if (filaSeleccionadaContrato == -1 || filaSeleccionadaAbono == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un contrato y un abono para editar.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            AbonoControlador controladorAbono = new AbonoControlador();
            int idAbono = (int) jTableAbono.getValueAt(filaSeleccionadaAbono, 0);
            int idContrato = (int) jTableContrato.getValueAt(filaSeleccionadaContrato, 0);
            String destinos = controladorAbono.obtenerDestinoPorContrato(idContrato);

            double nuevoValor = Double.parseDouble(txtValor.getText());
            Date nuevaFecha = FeachaAbono.getDate();
            String nuevosBancosComp = txtComprobante.getText();
            double nuevoMonto = Double.parseDouble(txtMonto.getText());
            String nuevoEstado;
            if (jcheckboxLiquidado.isSelected()) {
                nuevoEstado = "Liquidado";
            } else if (jCheckBoxSinLiquidar.isSelected()) {
                nuevoEstado = "Sin Liquidar";
            } else {
                nuevoEstado = "";
            }
            String nuevoBanco = txtBanco.getText();

            controladorAbono.editarAbono(idAbono, destinos, nuevoValor, nuevaFecha, nuevosBancosComp, nuevoMonto, nuevoEstado, nuevoBanco);

            limpiarTablaAbonos();
            actualizarTablaAbonos();

            JOptionPane.showMessageDialog(this, "Abono editado con éxito");
        }
    }//GEN-LAST:event_btnEditarAbonoActionPerformed

    private void btnEliminarAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAbonoActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTableAbono.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idAbono = (int) jTableAbono.getValueAt(filaSeleccionada, 0);

            AbonoControlador AbonoControlador = new AbonoControlador();
            AbonoControlador.eliminarAbono(idAbono);

            limpiarTablaAbonos();
            actualizarTablaAbonos();
            JOptionPane.showMessageDialog(this, "Abono eliminado con éxito");
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un abono.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarAbonoActionPerformed

    private void btnNuevoAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAbonoActionPerformed

        int filaSeleccionada = jTableContrato.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idContrato = (int) jTableContrato.getValueAt(filaSeleccionada, 0);

            AbonoControlador controladorAbono = new AbonoControlador();
            String destinos = controladorAbono.obtenerDestinoPorContrato(idContrato);

            boolean liquidado = jcheckboxLiquidado.isSelected();
            boolean sinLiquidar = jCheckBoxSinLiquidar.isSelected();
            String estadoAbono;

            if (jcheckboxLiquidado.isSelected()) {
                estadoAbono = "Liquidado";
            } else if (jCheckBoxSinLiquidar.isSelected()) {
                estadoAbono = "Sin Liquidar";
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione el estado del abono.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String comprobante = txtComprobante.getText();
            String banco = txtBanco.getText();
            Date fechaAbono = FeachaAbono.getDate();
            double valor;
            double monto;

            try {
                valor = Double.parseDouble(txtValor.getText());
                monto = Double.parseDouble(txtMonto.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Los campos de valor y monto deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Abono abono = new Abono(destinos, valor, monto, fechaAbono, comprobante, estadoAbono, banco);
            controladorAbono.agregarAbono(abono);

            this.limpiarTablaAbonos();
            this.actualizarTablaAbonos();

            JOptionPane.showMessageDialog(this, "Abono creado con éxito");
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un contrato.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNuevoAbonoActionPerformed

    private void txtComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComprobanteActionPerformed

    private void jcheckboxLiquidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckboxLiquidadoActionPerformed

    }//GEN-LAST:event_jcheckboxLiquidadoActionPerformed

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked

        actualizarTablaAbonos();
    }//GEN-LAST:event_jPanel19MouseClicked

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActionPerformed

    private void cbbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbClienteActionPerformed

    private void btnNuevoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoContratoActionPerformed
  String placaVehiculo = cbbPlacas.getSelectedItem().toString();
    String cedulaCliente = cbbCliente.getSelectedItem().toString();
    String destinoContrato = txtDestino.getText();
    Date fechaContrato = FeachaContrato.getDate();
    String nomConductor = txtAsientos.getText();
    int diasContrato;
    int asientosContrato;

    try {
        diasContrato = Integer.parseInt(txtDias.getText());
        asientosContrato = Integer.parseInt(txtAsientos.getText());

        if (diasContrato < 0 || asientosContrato < 0) {
            JOptionPane.showMessageDialog(this, "Los campos de días y asientos deben ser números positivos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Los campos de días y asientos deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (placaVehiculo.isEmpty() || cedulaCliente.isEmpty() || destinoContrato.isEmpty() || fechaContrato == null || nomConductor.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos obligatorios deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Contrato contrato = new Contrato(placaVehiculo, cedulaCliente, destinoContrato, fechaContrato, nomConductor, diasContrato, asientosContrato);

    ContratoControlador controladorContrato = new ContratoControlador();
    controladorContrato.agregarContrato(contrato);

        limpiarTablaContrato();
        actualizarTablaContratos();

    JOptionPane.showMessageDialog(this, "Contrato creado con éxito.");
    }//GEN-LAST:event_btnNuevoContratoActionPerformed

    private void btnEliminarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarContratoActionPerformed
  int filaSeleccionada = jTableContrato.getSelectedRow();

    if (filaSeleccionada >= 0) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este contrato?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) jTableContrato.getModel(); 
            Date fecha = (Date) modelo.getValueAt(filaSeleccionada, 4); 

            String numeroPlaca = (String) modelo.getValueAt(filaSeleccionada, 1);
            String cedulaCliente = (String) modelo.getValueAt(filaSeleccionada, 2);

            ContratoControlador contratoControlador = new ContratoControlador();
            contratoControlador.eliminarContrato((java.sql.Date) fecha, numeroPlaca, cedulaCliente);

            modelo.removeRow(filaSeleccionada);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
    }
    }//GEN-LAST:event_btnEliminarContratoActionPerformed

    private void btnEditarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarContratoActionPerformed
  int filaSeleccionada = jTableContrato.getSelectedRow();

    if (filaSeleccionada >= 0) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableContrato.getModel();

            int contratoId = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());

            String nuevaPlaca = cbbPlacas.getSelectedItem().toString();
            String nuevaCedulaCliente = cbbCliente.getSelectedItem().toString();
            String nuevoDestino = txtDestino.getText();
            Date nuevaFecha = FeachaContrato.getDate();
            String nuevoConductor = txtConductor1.getText();
            int nuevosDias = Integer.parseInt(txtDias.getText());
            int nuevosAsientos = Integer.parseInt(txtAsientos.getText());

 java.sql.Date sqlNuevaFecha = new java.sql.Date(nuevaFecha.getTime());

            ContratoControlador controlador = new ContratoControlador();
boolean exito = controlador.editarContrato(contratoId, nuevaPlaca, nuevaCedulaCliente, nuevoDestino, sqlNuevaFecha, nuevoConductor, nuevosDias, nuevosAsientos);

            if (exito) {
                modelo.setValueAt(nuevaPlaca, filaSeleccionada, 1);
                modelo.setValueAt(nuevaCedulaCliente, filaSeleccionada, 2);
                modelo.setValueAt(nuevoDestino, filaSeleccionada, 3);
                modelo.setValueAt(nuevaFecha, filaSeleccionada, 4);
                modelo.setValueAt(nuevoConductor, filaSeleccionada, 5);
                modelo.setValueAt(nuevosDias, filaSeleccionada, 6);
                modelo.setValueAt(nuevosAsientos, filaSeleccionada, 7);

                JOptionPane.showMessageDialog(null, "Contrato editado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al editar el contrato.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos para días y asientos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar el contrato: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila para editar.");
    }
    }//GEN-LAST:event_btnEditarContratoActionPerformed

    private void btnBuscarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarContratoActionPerformed
        String cedulaCliente = cbbCliente.getSelectedItem().toString();

        if (!cedulaCliente.isEmpty()) {
            ContratoControlador contratoControlador = new ContratoControlador();
            ArrayList<Object[]> resultados = contratoControlador.buscarContratosPorCedula(cedulaCliente);

            DefaultTableModel modelo = (DefaultTableModel) jTableContrato.getModel();
            modelo.setRowCount(0);

            if (resultados != null) {
                for (Object[] fila : resultados) {
                    modelo.addRow(fila);
                }
            } else {
                JOptionPane.showMessageDialog(null,     "Error al buscar contratos por la cédula del cliente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione o ingrese la cédula del cliente para buscar");
        }
    }//GEN-LAST:event_btnBuscarContratoActionPerformed

    private void txtAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsientosActionPerformed

    private void txtConductor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConductor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConductor1ActionPerformed

    private void jTableContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContratoMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jTableContrato.getModel();
        comboBoxPlacas.setSelectedItem((String) modelo.getValueAt(jTableContrato.getSelectedRow(), 1));
        cbbCliente.setSelectedItem((String) modelo.getValueAt(jTableContrato.getSelectedRow(), 2));
        txtDestino.setText((String) modelo.getValueAt(jTableContrato.getSelectedRow(), 3));
        Date fecha = (Date) modelo.getValueAt(jTableContrato.getSelectedRow(), 4);
        FeachaContrato.setDate(fecha);
        txtConductor1.setText((String) modelo.getValueAt(jTableContrato.getSelectedRow(), 5));
        txtDias.setText(String.valueOf((int) modelo.getValueAt(jTableContrato.getSelectedRow(), 6)));
        txtAsientos.setText(String.valueOf((int) modelo.getValueAt(jTableContrato.getSelectedRow(), 7)));
    }//GEN-LAST:event_jTableContratoMouseClicked

    private void btnPDFContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFContratoActionPerformed

        String[] opciones = {"Crear PDF", "Abrir PDF"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada == 0) {

            String fileName = "reporte Contratos.pdf";
            String titulo = "Reporte de Contratos de Geaturim";
            Pdfs.generarPDF(jTableContrato, fileName, titulo);
        } else if (opcionSeleccionada == 1) {
            try {
                String fileName = "reporte Contratos.pdf";
                File file = new File(fileName);

                if (!Desktop.isDesktopSupported()) {
                    JOptionPane.showMessageDialog(null, "El sistema no soporta la apertura automática de archivos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Desktop desktop = Desktop.getDesktop();

                if (file.exists() && file.isFile()) {
                    desktop.open(file);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo PDF no existe o no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPDFContratoActionPerformed

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

/////////////////////////////////////////////////////////////////////////////////////// TABLA de USUARIOS //////////////////////////////////////////////////////////////////////////////////////
  
  
    private ArrayList<Usuario> listaPersonas = new ArrayList<>();
    private DefaultTableModel modeloUsuario = new DefaultTableModel();
    
              
public void setModelo() {
    String[] cabecera = {"Nro.", "Nombres", "Contraseñas"};
    modeloUsuario.setColumnIdentifiers(cabecera);

    UsuarioControlador usuarioControlador = new UsuarioControlador();
    ArrayList<Object[]> datos = usuarioControlador.datosUsuarios();

    if (datos != null) {
        for (Object[] fila : datos) {
            modeloUsuario.addRow(fila);
        }
    }

    jTableUsuario.setModel(modeloUsuario);
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


/////////////////////////////////////////////////////////////////////////////////////// TABLA de Clientes //////////////////////////////////////////////////////////////////////////////////////
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private DefaultTableModel modeloClientes = new DefaultTableModel();

    public void setModeloCli() {
        String[] cabecera = {"Nro.", "Nombres", "Apellidos", "Telefonos", " Cedulas", "Direcciones"};
        modeloClientes.setColumnIdentifiers(cabecera);

        ClienteControlador usuarioControlador = new ClienteControlador();
        ArrayList<Object[]> datos = usuarioControlador.datosCliente();

        if (datos != null) {
            for (Object[] fila : datos) {
                modeloClientes.addRow(fila);
            }
        }

        jTableClientes.setModel(modeloClientes);
    }

    public void mostrarDatosClientes(Cliente cliente) {
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

/////////////////////////////////////////////////////////////////////////////////////// TABLA de VEHICULOS //////////////////////////////////////////////////////////////////////////////////////
   
    private ArrayList<Vehiculo> ListarVehiculos = new ArrayList<>();
    private DefaultTableModel modeloVehiculos = new DefaultTableModel();

    public void setModeloVehiculos() {
        String[] cabecera = {"Nro.", "Nro. Placa", "Nro. Asientos", "Kilometraje", "Propietario", "Año de Fabricacion"};
    modeloVehiculos.setColumnIdentifiers(cabecera);

    VehiculoControlador vehiculoControlador = new VehiculoControlador();
    ArrayList<Object[]> datos = vehiculoControlador.datosVehiculo();

    if (datos != null) {
        for (Object[] fila : datos) {
            modeloVehiculos.addRow(fila);
        }
    }

    jTableVehiculo.setModel(modeloVehiculos);
    }

    public void mostrarDatosVehiculos(Vehiculo vehiculo) {
        DefaultTableModel modelo = (DefaultTableModel) jTableVehiculo.getModel();
        Object[] fila = new Object[6];

        fila[0] = modelo.getRowCount() + 1;
        fila[1] = vehiculo.getNumPlaca();
        fila[2] = vehiculo.getNumAsientos();
        fila[3] = vehiculo.getKilometraje();
        fila[4] = vehiculo.getNombrePropietario();
        fila[5] = vehiculo.getAñoFabricacion();
        modelo.addRow(fila);
    }

 ////////////////////////////////////////////////////////////////////TABLA DE MANTENIMIENTO///////////////////////////////////////////////////////////////
 
     private ArrayList<Mantenimiento> listaMantenimientos = new ArrayList<>();
    private DefaultTableModel modeloMantenimientos = new DefaultTableModel();

    public void setModeloMantenimientos() {
        String[] cabecera = {"Nro", "Placa Vehiculo", "Cambios Aceite", "Cambios Filtro", "Fecha", "Kilometraje"};
        modeloMantenimientos.setColumnIdentifiers(cabecera);

        MantenimientoControlador mantenimientoControlador = new MantenimientoControlador();
        ArrayList<Object[]> datos = mantenimientoControlador.datosMantenimiento();

        if (datos != null) {
            for (Object[] fila : datos) {
                modeloMantenimientos.addRow(fila);
            }
        }

        jTableMantenimiento.setModel(modeloMantenimientos);
    }

    public void mostrarDatosMantenimiento(Mantenimiento mantenimiento) {
        DefaultTableModel modelo = (DefaultTableModel) jTableMantenimiento.getModel();
        Object[] fila = new Object[6];

        fila[0] = modelo.getRowCount() + 1;
        fila[1] = mantenimiento.getIdvehiculo();
        fila[2] = mantenimiento.getCambiosDeAceite();
        fila[3] = mantenimiento.getCambiosDeFiltro();
        fila[4] = mantenimiento.getFecha();
        fila[5] = mantenimiento.getKilometraje();
        modelo.addRow(fila);
    }
    
/////////////////////////////////////////////////////////////////////////////////////// TABLA de CONTRATOS //////////////////////////////////////////////////////////////////////////////////////
    
    private ArrayList<Contrato> listaContratos = new ArrayList<>();
    private DefaultTableModel modeloContrato = new DefaultTableModel();
   

public void setModeloContratos() {
    String[] cabecera = {"Nro", "Placa Vehiculo", "Cedula", "Destino", "Fecha", "Conductor", "Dias", "Nro°Asientos"};
    modeloContrato.setColumnIdentifiers(cabecera);
    ContratoControlador contratoControlador = new ContratoControlador();
        ArrayList<Object[]> datos = contratoControlador.datosContratosPorPlacaYCliente();

        if (datos != null) {
            for (Object[] fila : datos) {
                modeloContrato.addRow(fila);
            }
        }

        jTableContrato.setModel(modeloContrato);
    }

public void mostrarDatosContrato(Contrato contrato) {
    DefaultTableModel modelo = (DefaultTableModel) jTableContrato.getModel(); 
    Object[] fila = new Object[8];

    fila[0] = modelo.getRowCount() + 1;
    fila[1] = contrato.getIdvehiculoc();
    fila[2] = contrato.getIdcliente();
    fila[3] = contrato.getDestino();
    fila[4] = contrato.getFecha();
    fila[5] = contrato.getNombreConductor();
    fila[6] = contrato.getDias();
    fila[7] = contrato.getAsientos();
    modelo.addRow(fila);
}





 /////////////////////////////////////////////////////////////////////////////TABLA DE ABONOS///////////////////////////////////////////////////////////////////////
private ArrayList<Abono> listaAbonos = new ArrayList<>();
private DefaultTableModel modeloAbonos = new DefaultTableModel();

public void setModeloAbonos() {
    String[] cabecera = {"Nro", "Destino", "Valor", "Fecha", "Bancos Comp", "Monto", "Estado", "Banco"};
    modeloAbonos.setColumnIdentifiers(cabecera);

    AbonoControlador abonoControlador = new AbonoControlador(); 
    ArrayList<Object[]> abonos = abonoControlador.datosAbonos(); 

    if (abonos != null) {
        for (Object[] abono : abonos) {
            modeloAbonos.addRow(abono);  
        }        
    }

    jTableAbono.setModel(modeloAbonos);
}
public void mostrarDatosAbono(Abono abono) {
    DefaultTableModel modelo = (DefaultTableModel) jTableAbono.getModel();
    Object[] fila = new Object[8];

    fila[0] = modelo.getRowCount() + 1;
    fila[1] = abono.getDestino();
    fila[2] = abono.getValor();
    fila[3] = abono.getFecha();
    fila[4] = abono.getBancosComp();
    fila[5] = abono.getMonto();
    fila[6] = abono.getEstado();
    fila[7] = abono.getBanco();
    modelo.addRow(fila);
}



 ////////////////////////////////////////////////////////////////////TABLA DE HISTORIAL MANTENIMIENTO///////////////////////////////////////////////////////////////

 
     private ArrayList<HistorialM> listaHistorialM = new ArrayList<>();
    private DefaultTableModel modeloHistorialM = new DefaultTableModel();

    public void setModeloHistorialMantenimientos() {
        String[] cabecera = {"Nro", " Usuario" , " Accion",  "nro. Placa", "Fecha y Hora"};
        modeloHistorialM.setColumnIdentifiers(cabecera);

        HistorialControlador historialControlador = new HistorialControlador();
        ArrayList<Object[]> datos = historialControlador.listarHistorialMantenimiento();

        if (datos != null) {
            for (Object[] fila : datos) {
                modeloHistorialM.addRow(fila);
            }
        }

        jTableHistorialM.setModel(modeloHistorialM);
    }

    public void mostrarDatosHistorialMantenimiento(HistorialM historialM) {
        DefaultTableModel modelo = (DefaultTableModel) jTableHistorialM.getModel();
        Object[] fila = new Object[5];

        fila[0] = modelo.getRowCount() + 1;
        fila[1] = historialM.getIdUsuario();
        fila[2] = historialM.getAccion();
        fila[3] = historialM.getIdMantenimiento();
        fila[4] = historialM.getFechaHora();
        modelo.addRow(fila);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FeachaAbono;
    private com.toedter.calendar.JDateChooser FeachaContrato;
    private com.toedter.calendar.JDateChooser FeachaFabricacion;
    private com.toedter.calendar.JDateChooser FeachaMantenimiento;
    private javax.swing.JLabel PDF;
    private javax.swing.JLabel PDF1;
    private javax.swing.JLabel PDF2;
    private javax.swing.JLabel PDF3;
    private javax.swing.JButton btnAbono;
    private javax.swing.JButton btnAbonoH;
    private javax.swing.JButton btnBuscarAbono;
    private javax.swing.JButton btnBuscarClientes;
    private javax.swing.JButton btnBuscarContrato;
    private javax.swing.JButton btnBuscarM;
    private javax.swing.JButton btnBuscarU;
    private javax.swing.JButton btnBuscarVehiculo;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnContrato;
    private javax.swing.JButton btnContratoH;
    private javax.swing.JButton btnEditarAbono;
    private javax.swing.JButton btnEditarCli;
    private javax.swing.JButton btnEditarContrato;
    private javax.swing.JButton btnEditarM;
    private javax.swing.JButton btnEditarU;
    private javax.swing.JButton btnEditarVehiculo;
    private javax.swing.JButton btnEliminarAbono;
    private javax.swing.JButton btnEliminarCli;
    private javax.swing.JButton btnEliminarContrato;
    private javax.swing.JButton btnEliminarM;
    private javax.swing.JButton btnEliminarU;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnMantenimientos;
    private javax.swing.JButton btnMantenimientosH;
    private javax.swing.JButton btnNuevoAbono;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoContrato;
    private javax.swing.JButton btnNuevoM;
    private javax.swing.JButton btnNuevoU;
    private javax.swing.JButton btnNuevoVehiculo;
    private javax.swing.JButton btnPDFClientes;
    private javax.swing.JButton btnPDFContrato;
    private javax.swing.JButton btnPDFMantenimiento;
    private javax.swing.JButton btnPDFVehiculo;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JComboBox<String> cbbCliente;
    private javax.swing.JComboBox<String> cbbPlacas;
    private javax.swing.JComboBox<String> comboBoxPlacas;
    private javax.swing.JCheckBox jCheckBoxContra;
    private javax.swing.JCheckBox jCheckBoxSinLiquidar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JInternalFrame jInternalFrame6;
    private javax.swing.JInternalFrame jInternalFrame7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAbono;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableContrato;
    private javax.swing.JTable jTableHistorialM;
    private javax.swing.JTable jTableMantenimiento;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTable jTableVehiculo;
    private javax.swing.JCheckBox jcheckboxLiquidado;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedulas;
    private javax.swing.JLabel lblConductor;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextField txtApellidoC;
    private javax.swing.JTextArea txtAreaAceite;
    private javax.swing.JTextField txtAsientos;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextArea txtCambioFiltro;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtComprobante;
    private javax.swing.JTextField txtConductor1;
    private javax.swing.JTextArea txtDestino;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtKilometrajeM;
    private javax.swing.JTextField txtKilometrajeTotal;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreProp;
    private javax.swing.JTextField txtNombreU;
    private javax.swing.JTextField txtNumAsientos;
    private javax.swing.JTextField txtNumPlaca;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValor;
    private javax.swing.JPasswordField txtcontra;
    // End of variables declaration//GEN-END:variables

                            /////////////////////////////////////////////////////////////////////////////////////// METODOS DE TABLAS //////////////////////////////////////////////////////////////////////////////////////
    
    
     ///////////////////////////////////////////////////////////////TABLA USUARIO//////////////////////////////////////////////////////////////////////////////////
    
    public void limpiarTablaUsuario() {
        int a = modeloUsuario.getRowCount() - 1;  
        for (int i = a; i >= 0; i--) {
            modeloUsuario.removeRow(i);
        }
    }

     public void modeloUsuario() {
        UsuarioControlador usuarioControlador = new UsuarioControlador();
        ArrayList<Object[]> datos = usuarioControlador.datosUsuarios();
        if (datos != null) {
            for (Object[] fila : datos) {
                modeloUsuario.addRow(fila);
            }
        }
    }
     
 ///////////////////////////////////////////////////////////////TABLA CLIENTE//////////////////////////////////////////////////////////////////////////////////

    public void limpiarTablaClientes() {
        int a = modeloClientes.getRowCount() - 1;  
        for (int i = a; i >= 0; i--) {
            modeloClientes.removeRow(i);
        }
    }

     public void modeloClientes() {
        ClienteControlador clienteControlador = new ClienteControlador();
        ArrayList<Object[]> datos = clienteControlador.datosCliente();
        if (datos != null) {
            for (Object[] fila : datos) {
                modeloClientes.addRow(fila);
            }
        }
    }

 ///////////////////////////////////////////////////////////////TABLA VEHICULO////////////////////////////////////////////////////////////////////////////////// 
   
      public void limpiarTablaVehiculo() {
        int a = modeloVehiculos.getRowCount() - 1;  
        for (int i = a; i >= 0; i--) {
            modeloVehiculos.removeRow(i);
        }
    }

     public void modeloVehiculo() {
        VehiculoControlador vehiculoControlador = new VehiculoControlador();
        ArrayList<Object[]> datos = vehiculoControlador.datosVehiculo();
        if (datos != null) {
            for (Object[] fila : datos) {
                modeloVehiculos.addRow(fila);
            }
        }
    }
     
     
     
     private void actualizarTablaVehiculos() {
    DefaultTableModel modelo = (DefaultTableModel) jTableVehiculo.getModel();
    modelo.setRowCount(0); 
    VehiculoControlador controlador = new VehiculoControlador();
    ArrayList<Object[]> datos = controlador.datosVehiculo();
    
    if (datos != null) {
        for (Object[] fila : datos) {
            modelo.addRow(fila); 
        }
    }
}

private void limpiarCamposVehiculos() {
    txtNumPlaca.setText("");
    txtNombreProp.setText("");
    txtNumAsientos.setText("");
    txtKilometrajeTotal.setText("");
    FeachaFabricacion.setDate(null);
}


     
 ///////////////////////////////////////////////////////////////TABLA MANTENIMIENTO////////////////////////////////////////////////////////////////////////////////// 

  
      public void limpiarTablaMantenimiento() {
        int a = modeloMantenimientos.getRowCount() - 1;  
        for (int i = a; i >= 0; i--) {
            modeloMantenimientos.removeRow(i);
        }
    }

     public void modeloMantenimiento() {
        MantenimientoControlador mantenimientoControlador = new MantenimientoControlador();
        ArrayList<Object[]> datos = mantenimientoControlador.datosMantenimiento();
        if (datos != null) {
            for (Object[] fila : datos) {
                modeloMantenimientos.addRow(fila);
            }
        }
    }
     
     private void actualizarTablaMantenimientos() {
    DefaultTableModel modelo = (DefaultTableModel) jTableMantenimiento.getModel();
    modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
    MantenimientoControlador controlador = new MantenimientoControlador();
    ArrayList<Object[]> datos = controlador.datosMantenimiento();
    
    if (datos != null) {
        for (Object[] fila : datos) {
            modelo.addRow(fila); 
        }
    }
}

private void limpiarCamposMantenimiento() {
    txtAreaAceite.setText("");
    txtCambioFiltro.setText("");
    FeachaMantenimiento.setDate(null);
    txtKilometrajeM.setText(""); 
}
///////////////////////////////////////////////////////////////TABLA CONTRATOS////////////////////////////////////////////////////////////////////////////////// 
     
     public void limpiarTablaContrato() {
        int a = modeloContrato.getRowCount() - 1;  
       for (int i = a; i >= 0; i--) {
            modeloContrato.removeRow(i);
        }
    }
     
      private void actualizarTablaContratos() {
    DefaultTableModel modelo = (DefaultTableModel) jTableContrato.getModel();
    modelo.setRowCount(0); 
    ContratoControlador controlador = new ContratoControlador();
    ArrayList<Object[]> datos = controlador.datosContratosPorPlacaYCliente();
    
    if (datos != null) {
        for (Object[] fila : datos) {
            modelo.addRow(fila); 
        }
    }
}

     public void modeloContrato() {
        ContratoControlador contratoControlador = new ContratoControlador();
        ArrayList<Object[]> datos = contratoControlador.datosContratosPorPlacaYCliente();
        if (datos != null) {
            for (Object[] fila : datos) {
                modeloContrato.addRow(fila);
            }
        }
    }
     
     
 ///////////////////////////////////////////////////////////////TABLA  ABONOS////////////////////////////////////////////////////////////////////////////////// 
 
    public void limpiarTablaAbonos() {
    int filas = modeloAbonos.getRowCount();
    for (int i = filas - 1; i >= 0; i--) {
        modeloAbonos.removeRow(i);
    }
}

public void actualizarTablaAbonos() {
    DefaultTableModel modelo = (DefaultTableModel) jTableAbono.getModel();
    modelo.setRowCount(0); 
    AbonoControlador controlador = new AbonoControlador();
    ArrayList<Object[]> datos = controlador.datosAbonos();
    if (datos != null) {
        for (Object[] fila : datos) {
            modelo.addRow(fila); 
        }
    }
}

public void modeloAbonos() {
    AbonoControlador abonoControlador = new AbonoControlador();
    ArrayList<Object[]> datos = abonoControlador.datosAbonos();
    if (datos != null) {
        for (Object[] fila : datos) {
            modeloAbonos.addRow(fila); 
        }
    }
}
    

    

}

