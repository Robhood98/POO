
package patrones_de_diseno.decorator;

/**
 *
 * @author chris
 */
public class PrimoOptimizado implements Tarea{
    private final int numero;
    
    public PrimoOptimizado(int n){
        numero = n;
    }
    
    public boolean esPrimo(){
        for(int i=2; i<Math.sqrt(numero); i++){
            if(numero%i == 0){
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void ejecutar() {
        esPrimo();
    }
}