/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author chris
 */
public class Cuadrado implements Figura {
    
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    
    }
        

    @Override
    public int calcularArea() {
        return lado * lado;
    }
    
}