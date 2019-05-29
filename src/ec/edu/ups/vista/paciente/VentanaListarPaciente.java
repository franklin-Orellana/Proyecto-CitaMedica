/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.paciente;

/**
 *
 * @author Fernanda
 */
import ec.edu.ups.controladores.ControladorPaciente;
import ec.edu.ups.modelo.Paciente;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
public class VentanaListarPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaListarPaciente
     */
    private ControladorPaciente controladorPaciente;
    public static DefaultTableModel modelo;
    public VentanaListarPaciente(ControladorPaciente controladorPaciente) {
        initComponents();
        initComponents();
        this.controladorPaciente = controladorPaciente;
        modelo = new DefaultTableModel();
        Object[] columnas = {"CODIGO","CEDULA","NOMBRE","SINTOMAS","DIRECCION","TELEFONO"};
        modelo.setColumnIdentifiers(columnas);
        tabla.setModel(modelo);
        llenarTabla();
    }
    public void llenarTabla() {
        Set<Paciente> Lista = controladorPaciente.getLista();
        for (Paciente paciente : Lista) {
            Object[] datos = {paciente.getCodigo(),
                paciente.getCedula(),
                paciente.getNombre(),
                paciente.getSintomas(),
                paciente.getDireccion(),
                paciente.getTelefono()};
            modelo.addRow(datos);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CÉDULA", "NOMBRE", "SÍNTOMAS", "DIRECCIÓN", "TELÉFONO"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
