package ec.edu.ups.modelo;

public class Paciente {

private String sintomas;

    public Paciente() {
    }

    public Paciente(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Paciente{" + "sintomas=" + sintomas + '}';
    }

}
