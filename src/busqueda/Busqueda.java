package busqueda;

public class Busqueda {
    public static int busquedaSecuencial(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i; // Retorna la posición donde se encontró
            }
        }
        return -1; // No encontrado
    }
}
