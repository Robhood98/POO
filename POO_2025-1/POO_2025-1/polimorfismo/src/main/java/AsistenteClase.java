/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
public abstract class AsistenteClase {
    
    String nombre;
    String correo;
    protected int id;
    private String contra;
    
    public abstract void presentacion();
    public abstract void examen();
    public abstract void proyecto();
    
    public void setContra(String contra){
        this.contra = contra;
    }
}