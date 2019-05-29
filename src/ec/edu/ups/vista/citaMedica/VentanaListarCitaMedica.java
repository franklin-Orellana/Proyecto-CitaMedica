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
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VentanaListarCitaMedica extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaListarCitaMedica
     */
    private ControladorCitaMedica controladorCitaMedica;
    private ControladorCitaMedicaDetallada controladorCitaMedicaDetallada;
    private ControladorPaciente controladorPaciente;
    private ControladorMedico controladorMedico;
    public static DefaultTableModel modelo;
    JComboBox<Object> listaDet;
    
    public VentanaListarCitaMedica(ControladorCitaMedica controladorCitaMedica,ControladorCitaMedicaDetallada controladorCitaMedicaDetallada,ControladorMedico controladorMedico, ControladorPaciente controladorPaciente) {
        initComponents();
        this.controladorCitaMedica=controladorCitaMedica;
        this.controladorCitaMedicaDetallada= controladorCitaMedicaDetallada;
        this.controladorPaciente = controladorPaciente;
        this.controladorMedico= controladorMedico;
        modelo = new DefaultTableModel();
        Object[] columnas ={"Numero Cita","Paciente","Cedula","Direccion","Telefono","Doctor","Especialidad","Laboratorio","Detalle Cita Medica","Fecha","Precio"};
        modelo.setColumnIdentifiers(columnas);
        tabla.setModel(modelo);
        listaDet=new JComboBox<>();
        llenarTabla();        
    }
    public void llenarTabla(){
    Set<CitaMedica> Lista = controladorCitaMedica.getLista();
     Set<CitaMedicaDetallada> citaMedicaDetalladas;
    for(CitaMedica citaMedica : Lista){
        citaMedicaDetalladas=citaMedica.getListaDetallada();
        for(CitaMedicaDetallada citaMedicaDetallada:citaMedicaDetalladas){
            String diag=citaMedicaDetallada.getDiagnostico();
            listaDet.addItem(diag);
        }
        Object[] datos = {citaMedica.getNumeroCita(),
            citaMedica.getPaciente().getNombre(),
            citaMedica.getPaciente().getCedula(),
            citaMedica.getPaciente().getDireccion(),
            citaMedica.getPaciente().getTelefono(),
            citaMedica.getMedico().getNombre(),
            citaMedica.getMedico().getEspecialidad(),
            citaMedica.getMedico().getLaboratoio(),
            listaDet,
            citaMedica.getFechaCita(),
            citaMedica.getPrecio()};
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
        setTitle("Listar Cita Medica");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Cita", "Paciente", "Cedula", "Direccion", "Telefono", "Doctor", "Especialidad", "Laboratorio", "Detalle Cita Medica", "Fecha", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
