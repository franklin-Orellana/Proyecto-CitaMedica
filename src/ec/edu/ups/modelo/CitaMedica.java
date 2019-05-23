/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author José Quinde
 */
public class CitaMedica {
    private int numeroCita;
    private Date fechaCita;
    private double precio;
    private Paciente paciente;
    private Medico medico;

    public CitaMedica() {
    }

    public CitaMedica(int numeroCita, Date fechaCita, double precio, Paciente paciente, Medico medico) {
        this.numeroCita = numeroCita;
        this.fechaCita = fechaCita;
        this.precio = precio;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(int numeroCita) {
        this.numeroCita = numeroCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "numeroCita=" + numeroCita + ", fechaCita=" + fechaCita + ", precio=" + precio + ", paciente=" + paciente + ", medico=" + medico + '}';
    }
    
    
 
}
