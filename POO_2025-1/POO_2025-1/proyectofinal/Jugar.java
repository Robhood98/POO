package mx.com.vafis.poo.tercerparcial.proyectofinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author UC
 */
public class Jugar {
    
    List<Tarjeta> tarjetas = new ArrayList<>();

    public Jugar() {
        loopJugar();
    }
    
    public void loopJugar(){
        // Crear y mezclar tarjetas
        crearPares();
        
        // Seleccionar tarjetas
        Scanner kb = new Scanner(System.in);
        boolean salir_juego = false;
        
        do{
        
            imprimirTablero(tarjetas);
            
            int posicionPrimerTarjeta;
            int posicionSegundaTarjeta;

            boolean seleccion1 = false;
            boolean seleccion2 = false;

            do{
                System.out.print("Selecciona primer tarjeta: ");
            }while(!seleccion1);
            do{
            }while(!seleccion2);
            System.out.println("Presiona enter para continuar ...");
            kb.nextLine();
            kb.nextLine();
            
        }while(!salir_juego);
    }
    
    public void crearPares(){
        List<String> items = Arrays.asList(
                "Mochila",
                "Cuaderno",
                "Lapiz",
                "Pluma",
                "Mouse",
                "Teclado",
                "Tablet",
                "Monitor");
        
        for(String item : items){
            Tarjeta t1 = new Tarjeta(item, item);
            tarjetas.add(t1);
            
            Tarjeta t2 = new Tarjeta(item, item);
            tarjetas.add(t2);
        }
        
//        System.out.println(tarjetas);
        Collections.shuffle(tarjetas);
//        System.err.println(tarjetas);
    }
    
    public void imprimirTablero(List<Tarjeta> tarjetas){
        int columnas = 4;
        
        System.out.println("\n\n");
        
        for(int i=0; i<tarjetas.size(); i++){
            if(i%columnas == 0){
                System.out.println("\n\n");
            } else {
                System.out.print("\t");
            }
            
//            tarjetas.get(i).setParEncontrado(true); // Voltear tarjeta
            
            if(tarjetas.get(i).isParEncontrado()){
                System.out.print(String.format("%3s", i+1 + ")") + formatear(tarjetas.get(i).getNombre(), 10));
//                System.out.print(formatear(tarjetas.get(i).getNombre(), 10));
            }else{
                System.out.print(String.format("%3s", i+1 + ")") + "??????????");
//                System.out.print("??????????");
                
            }
        }
        
        System.out.println("\n\nSelecciona 0 para salir ...");
        System.out.println("\n\n");
        
    }
    
    public String formatear(String palabra, int tamano){
        if(palabra.length() >= tamano){
            return palabra.substring(0, 11);
        }
        
        int espacios = tamano - palabra.length();
        int inicio = espacios / 2;
        int fin = espacios - inicio;
        
        return " ".repeat(inicio) + palabra + " ".repeat(fin);
    }
}
