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
public class Persona extends Nif {

    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos, long numero, LocalDate fechaCaducidad) {
        super(numero, fechaCaducidad);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos;
    }
    

    public void renovarNIF(LocalDate fechaSolicitud) {
        LocalDate ano = fechaSolicitud.plusYears(10);
        System.out.println("Lo tiene que renovar en el año: " + ano);
    }
}
