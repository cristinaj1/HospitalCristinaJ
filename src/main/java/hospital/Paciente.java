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
 *//*Depende de Medico*/
public class Paciente extends Persona {

    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellidos, long numero, LocalDate fechaCaducidad) {
        super(nombre, apellidos, numero, fechaCaducidad);
        this.numeroHistoria = numeroHistoria;
    }

    public void tomarMedicina(String medicina) {
        System.out.println("El paciente indicado se ha tomado la medicina: " + medicina);
    }

    @Override
    public String toString() {
        return this.getNombre() +" "+ this.getApellidos();
    }

}
