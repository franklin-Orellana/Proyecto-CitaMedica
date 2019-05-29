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
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VentanaBuscarCitaMedica extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaBuscarCitaMedica
     */
    private ControladorCitaMedica controladorCitaMedica;
    private ControladorCitaMedicaDetallada controladorCitaMedicaDetallada;
    private ControladorPaciente controladorPaciente;
    private ControladorMedico controladorMedico;
    private Set<CitaMedicaDetallada> citaMedicaDetalladas;
    CitaMedica citaMedica;
    public static DefaultTableModel modelo;
    
    public VentanaBuscarCitaMedica(ControladorCitaMedica controladorCitaMedica,ControladorCitaMedicaDetallada controladorCitaMedicaDetallada,ControladorPaciente controladorPaciente, ControladorMedico controladorMedico) {
        initComponents();
        this.controladorCitaMedica=controladorCitaMedica;
        this.controladorCitaMedicaDetallada= controladorCitaMedicaDetallada;
        this.controladorPaciente = controladorPaciente;
        this.controladorMedico= controladorMedico;
        modelo = new DefaultTableModel();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCitaMedica = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblpaciente = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
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
        txtDoctor = new javax.swing.JTextField();
        lbldoctor = new javax.swing.JLabel();
        lblcodigo1 = new javax.swing.JLabel();
        txtlaboratorio = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        btnguardar3 = new javax.swing.JButton();
        lblguardar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        lblcancelar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Buscar Cita Medica");

        lblCitaMedica.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblCitaMedica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCitaMedica.setText("CITA MEDICA");
        lblCitaMedica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblpaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblpaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpaciente.setText("PACIENTE");
        lblpaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblfecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecha.setText("FECHA");
        lblfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        txtDoctor.setEditable(false);
        txtDoctor.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtDoctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDoctor.setToolTipText("");

        lbldoctor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldoctor.setText("DOCTOR");
        lbldoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblcodigo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcodigo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcodigo1.setText("NUMERO CITA");
        lblcodigo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtlaboratorio.setEditable(false);
        txtlaboratorio.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtlaboratorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtlaboratorio.setToolTipText("");

        txtPaciente.setEditable(false);
        txtPaciente.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPaciente.setToolTipText("");

        btnguardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscar.png"))); // NOI18N
        btnguardar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar3ActionPerformed(evt);
            }
        });

        lblguardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblguardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblguardar.setText("BUSCAR");
        lblguardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtlaboratorio))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lbldoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtsintomas)
                                .addGap(18, 18, 18)
                                .addComponent(lbltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPaciente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnguardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 28, Short.MAX_VALUE)
                                        .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txttelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
                        .addComponent(lblespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

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

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("PRECIO");
        lblPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPrecio.setEditable(false);
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
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsintomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsintomasActionPerformed

    private void tblDetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetalleKeyReleased

     
    }//GEN-LAST:event_tblDetalleKeyReleased

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnguardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar3ActionPerformed

        int codigo = Integer.parseInt(txtcodigo.getText());
        citaMedica=controladorCitaMedica.read(codigo);
        citaMedicaDetalladas=citaMedica.getListaDetallada() ;
        modelo = new DefaultTableModel();
        Object[] columnas = {"Codigo ", "Diagnostico"};
        modelo.setColumnIdentifiers(columnas);   
         for(CitaMedicaDetallada citaMedicaDetallada:citaMedicaDetalladas){
            Object[] fila = {citaMedicaDetallada.getCodigo(), citaMedicaDetallada.getDiagnostico()};
            modelo.addRow(fila);
        }
        tblDetalle.setModel(modelo);      
        txtPaciente.setText(citaMedica.getPaciente().getNombre());
        txtcedula.setText(citaMedica.getPaciente().getCedula());
        txtdireccion.setText(citaMedica.getPaciente().getDireccion());
        txttelefono.setText(citaMedica.getPaciente().getTelefono());
        txtsintomas.setText(citaMedica.getPaciente().getSintomas());
        txtDoctor.setText(citaMedica.getMedico().getNombre());
        txtespecialidad.setText(citaMedica.getMedico().getEspecialidad());
        txtlaboratorio.setText(citaMedica.getMedico().getLaboratoio());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(citaMedica.getFechaCita());
        txtFecha.setText(fecha);
        txtPrecio.setText(String.valueOf(citaMedica.getPrecio()));
       JOptionPane.showMessageDialog(this, "CITA MEDICA ENCONTRADA");

    }//GEN-LAST:event_btnguardar3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar3;
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
    private javax.swing.JTextField txtDoctor;
    public static javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPaciente;
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
