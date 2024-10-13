/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author chris
 */
public abstract class Circulo implements Figura {
    private final int radio;

    // Constructor para inicializar el radio del círculo
    public Circulo(int radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea() para un círculo
    
    public int calcularRadio() {
        // Fórmula del área de un círculo: π * r^2 (Aproximamos pi como 3)
        return (int) (Math.PI * radio * radio);
    }
}
