package main;

import utils.MatrizUtils;
import busqueda.Busqueda;
import ordenacion.Ordenacion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Generar matriz
        int[][] matriz = MatrizUtils.generarMatriz();

        // Imprimir la matriz antes de convertirla a array
        MatrizUtils.imprimirMatriz(matriz);

        // Convertir matriz a array unidimensional
        int[] arrayPlano = MatrizUtils.convertirAArray(matriz);

        System.out.println("\nMatriz generada. Iniciando búsquedas y ordenaciones...\n");

        // Ejemplo de búsqueda
        int x = matriz[0][0];
        System.out.println("Buscando número: " + x);
        System.out.println("Búsqueda Secuencial: " + Busqueda.busquedaSecuencial(arrayPlano, x));

        // Ordenación con medición de tiempo
        medirTiempoOrdenacion("Bubble Sort", arrayPlano, () -> Ordenacion.bubbleSort(arrayPlano));
    }

    // Método para medir tiempo de ejecución
    public static void medirTiempoOrdenacion(String metodo, int[] array, Runnable ordenacion) {
        int[] copia = Arrays.copyOf(array, array.length); // Copia del array original
        long inicio = System.nanoTime();
        ordenacion.run();
        long fin = System.nanoTime();
        System.out.println(metodo + " tomó " + (fin - inicio) / 1e6 + " ms");
        System.arraycopy(copia, 0, array, 0, array.length); // Restaurar el array original
    }
}
