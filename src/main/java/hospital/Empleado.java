/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Cris
 */
public abstract class Empleado extends Persona {

    private String numeroSeguridadSocial;
    private double salario;

    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellidos, long numero, LocalDate fechaCaducidad) {
        super(nombre, apellidos, numero, fechaCaducidad);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public double calcularIRPF() {
        double irpf = (salario * 12) / 100;
        return irpf;
    }

    ;

    public abstract void descansoComida();

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //Quitar Equals y HashCode

    @Override
    public String toString() {
        return "Empleado{" + "numeroSeguridadSocial=" + numeroSeguridadSocial + ", salario=" + salario + '}';
    }

}
