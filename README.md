# Proyecto de Búsqueda y Ordenación

Este proyecto en Java implementa diversas funcionalidades relacionadas con la búsqueda y ordenación de datos en matrices. Incluye la creación de matrices aleatorias, la conversión de matrices a arreglos unidimensionales, y la ejecución de algoritmos de búsqueda y ordenación.

## Funcionalidades

### 1. Búsqueda Secuencial
El proyecto implementa un algoritmo de **búsqueda secuencial** para encontrar un valor dentro de un arreglo. Si el valor se encuentra, se retorna la posición, si no, retorna `-1`.

### 2. Generación y Conversión de Matrices
Se genera una **matriz de 5x5** con valores aleatorios entre 0 y 99, y se convierte a un arreglo unidimensional para facilitar su manipulación.

### 3. Ordenación
El algoritmo de **Bubble Sort** se utiliza para ordenar el arreglo de menor a mayor. Además, se mide el tiempo de ejecución del algoritmo para evaluar su rendimiento.

## Estructura del Proyecto

- **Busqueda.java**: Implementación de la búsqueda secuencial.
- **Main.java**: Clase principal donde se ejecutan las operaciones de matriz, búsqueda y ordenación.
- **Ordenacion.java**: Implementación del algoritmo Bubble Sort.
- **MatrizUtils.java**: Métodos para generar, imprimir y convertir matrices.

## Ejecución

1. Se genera una matriz aleatoria de 5x5.
2. La matriz es convertida a un arreglo unidimensional.
3. Se realiza una búsqueda secuencial del primer elemento de la matriz en el arreglo.
4. Se mide el tiempo que toma ordenar el arreglo utilizando **Bubble Sort**.


