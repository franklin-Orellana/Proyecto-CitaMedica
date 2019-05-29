/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.vista.citaMedica;

import ec.edu.ups.controladores.ControladorCitaMedica;
import ec.edu.ups.controladores.ControladorCitaMedicaDetallada;
import ec.edu.ups.controladores.ControladorMedico;
import ec.edu.ups.controladores.ControladorPaciente;
import ec.edu.ups.modelo.CitaMedica;
import ec.edu.ups.modelo.CitaMedicaDetallada;
import ec.edu.ups.modelo.Medico;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.vista.VentanaPrincipal;
import ec.edu.ups.vista.paciente.VentanaCrearPaciente;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author José Quinde
 */
public class VentanaCrearCitaMedica extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaCrearCitaMedica
     */
    private ControladorCitaMedica controladorCitaMedica;
    private ControladorCitaMedicaDetallada controladorCitaMedicaDetallada;
    private ControladorPaciente controladorPaciente;
    private ControladorMedico controladorMedico;
    private Set<Paciente> listaPacientes;
    private Set<Medico> listaMedicos;
    public static DefaultTableModel modelo;
    private CitaMedicaDetallada detalle;
    private Set<CitaMedicaDetallada> citaMedicaDetalladas;
    private VentanaCrearPaciente ventanaCrearPaciente;
    private int fila;
    private String diagnostico="";
    private int codDet;
    private int imin;
    private int imax;
    public VentanaCrearCitaMedica(ControladorCitaMedica controladorCitaMedica,ControladorCitaMedicaDetallada controladorCitaMedicaDetallada,ControladorPaciente controladorPaciente, ControladorMedico controladorMedico) {
        initComponents();       
        this.controladorCitaMedica=controladorCitaMedica;
        this.controladorCitaMedicaDetallada= controladorCitaMedicaDetallada;
        this.controladorPaciente = controladorPaciente;
        this.controladorMedico= controladorMedico;
        txtcodigo.setText(String.valueOf(this.controladorCitaMedica.getCodigo()));
        citaMedicaDetalladas = new HashSet<>();        
        modelo = new DefaultTableModel();
        txtFecha.setText(fechaActual());
        listaPacientes= controladorPaciente.getLista();
        
        for (Paciente paciente : listaPacientes) {
            cbxpacientes.addItem(paciente.getNombre());            
        }
        listaMedicos= controladorMedico.getLista();
        for (Medico medico : listaMedicos) {
            cbxmedicos.addItem(medico.getNombre());            
        }
        pacienteBuscado();
        medicoBuscado();
        //int cod=controladorCitaMedicaDetallada.getCodigo();
        //System.out.println(cod);
          Object[] columnas = {"Codigo", "Diagnostico"};
        modelo.setColumnIdentifiers(columnas);
        codDet=controladorCitaMedicaDetallada.getCodigo();
         Object [] vacio={codDet,""};
         imin=codDet;
         System.out.println(imin);
         modelo.addRow(vacio);
        tblDetalle.setModel(modelo);
        /*
        modelo = (DefaultTableModel) tblDetalle.getModel();
        Object[] dato = {cod, ""};
        modelo.addRow(dato);
        */
    }
    /*
    Metodo que te devuelve la fecha Actual
    */
     public static String fechaActual() {
        Date fecha1 = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        return formato.format(fecha1);
    }
    /**
    * Este metodo setea el precio del producto selecciona en el jcombobox
    */
     public void pacienteBuscado(){
        Paciente paciente = buscarPaciente();
        txtcedula.setText(paciente.getCedula());
        txtdireccion.setText(paciente.getDireccion());
        txttelefono.setText(paciente.getTelefono());
        txtsintomas.setText(paciente.getSintomas());
    }
    /**
     * Este metodo retorna el producto del jcombox dependiendo la seleccion
     * @return 
     */
     public Paciente buscarPaciente() {
        Paciente p = new Paciente();
        for (Paciente paciente : listaPacientes) {
            if (cbxpacientes.getSelectedItem().toString().equalsIgnoreCase(paciente.getNombre())) {
                p = paciente;
            }
        }
        return p;
    }
    /**
    * Este metodo setea el precio del producto selecciona en el jcombobox
    */
     public void medicoBuscado(){
        Medico medico = buscarMedico();
        txtespecialidad.setText(medico.getEspecialidad());
        txtlaboratorio.setText(medico.getLaboratoio());
    }
    /**
     * Este metodo retorna el producto del jcombox dependiendo la seleccion
     * @return 
     */
     public Medico buscarMedico() {
        Medico m = new Medico();
        for (Medico medico : listaMedicos) {
            if (cbxmedicos.getSelectedItem().toString().equalsIgnoreCase(medico.getNombre())) {
                m = medico;
            }
        }
        return m;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblpaciente = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cbxpacientes = new javax.swing.JComboBox();
        lblcedula = new javax.swing.JLabel();
        lblsintomas = new javax.swing.JLabel();
        txtsintomas = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        lbldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        lblespecialidad = new javax.swing.JLabel();
        txtespecialidad = new javax.swing.JTextField();
        lblLaboratorio = new javax.swing.JLabel();
        txtlaboratorio = new javax.swing.JTextField();
        lbldoctor = new javax.swing.JLabel();
        cbxmedicos = new javax.swing.JComboBox();
        lblcodigo1 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        lblcancelar = new javax.swing.JLabel();
        lblCitaMedica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        lblguardar = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Crear Cita Medica");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblpaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblpaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpaciente.setText("PACIENTE");
        lblpaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigo.setEnabled(false);

        lblfecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecha.setText("FECHA");
        lblfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbxpacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxpacientesActionPerformed(evt);
            }
        });

        lblcedula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcedula.setText("CEDULA");
        lblcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblsintomas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblsintomas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsintomas.setText("SINTOMAS");
        lblsintomas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtsintomas.setEditable(false);
        txtsintomas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtsintomas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsintomasActionPerformed(evt);
            }
        });

        txtcedula.setEditable(false);
        txtcedula.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtcedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbldireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldireccion.setText("DIRECCIÓN");
        lbldireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtdireccion.setEditable(false);
        txtdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txttelefono.setEditable(false);
        txttelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbltelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltelefono.setText("TELEFONO");
        lbltelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblespecialidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblespecialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblespecialidad.setText("ESPECIALIDAD");
        lblespecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtespecialidad.setEditable(false);
        txtespecialidad.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtespecialidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblLaboratorio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLaboratorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLaboratorio.setText("LABORATORIO");
        lblLaboratorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtlaboratorio.setEditable(false);
        txtlaboratorio.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtlaboratorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtlaboratorio.setToolTipText("");

        lbldoctor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldoctor.setText("DOCTOR");
        lbldoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxmedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmedicosActionPerformed(evt);
            }
        });

        lblcodigo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcodigo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcodigo1.setText("NUMERO CITA");
        lblcodigo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbldoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxmedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtsintomas)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                    .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbxpacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtlaboratorio)
                            .addGap(382, 382, 382))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(cbxpacientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbldoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxmedicos, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(lblespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("PRECIO");
        lblPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setToolTipText("");

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/cancelar.png"))); // NOI18N
        btncancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        lblcancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblcancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcancelar.setText("CANCELAR");
        lblcancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCitaMedica.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblCitaMedica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCitaMedica.setText("CITA MEDICA");
        lblCitaMedica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Codigo", "Diagnostico"
            }
        ));
        tblDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDetalleKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalle);

        lblguardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblguardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblguardar.setText("GUARDAR");
        lblguardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/guardar.png"))); // NOI18N
        btnguardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnguardar))
                            .addGap(71, 71, 71)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btncancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblcancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(lblCitaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblCitaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnguardar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtsintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsintomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsintomasActionPerformed

    private void cbxpacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxpacientesActionPerformed
        //Selecciona el producto dependiendo la opcion escojida en el jcomboBox
        pacienteBuscado();
    }//GEN-LAST:event_cbxpacientesActionPerformed

    private void cbxmedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmedicosActionPerformed
        //Selecciona el producto dependiendo la opcion escojida en el jcomboBox
        medicoBuscado();
    }//GEN-LAST:event_cbxmedicosActionPerformed

    private void tblDetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetalleKeyReleased
     
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {               
            int columna = tblDetalle.getSelectedColumn();        
            if (columna == 1) {
                //modelo = (DefaultTableModel) tblDetalle.getModel();         
                fila = tblDetalle.getSelectedRow();
                detalle=new CitaMedicaDetallada();
                int codigo=controladorCitaMedicaDetallada.getCodigo();                
                imax=codigo;
                modelo.setValueAt(codigo,fila , 0);  
                diagnostico=JOptionPane.showInputDialog(null,"Ingrese el Diagnostico","Diagnostico",JOptionPane.QUESTION_MESSAGE);
                detalle.setDiagnostico(diagnostico);                
                controladorCitaMedicaDetallada.cread(detalle); 
                citaMedicaDetalladas.add(detalle);
                    Object[] datos  
                      ={
                        detalle.getCodigo(),
                        detalle.getDiagnostico()
                        };
                    //modelo.removeRow(fila
                    //modelo.setValueAt("",aux, 1);
                    System.out.println("Ingresa");
                System.out.println(detalle.getCodigo());
                System.out.println(diagnostico);
                System.out.println("Imprime");
                System.out.println(detalle.toString());
                    modelo.addRow(datos);
                if (diagnostico ==null){
                    controladorCitaMedicaDetallada.delete(codigo);
                    modelo.removeRow(modelo.getRowCount()-1);
                    citaMedicaDetalladas.remove(detalle);
                    
                }     
              
                        
            }
               
                }
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {                   
                      int filaSeleccionada = tblDetalle.getSelectedRow();
                if (filaSeleccionada >= 0) {
                 int codigoDetalle = Integer.parseInt(tblDetalle.getValueAt(filaSeleccionada, 0).toString());
                 modelo.removeRow(filaSeleccionada);
                 citaMedicaDetalladas.remove(controladorCitaMedicaDetallada.read(codigoDetalle));
                 controladorCitaMedicaDetallada.delete(codigoDetalle);              
                JOptionPane.showMessageDialog( null, "la descripcion con el codigo "+codigoDetalle+" ha sido eliminada");
        }              
                     
                }    
    }//GEN-LAST:event_tblDetalleKeyReleased

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        modelo.removeRow(0);
        CitaMedica citaMedica=new CitaMedica();
        Paciente paciente = buscarPaciente();
        Medico medico = buscarMedico();
        citaMedica.setPrecio(Double.parseDouble(txtPrecio.getText()));
        String fecha1 = txtFecha.getText(); // Entrada recogida como sea (scanner)
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); // Creamos un formato de fecha
        Date fecha=null;
        try {
            fecha = format.parse(fecha1);
        } catch (ParseException ex) {
            Logger.getLogger(VentanaCrearCitaMedica.class.getName()).log(Level.SEVERE, null, ex);
        }
        citaMedica.setFechaCita(fecha);
        citaMedica.setMedico(medico);
        citaMedica.setPaciente(paciente);        
        citaMedica.setListaDetallada(citaMedicaDetalladas);
        controladorCitaMedica.cread(citaMedica);
        JOptionPane.showMessageDialog(this, "LA CITA MEDICA SE A CREADO");
        txtcodigo.setText(String.valueOf(this.controladorCitaMedica.getCodigo()));
        txtPrecio.setText(" ");
         DefaultTableModel tb = (DefaultTableModel) tblDetalle.getModel();
        int a = tblDetalle.getRowCount()-1;
        for (int i = a; i >= 1; i--) {
        tb.removeRow(tb.getRowCount()-1);
         modelo.setValueAt("", 0, 0);
         modelo.setValueAt("", 0, 1);
        }
    }//GEN-LAST:event_btnguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox cbxmedicos;
    private javax.swing.JComboBox cbxpacientes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblCitaMedica;
    private javax.swing.JLabel lblLaboratorio;
    public static javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblcancelar;
    private javax.swing.JLabel lblcedula;
    public static javax.swing.JLabel lblcodigo1;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbldoctor;
    private javax.swing.JLabel lblespecialidad;
    public static javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblguardar;
    private javax.swing.JLabel lblpaciente;
    private javax.swing.JLabel lblsintomas;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTable tblDetalle;
    public static javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtespecialidad;
    private javax.swing.JTextField txtlaboratorio;
    private javax.swing.JTextField txtsintomas;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
