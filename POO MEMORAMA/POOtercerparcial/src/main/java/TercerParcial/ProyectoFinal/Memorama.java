
package TercerParcial.ProyectoFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Memorama {
    public final String MENU_PRINCIPAL = 
            """
            
            \t\tMEMORAMA
            
            \t1) Jugar
            \t2) Configuración
            \tQ) Salir
            
            """;

    private int filas = 4; // Tamaño predeterminado
    private int columnas = 4;
    private String[] valores = {"A", "B", "C", "D", "E", "F", "G", "H"}; // Valores predeterminados

    public Memorama() {
        loopPrincipal();
    }

    public void loopPrincipal() {
        boolean salir = false;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.println(MENU_PRINCIPAL);

            System.out.print("Selecciona una opción: ");
            String seleccion = kb.nextLine().trim().toUpperCase();

            switch (seleccion) {
                case "1":
                    System.out.println("Iniciando el juego...");
                    iniciarJuego();
                    break;
                case "2":
                    menuConfiguracion();
                    break;
                case "Q":
                    salir = true;
                    break;
                default:
                    System.err.println("La selección no es válida. Intenta de nuevo.");
            }
        } while (!salir);

        System.out.println("Saliendo de MEMORAMA...");
    }

    private void iniciarJuego() {
        if (valores.length < (filas * columnas) / 2) {
            System.err.println("Error: No hay suficientes valores para el tamaño del tablero.");
            return;
        }

        String[] valoresUtilizados = generarValores(filas, columnas, valores);
        Jugar jugar = new Jugar(filas, columnas, valoresUtilizados);
        jugar.loopJugar();
    }

    private void menuConfiguracion() {
        Scanner kb = new Scanner(System.in);

        System.out.println("\nCONFIGURACIÓN:");
        System.out.println("1) Cambiar tamaño del tablero (actual: " + filas + "x" + columnas + ")");
        System.out.println("2) Cambiar valores de las tarjetas");
        System.out.println("Q) Volver al menú principal");
        System.out.print("Selecciona una opción: ");
        String seleccion = kb.nextLine().trim().toUpperCase();

        switch (seleccion) {
            case "1":
                cambiarTamanioTablero(kb);
                break;
            case "2":
                cambiarValoresTarjetas(kb);
                break;
            case "Q":
                return;
            default:
                System.err.println("Selección no válida.");
        }
    }

    private void cambiarTamanioTablero(Scanner kb) {
        System.out.print("Introduce el número de filas: ");
        filas = kb.nextInt();
        System.out.print("Introduce el número de columnas: ");
        columnas = kb.nextInt();
        kb.nextLine(); // Limpiar buffer
        System.out.println("El tamaño del tablero se ha cambiado a " + filas + "x" + columnas);
    }

    private void cambiarValoresTarjetas(Scanner kb) {
        System.out.println("Introduce los valores separados por comas (ejemplo: Sol,Luna,Estrella): ");
        String entrada = kb.nextLine();
        valores = entrada.split(",");
        System.out.println("Los valores de las tarjetas se han actualizado.");
    }

    private String[] generarValores(int filas, int columnas, String[] valores) {
        int totalCartas = filas * columnas;
        List<String> seleccionados = new ArrayList<>();

        for (int i = 0; i < totalCartas / 2; i++) {
            seleccionados.add(valores[i % valores.length]);
            seleccionados.add(valores[i % valores.length]);
        }

        Collections.shuffle(seleccionados);
        return seleccionados.toArray(new String[0]);
    }
}
