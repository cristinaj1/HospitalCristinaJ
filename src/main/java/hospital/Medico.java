/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.time.LocalDate;

/**
 *
 * @author Cris
 */
public class Medico extends Empleado {

    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, long numero, LocalDate fechaCaducidad) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, numero, fechaCaducidad);
        this.especialidad = especialidad;
    }

    public void tratar(Paciente a, String medicina) {
        System.out.println("El paciente " + a + " debe de tomarse " + medicina + " por parte del médico: " + this.getNombre() + " " + this.getApellidos());
        a.tomarMedicina(medicina);
    }

    @Override
    public double calcularIRPF() {
        double salario = super.getSalario();
        Medico.super.getSalario();
        double irpf = (salario * 21) / 100;
        return irpf;
    }

    @Override
    public void descansoComida() {
        System.out.println("El medico " + this.getNombre() + " se encuentra en su descanso de comida");
    }

    @Override
    public String toString() {
        return "Médico con nombre: " + this.getNombre() + " con especialidad: " + especialidad;
    }

}
