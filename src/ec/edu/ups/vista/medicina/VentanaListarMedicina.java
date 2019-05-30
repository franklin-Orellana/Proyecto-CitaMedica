/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.medicina;

/**
 *
 * @author 59398
 */
import ec.edu.ups.controladores.ControladorMedicina;
import ec.edu.ups.modelo.Medicina;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
public class VentanaListarMedicina extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaListarMedicina
     */
    private ControladorMedicina controladorMedicina;
    public static DefaultTableModel modelo;
    private Locale localizacion;
    private static ResourceBundle mensajes;
    public VentanaListarMedicina(ControladorMedicina controladorMedicina) {
        initComponents();
        this.controladorMedicina = controladorMedicina;
        modelo = new DefaultTableModel();
        Object[] columnas ={"Codigo","Nombre","Marca","Descripcion","Precio"};
        modelo.setColumnIdentifiers(columnas);
        tabla.setModel(modelo);
        llenarTabla();        
    }
    public static void cambiarIdioma(Locale localizacion){
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        Object[] columnas = {mensajes.getString("codigo"),mensajes.getString("nombre"), mensajes.getString("marca"),mensajes.getString("descripcion"),mensajes.getString("precio")};
        modelo.setColumnIdentifiers(columnas);
    }
    public void llenarTabla(){
    Set<Medicina> Lista = controladorMedicina.getLista();
    for(Medicina medicina : Lista){
        Object[] datos = {medicina.getCodigo(),
            medicina.getNombre(),
            medicina.getMarca(),
            medicina.getDescripcion(),
            medicina.getPrecio()};
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

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE", "MARCA", "DESCRIPCIÓN", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
