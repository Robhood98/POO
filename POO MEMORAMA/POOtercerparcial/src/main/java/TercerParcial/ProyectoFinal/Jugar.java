package TercerParcial.ProyectoFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Jugar {
    private int filas;
    private int columnas;
    private List<Tarjeta> tarjetas = new ArrayList<>();

    public Jugar(int filas, int columnas, String[] valores) {
        this.filas = filas;
        this.columnas = columnas;
        crearPares(valores);
    }

    public void loopJugar() {
        Scanner kb = new Scanner(System.in);
        boolean salirJuego = false;

        while (!salirJuego) {
            imprimirTablero();
            System.out.print("Selecciona la primera tarjeta (posición, 1 a " + tarjetas.size() + "): ");
            int pos1 = kb.nextInt() - 1;

            System.out.print("Selecciona la segunda tarjeta (posición, 1 a " + tarjetas.size() + "): ");
            int pos2 = kb.nextInt() - 1;

            if (pos1 == pos2 || pos1 < 0 || pos2 < 0 || pos1 >= tarjetas.size() || pos2 >= tarjetas.size()) {
                System.out.println("Selección inválida. Intenta de nuevo.");
                continue;
            }

            Tarjeta t1 = tarjetas.get(pos1);
            Tarjeta t2 = tarjetas.get(pos2);

            if (t1.isDescubierta() || t2.isDescubierta()) {
                System.out.println("Una o ambas tarjetas ya están descubiertas. Intenta de nuevo.");
                continue;
            }

            t1.setDescubierta(true);
            t2.setDescubierta(true);
            imprimirTablero();

            if (t1.esIgual(t2)) {
                System.out.println("¡Es un par!");
            } else {
                System.out.println("No es un par. Intenta de nuevo.");
                t1.setDescubierta(false);
                t2.setDescubierta(false);
            }

            if (todasDescubiertas()) {
                System.out.println("¡Felicidades! Has descubierto todos los pares.");
                salirJuego = true;
            }
        }
    }

    public void crearPares(String[] valores) {
        for (String valor : valores) {
            Tarjeta t1 = new Tarjeta(valor, valor);
            tarjetas.add(t1);

            Tarjeta t2 = new Tarjeta(valor, valor);
            tarjetas.add(t2);
        }

        Collections.shuffle(tarjetas);
    }

    public void imprimirTablero() {
        int index = 0;
        System.out.println("\nTablero:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (index < tarjetas.size()) {
                    Tarjeta tarjeta = tarjetas.get(index);
                    if (tarjeta.isDescubierta()) {
                        System.out.print(" " + tarjeta.getReferencia() + " ");
                    } else {
                        System.out.print(" * ");
                    }
                }
                index++;
            }
            System.out.println();
        }
    }

    public boolean todasDescubiertas() {
        for (Tarjeta tarjeta : tarjetas) {
            if (!tarjeta.isDescubierta()) {
                return false;
            }
        }
        return true;
    }
}