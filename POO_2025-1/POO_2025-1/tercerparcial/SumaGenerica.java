
package mx.com.vafis.poo.tercerparcial;

/**
 * @autor Pedro Valenzuela
 * @archivo SumaGenerica.java
 * @clase: Programacion Orientada a Objetos
 * @ciclo: 2025-1
 * @Fecha 23/Noviembre/2024
 * @Modificaciones: [ ]
 */
public class SumaGenerica {
    public <T> T Suma(T a, T b){
        
        T res = null;
        
        if(a instanceof Integer){
            Integer sum = (Integer) a + (Integer) b;
            res = (T) sum;
        } else if(a instanceof Double){
            Double sum = (Double) a + (Double) b;
            res = (T) sum;
        } else if (a instanceof String){
            String sum = (String) a + (String) b;
            res = (T) sum;
        }
        
        return res;
    }
    
    public <T, U> String SumaDiferentes(T a, U b){
        
        Double res = Double.parseDouble(a.toString()) + Double.parseDouble(b.toString());
        return res.toString();
    }
}
