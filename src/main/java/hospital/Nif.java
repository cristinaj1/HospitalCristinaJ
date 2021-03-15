/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Nif {
    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public Nif(long numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }

    private char calculaLetra(String numero) {
        char aux;
        switch (Integer.parseInt(numero) % 23) {
            case 0:
                aux = 'T';
                break;
            case 1:
                aux = 'R';
                break;
            case 2:
                aux = 'W';
                break;
            case 3:
                aux = 'A';
                break;
            case 4:
                aux = 'G';
                break;
            case 5:
                aux = 'M';
                break;
            case 6:
                aux = 'Y';
                break;
            case 7:
                aux = 'F';
                break;
            case 8:
                aux = 'P';
                break;
            case 9:
                aux = 'D';
                break;
            case 10:
                aux= 'X';
                break;
            case 11:
                aux = 'B';
                break;
            case 12:
                aux = 'N';
                break;
            case 13:
                aux = 'J';
                break;
            case 14:
                aux = 'Z';
                break;
            case 15:
                aux = 'S';
                break;
            case 16:
                aux = 'Q';
                break;
            case 17:
                aux = 'V';
                break;
            case 18:
                aux = 'H';
                break;
            case 19:
                aux = 'L';
                break;
            case 20:
                aux= 'C';
                break;
            case 21:
                aux = 'K';
                break;
            default:
                aux = 'E';
                break;
        }
        return aux;
    }
    @Override
    public String toString() {
        return numero + "-" + letra;
    }
    public LocalDate renovar(LocalDate fechaSolicitud){
        LocalDate ano = fechaSolicitud.plusYears(10);
        return ano;
    }

}


