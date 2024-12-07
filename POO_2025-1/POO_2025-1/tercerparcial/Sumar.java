
package mx.com.vafis.poo.tercerparcial;

/**
 * @autor Pedro Valenzuela
 * @archivo Sumar.java
 * @clase: Programacion Orientada a Objetos
 * @ciclo: 2025-1
 * @Fecha 23/Noviembre/2024
 * @Modificaciones: [ ]
 */
public class Sumar {

    public Sumar() {
//        SumaEnteros se = new SumaEnteros();
//        int res_int = se.Suma(3, 4);
//        System.out.println("res_int: " + res_int);
//        
//        
//        SumaDoubles sd = new SumaDoubles();
//        double res_double = sd.Suma(3.8, 4);
//        System.out.println("res_double: " + res_double);
//        
//        SumaStrings ss = new SumaStrings();
//        String res_string = ss.Suma("3.8", "4");
//        System.out.println("res_string: " + res_string);
        
        SumaGenerica sg = new SumaGenerica();
        
        int entero = sg.Suma(3, 4);
        double doble = sg.Suma(3.8, 4.0);
        
        String texto = sg.Suma("3.8", "4");
        
        System.out.println(entero);
        System.out.println(doble);
        System.out.println(texto);
        
        System.out.println(sg.SumaDiferentes("3.8", 4));
        System.out.println(sg.SumaDiferentes(3.8, 4));
        System.out.println(sg.SumaDiferentes(3.8, "4"));
    }
}
