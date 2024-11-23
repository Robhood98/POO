
package patrones_de_diseno.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author chris
 */
public class Tarea4 implements Tarea {
    public void proceso(){
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tarea4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ejecutar() {
        proceso();
    }
}