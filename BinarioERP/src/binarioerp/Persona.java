/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarioerp;

/**
 *
 * @author alumnossur
 */
public class Persona {
    private int rut;
    private char dv;
    private String nombre;
    
    Persona(int rut, char dv, String nombre) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
    }
    
    Persona() {
        this.rut = 12345678;
        this.dv = 'K';
        this.nombre = "Anggelo";
    }
}
