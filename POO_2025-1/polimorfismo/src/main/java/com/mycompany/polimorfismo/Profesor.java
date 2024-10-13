
package com.mycompany.polimorfismo;

/**
 *
 * @author chris
 */
public class Profesor extends AsistenteClase{

    String nombre;
    String correo;
    
    public Profesor(String nombre, String correo){
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
        return "Profesor(" + nombre + ", " + correo + ")";
    }
    
    
}