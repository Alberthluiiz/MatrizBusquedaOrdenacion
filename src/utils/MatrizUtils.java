package utils;

import java.util.Random;

public class MatrizUtils {
    private static final int FILAS = 5;
    private static final int COLUMNAS = 5;
    private static final Random rand = new Random();

    public static int[][] generarMatriz() {
        int[][] matriz = new int[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = rand.nextInt(100); // Números entre 0 y 99
            }
        }
        return matriz;
    }

    // Nuevo método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz Generada:");
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.printf("%4d", num); // Formato para alineación
            }
            System.out.println();
        }
    }

    public static int[] convertirAArray(int[][] matriz) {
        int[] array = new int[FILAS * COLUMNAS];
        int index = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                array[index++] = num;
            }
        }
        return array;
    }
}
