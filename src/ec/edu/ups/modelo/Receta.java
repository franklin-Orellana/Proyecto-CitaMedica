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
   private int codigo;
   private Paciente paciente;
   private CitaMedica citaMedica;
   private Medicina medicina;

   //creacion de constructores
   public Receta(){
       
   }

    public Receta(int codigo, Paciente paciente, CitaMedica citaMedica, Medicina medicina) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.citaMedica = citaMedica;
        this.medicina = medicina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return "Receta{" + "codigo=" + codigo + ", paciente=" + paciente + ", citaMedica=" + citaMedica + ", medicina=" + medicina + '}';
    }
   
}
