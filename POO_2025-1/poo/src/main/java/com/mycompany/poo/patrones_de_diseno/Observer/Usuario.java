
package patrones_de_diseno.Observer;

/**
 *
 * @author chris
 */
public class Usuario implements Suscriptor {
    private String nombre;
    
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(String contenido) {
        System.out.println(nombre + ", has recibido una newsletter: ");
        System.out.println(contenido);
    }
    
}
