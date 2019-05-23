/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.modelo;

/**
 *
 * @author José Quinde
 */
public class CitaMedicaDetallada {
    //Declaracion variable
    private String diagnostico;
    private Receta receta;

    /*
    Constructor vacio
     */
    public CitaMedicaDetallada() {
    }

    /*
    Constructor con todos los datos
     */
    public CitaMedicaDetallada(String diagnostico, Receta receta) {
        this.diagnostico = diagnostico;
        this.receta = receta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return "CitaMedicaDetallada{" + "diagnostico=" + diagnostico + ", receta=" + receta + '}';
    }
    
    
    
}

