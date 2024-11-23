
package patrones_de_diseno.Observer;

/**
 *
 * @author chris
 */

import java.util.ArrayList;
import java.util.List;

public class Manager implements Newsletter{

    private List<Suscriptor> suscriptores = new ArrayList<>();
    private String ultimaNewsletter;
    
    @Override
    public void agregarSuscriptor(Suscriptor s) {
        suscriptores.add(s);
    }

    @Override
    public void eliminarSuscriptor(Suscriptor s) {
        suscriptores.remove(s);
    }

    @Override
    public void notificar() {
        for(Suscriptor s : suscriptores){
            s.actualizar(ultimaNewsletter);
        }
    }
    
    public void publicarNewsletter(String contenido){
        this.ultimaNewsletter = contenido;
        
        notificar();
    }
    
}