/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.factura;

import java.awt.event.KeyEvent;
import ec.edu.ups.controladores.ControladorCitaMedica;
import ec.edu.ups.controladores.ControladorFacturaDetallada;
import ec.edu.ups.controladores.ControladorFactura;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tians
 */
public class VentanaCrearFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaCrearFactura
     */
    private ControladorCitaMedica controladorCitaMedica;
    private ControladorFactura controladorFactura;
    private ControladorFacturaDetallada controladorFacturaDetallada;
    private Locale localizacion;
    private static ResourceBundle mensajes;
    public static DefaultTableModel modelo;

    public VentanaCrearFactura(ControladorCitaMedica controladorCitaMedica, ControladorFactura controladorFactura, ControladorFacturaDetallada controladorFacturaDetallada) {
        initComponents();
        this.controladorCitaMedica = controladorCitaMedica;
        this.controladorFactura = controladorFactura;
        this.controladorFacturaDetallada = controladorFacturaDetallada;
        modelo = new DefaultTableModel();
    }

    public static void cambiarIdioma(Locale localizacion) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        lblMenuCrearF.setText(mensajes.getString("crear.factura"));
        lblcodigo.setText(mensajes.getString("codigo"));
        lblfecha.setText(mensajes.getString("cedula"));
        lblsubtotal.setText(mensajes.getString("subtotal"));
        lbliva.setText(mensajes.getString("iva"));
        lbltotal.setText(mensajes.getString("total"));
        Object[] columnas = {mensajes.getString("cantidad"),mensajes.getString("codigo"), mensajes.getString("paciente"), mensajes.getString("medico"), mensajes.getString("fecha"), mensajes.getString("precio"), mensajes.getString("subtotal"), mensajes.getString("total")};
        modelo.setColumnIdentifiers(columnas);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcodigo1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblMenuCrearF = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        txtCodigoF = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblsubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lbliva = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        lbltotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();

        lblcodigo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcodigo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcodigo1.setText("CÓDIGO");
        lblcodigo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setEnabled(false);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblMenuCrearF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMenuCrearF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuCrearF.setText("CREAR FACTURA");
        lblMenuCrearF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblcodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcodigo.setText("CÓDIGO");
        lblcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCodigoF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtCodigoF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoF.setEnabled(false);

        lblfecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecha.setText("FECHA");
        lblfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setEnabled(false);

        lblsubtotal.setText("Subtotal:");

        lbliva.setText("IVA 12%: ");

        lbltotal.setText("TOTAL:");

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Codigo", "Paciente", "Medico", "Fecha", "Precio", "Subtotal", "Total"
            }
        ));
        tblCitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCitasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblCitas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lblsubtotal)
                                .addGap(12, 12, 12)
                                .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbliva)
                                .addGap(12, 12, 12)
                                .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbltotal)
                                .addGap(12, 12, 12)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(lblMenuCrearF, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuCrearF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigoF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblsubtotal))
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbliva))
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbltotal))
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCitasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCitasKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int codigoCita = Integer.parseInt(String.valueOf(tblCitas.getValueAt(0, 1)));
            System.out.println(codigoCita);
        }
    }//GEN-LAST:event_tblCitasKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblMenuCrearF;
    public static javax.swing.JLabel lblcodigo;
    public static javax.swing.JLabel lblcodigo1;
    public static javax.swing.JLabel lblfecha;
    public static javax.swing.JLabel lbliva;
    public static javax.swing.JLabel lblsubtotal;
    public static javax.swing.JLabel lbltotal;
    private javax.swing.JTable tblCitas;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoF;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
