
package TercerParcial.ProyectoFinal;

/**
 *
 * @author kaleb
 */
class Tarjeta {
    private String nombre;
    private String referencia;
    private int posicion;
    private boolean descubierta;

    public Tarjeta(String nombre, String referencia) {
        this.nombre = nombre;
        this.referencia = referencia;
        this.posicion = -1;
        this.descubierta = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        if (posicion >= 0) {
            this.posicion = posicion;
        } else {
            throw new IllegalArgumentException("La posición no puede ser negativa");
        }
    }

    public boolean isDescubierta() {
        return descubierta;
    }

    public void setDescubierta(boolean descubierta) {
        this.descubierta = descubierta;
    }

    public boolean esIgual(Tarjeta otraTarjeta) {
        return this.referencia.equals(otraTarjeta.getReferencia());
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "nombre='" + nombre + '\'' +
                ", referencia='" + referencia + '\'' +
                ", posicion=" + posicion +
                ", descubierta=" + descubierta +
                '}';
    }
}