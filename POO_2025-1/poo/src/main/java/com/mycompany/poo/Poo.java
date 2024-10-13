
package com.mycompany.poo;

import com.mycompany.animales.Animal;
import com.mycompany.animales.Perro;
import com.mycompany.figuras.Cuadrado;
import com.mycompany.figuras.Figura;
import com.mycompany.polimorfismo.Estudiante;
import com.mycompany.polimorfismo.Profesor;

public class POO {

    public static void main(String[] args) {
        
        Profesor profesor = new Profesor("Pedro Valenzuela", "jvalenzuela@ucgdl.edu.mx");
        System.out.println(profesor);
        //profesor.presentacion();
        
        Estudiante estudiante1 = new Estudiante("Jose", "jose@mail.com");
        System.out.println(estudiante1);
        //estudiante1.presentacion();
        
        Estudiante estudiante2 = new Estudiante("", "maria@mail.com");
        System.out.println(estudiante2);
        
        Estudiante estudiante3 = new Estudiante("Juan", "juan@mail.com");
        System.out.println(estudiante3);
    }
}