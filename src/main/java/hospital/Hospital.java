/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Cris
 */
public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamas;
    private Set<Empleado> empleado;
    private Set<Paciente> pacientes;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.empleado = new HashSet<>();
        this.pacientes = new HashSet<>();
    }

    public void contratarEmpleado(Empleado emp) {
        empleado.add(emp);
        System.out.println("Se ha contratado al empleado " + emp + " correctamente");
    }

    public void ingresarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Se ha ingresado al paciente " + paciente + " correctamente");
    }

}
