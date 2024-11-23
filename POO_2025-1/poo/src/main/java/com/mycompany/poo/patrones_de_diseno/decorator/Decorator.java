
package patrones_de_diseno.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chris
 */
public class Decorator implements Tarea{
    private Tarea t;
    
    public Decorator(Tarea tarea){
        t = tarea;
    }

    @Override
    public void ejecutar() {
        long inicio = System.nanoTime();
        t.ejecutar();
        long fin = System.nanoTime();
        
        System.out.println("Tiempo de ejecución: " + (fin-inicio) );
    }
}