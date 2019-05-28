/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorCitaMedica;
import ec.edu.ups.controladores.ControladorCitaMedicaDetallada;
import ec.edu.ups.controladores.ControladorMedicina;
import ec.edu.ups.vista.medico.VentanaCrearMedico;
import ec.edu.ups.vista.medico.VentanaBuscarMedico;
import ec.edu.ups.vista.medico.VentanaEliminarMedico;
import ec.edu.ups.vista.medico.VentanaActualizarMedico;
import ec.edu.ups.vista.medico.VentanaListarMedico;
import ec.edu.ups.controladores.ControladorPaciente;
import ec.edu.ups.controladores.ControladorMedico;
import ec.edu.ups.controladores.ControladorReceta;
import ec.edu.ups.vista.citaMedica.VentanaBuscarCitaMedica;
import ec.edu.ups.vista.citaMedica.VentanaCrearCitaMedica;
import ec.edu.ups.vista.medicina.VentanaActualizarMedicina;
import ec.edu.ups.vista.medicina.VentanaBuscarMedicina;
import ec.edu.ups.vista.medicina.VentanaCrearMedicina;
import ec.edu.ups.vista.medicina.VentanaEliminarMedicina;
import ec.edu.ups.vista.medicina.VentanaListarMedicina;

/**
 *
 * @author Fernanda
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaCrearMedico ventanaCrearPaciente;
    private VentanaBuscarMedico ventanaBuscarMedico;
    private VentanaActualizarMedico ventanaActualizarMedico;
    private VentanaEliminarMedico ventanaEliminarMedico;
    private VentanaListarMedico ventanaListarMedico;
    private ControladorPaciente controladorPaciente;
    private ControladorMedico controladorMedico;
    private ControladorCitaMedica controladorCitaMedica;
private ControladorCitaMedicaDetallada controladorCitaMedicaDetallada;
private VentanaCrearCitaMedica ventanaCrearCitaMedica;
    private VentanaBuscarCitaMedica ventanaBuscarCitaMedica;
    private VentanaCrearMedicina ventanaCrearMedicina;
    private VentanaBuscarMedicina ventanaBuscarMedicina;
    private VentanaActualizarMedicina ventanaActualizarMedicina;
    private VentanaEliminarMedicina ventanaEliminarMedicina;
    private VentanaListarMedicina ventanaListarMedicina;
    private ControladorMedicina controladorMedicina;
    private ControladorReceta controladorReceta;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        controladorMedico = new ControladorMedico();
        controladorPaciente = new ControladorPaciente();

        controladorMedicina = new ControladorMedicina();
        controladorReceta = new ControladorReceta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        exitMenuItem1 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem1 = new javax.swing.JMenuItem();
        aboutMenuItem2 = new javax.swing.JMenuItem();
        aboutMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setBorder(null);
        menuBar.setForeground(new java.awt.Color(153, 102, 255));

        fileMenu.setMnemonic('f');
        fileMenu.setText("PACIENTE");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuCrear.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("CREAR");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuBuscar.png"))); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("BUSCAR");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuActualizar.png"))); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("ACTUALIZAR");
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuListar.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("LISTAR");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        exitMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuEliminar.png"))); // NOI18N
        exitMenuItem1.setMnemonic('x');
        exitMenuItem1.setText("ELIMINAR");
        exitMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem1);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("MEDICO");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuCrear.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("CREAR");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuBuscar.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("BUSCAR");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuActualizar.png"))); // NOI18N
        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("ACTUALIZAR");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        deleteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuListar.png"))); // NOI18N
        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("LISTAR");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        deleteMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        deleteMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuEliminar.png"))); // NOI18N
        deleteMenuItem1.setMnemonic('d');
        deleteMenuItem1.setText("ELIMINAR");
        deleteMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem1);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("MEDICINA");

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuCrear.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("CREAR");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuBuscar.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("BUSCAR");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        aboutMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuActualizar.png"))); // NOI18N
        aboutMenuItem1.setMnemonic('a');
        aboutMenuItem1.setText("ACTUALIZAR");
        aboutMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem1);

        aboutMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuListar.png"))); // NOI18N
        aboutMenuItem2.setMnemonic('a');
        aboutMenuItem2.setText("LISTA");
        aboutMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem2ActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem2);

        aboutMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuEliminar.png"))); // NOI18N
        aboutMenuItem3.setMnemonic('a');
        aboutMenuItem3.setText("ELIMINAR");
        aboutMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem3ActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem3);

        menuBar.add(helpMenu);

        jMenu1.setText("CITA MEDICA");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuCrear.png"))); // NOI18N
        jMenuItem1.setText("CREAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuBuscar.png"))); // NOI18N
        jMenuItem2.setText("BUSCAR");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuEliminar.png"))); // NOI18N
        jMenuItem3.setText("ELIMINAR");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/BotonMenuListar.png"))); // NOI18N
        jMenuItem4.setText("LISTAR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void exitMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMenuItem1ActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:

        ventanaCrearPaciente = new VentanaCrearMedico(controladorMedico);
        ventanaCrearPaciente.setVisible(true);
        desktopPane.add(ventanaCrearPaciente);

    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
        ventanaBuscarMedico = new VentanaBuscarMedico(controladorMedico);
        ventanaBuscarMedico.setVisible(true);
        desktopPane.add(ventanaBuscarMedico);

    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        // TODO add your handling code here:

        ventanaActualizarMedico = new VentanaActualizarMedico(controladorMedico);
        ventanaActualizarMedico.setVisible(true);
        desktopPane.add(ventanaActualizarMedico);

    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void deleteMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItem1ActionPerformed
        // TODO add your handling code here:

        ventanaEliminarMedico = new VentanaEliminarMedico(controladorMedico);
        ventanaEliminarMedico.setVisible(true);
        desktopPane.add(ventanaEliminarMedico);

    }//GEN-LAST:event_deleteMenuItem1ActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:

        ventanaListarMedico = new VentanaListarMedico(controladorMedico);
        ventanaListarMedico.setVisible(true);
        desktopPane.add(ventanaListarMedico);

    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        ventanaCrearMedicina = new VentanaCrearMedicina(controladorMedicina);
        ventanaCrearMedicina.setVisible(true);
        desktopPane.add(ventanaCrearMedicina);

    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void aboutMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem3ActionPerformed
        // TODO add your handling code here:
        ventanaEliminarMedicina = new VentanaEliminarMedicina(controladorMedicina);
        ventanaEliminarMedicina.setVisible(true);
        desktopPane.add(ventanaEliminarMedicina);

    }//GEN-LAST:event_aboutMenuItem3ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:

        ventanaBuscarMedicina = new VentanaBuscarMedicina(controladorMedicina);
        ventanaBuscarMedicina.setVisible(true);
        desktopPane.add(ventanaBuscarMedicina);

    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void aboutMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem1ActionPerformed
        // TODO add your handling code here:

        ventanaActualizarMedicina = new VentanaActualizarMedicina(controladorMedicina);
        ventanaActualizarMedicina.setVisible(true);
        desktopPane.add(ventanaActualizarMedicina);

    }//GEN-LAST:event_aboutMenuItem1ActionPerformed

    private void aboutMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem2ActionPerformed
        // TODO add your handling code here:

        ventanaListarMedicina = new VentanaListarMedicina(controladorMedicina);
        ventanaListarMedicina.setVisible(true);
        desktopPane.add(ventanaListarMedicina);

    }//GEN-LAST:event_aboutMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
          if(ventanaCrearCitaMedica == null || !ventanaCrearCitaMedica.isVisible()){
        ventanaCrearCitaMedica = new VentanaCrearCitaMedica(controladorCitaMedica, controladorCitaMedicaDetallada, controladorPaciente, controladorMedico);
        ventanaCrearCitaMedica.setVisible(true);
        desktopPane.add(ventanaCrearCitaMedica);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
           if(ventanaBuscarCitaMedica == null || !ventanaBuscarCitaMedica.isVisible()){
        ventanaBuscarCitaMedica=new VentanaBuscarCitaMedica(controladorCitaMedica, controladorCitaMedicaDetallada, controladorPaciente, controladorMedico);
        ventanaBuscarCitaMedica.setVisible(true);
        desktopPane.add(ventanaBuscarCitaMedica);
       }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem aboutMenuItem1;
    private javax.swing.JMenuItem aboutMenuItem2;
    private javax.swing.JMenuItem aboutMenuItem3;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem deleteMenuItem1;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exitMenuItem1;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
