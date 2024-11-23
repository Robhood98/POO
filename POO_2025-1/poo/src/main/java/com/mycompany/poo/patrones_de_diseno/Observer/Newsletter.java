
package patrones_de_diseno.Observer;

/**
 *
 * @author chris
 */
public interface Newsletter {
    void agregarSuscriptor(Suscriptor s);
    void eliminarSuscriptor(Suscriptor s);
    
    void notificar();
}