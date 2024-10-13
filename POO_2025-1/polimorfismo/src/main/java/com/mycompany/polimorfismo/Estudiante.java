

package com.mycompany.polimorfismo;

/**
 *
 * @author chris
 */
public class Estudiante extends AsistenteClase{

    String nombre;
    String correo;
    
    /**
     *
     * @param nombre
     * @param correo
     */
    public Estudiante(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }
    
    @Override
    public void presentacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void examen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void proyecto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Estudiante(" + nombre + ", " + correo + ")";
    }    
}