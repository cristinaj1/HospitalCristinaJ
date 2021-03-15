/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Cris
 */
public class Administrativos extends Empleado {

    private final TipoAdministrativos tipo;
    private ArrayList documento;

    public Administrativos(TipoAdministrativos tipo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, long numero, LocalDate fechaCaducidad) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, numero, fechaCaducidad);
        this.tipo = tipo;
    }

    public ArrayList getDocumento() {
        return documento;
    }

    public void setDocumento(ArrayList documento) {
        this.documento = documento;
    }

    public void registrarDocumento() {
        System.out.println("Se registró el documento correctamente por parte de " + this.getNombre());
    }

    @Override
    public double calcularIRPF() {
        double salario = super.getSalario();
        if (tipo.equals(tipo.GRUPO_A)) {
            double irpf = (salario * 18) / 100;
            return irpf;
        }
        double irpf = (salario * 16) / 100;
        return irpf;

    }

    @Override
    public void descansoComida() {
        System.out.println("El administrativo " + this.getNombre() + " se encuentra en su descanso de comida");
    }

    @Override
    public String toString() {
        return "Administrativo" + " con nombre: " + this.getNombre() + " del " + tipo.getNombre();
    }

}
