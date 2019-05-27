/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Quezada Bryam
 */
public class Receta {
    //declaracion de atributos
   private Paciente paciente;
   private CitaMedica citaMedica;
   private Medicina medicina;

   //creacion de constructores
   public Receta(){
       
   }
   
    public Receta(Paciente paciente, CitaMedica citaMedica, Medicina medicina) {
        this.paciente = paciente;
        this.citaMedica = citaMedica;
        this.medicina = medicina;
    }

    //creacion de getters y setters 
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    public Medicina getMedicina() {
        return medicina;
    }

    public void setMedicina(Medicina medicina) {
        this.medicina = medicina;
    }
    //devuelve el toString
    @Override
    public String toString() {
        return "Receta{" + "paciente=" + paciente + ", citaMedica=" + citaMedica + ", medicina=" + medicina + '}';
    }

    public void setCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
