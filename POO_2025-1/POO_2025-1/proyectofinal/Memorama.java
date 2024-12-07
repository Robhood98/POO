
package mx.com.vafis.poo.tercerparcial.proyectofinal;

import java.util.Scanner;

/**
 *
 * @author UC
 */
public class Memorama {
    public final String MENU_PRINCIPAL = 
            """
            
            
            \t\tMEMORAMA
            
            \t1) Jugar
            \t2) Configuración
            
            \tQ) Salir
            
            """;

    public Memorama() {
        loopPrincipal();
    }
    
    public void loopPrincipal(){
        
        boolean salir = false;
            Scanner kb = new Scanner(System.in);
            
        do{
            System.out.println(MENU_PRINCIPAL);

            System.out.print("Selecciona uan opcion: ");
            String seleccion = kb.nextLine();
            
            switch (seleccion) {
                case "1":
//                    System.err.println("No se ha implementado el menu Jugar");
                    Jugar jugar = new Jugar();
                    break;
                case "2":
                    System.err.println("No se ha implementado el menu Configuracion");
                    break;
                case "Q":
                    salir = true;
                    break;
                    
                default:
                    System.err.println("La selección no es valida ...");
            }
            
        } while(!salir);
        
        System.out.println("Saliendo de MEMORAMA ...");
    }
}
