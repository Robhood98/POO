/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
public class Estudiante extends AsistenteClase{

    
    /**
     *
     * @param nombre
     * @param correo
     */
    public Estudiante(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }
    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    public Estudiante(String nombre, String correo, int id){
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
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
