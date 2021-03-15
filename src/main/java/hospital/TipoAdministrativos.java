/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Cris
 */
public enum TipoAdministrativos {
    GRUPO_A("Grupo A"),
    GRUPO_B("Grupo B");
    private String nombre;

    private TipoAdministrativos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
