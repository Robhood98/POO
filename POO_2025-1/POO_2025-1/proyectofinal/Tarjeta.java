
package mx.com.vafis.poo.tercerparcial.proyectofinal;

/**
 *
 * @author UC
 */
public class Tarjeta {
    private String nombre;
    private String referencia;
    private int posicion;
    private boolean parEncontrado;

    public Tarjeta(String nombre, String referencia) {
        this.nombre = nombre;
        this.referencia = referencia;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setParEncontrado(boolean parEncontrado) {
        this.parEncontrado = parEncontrado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean isParEncontrado() {
        return parEncontrado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
