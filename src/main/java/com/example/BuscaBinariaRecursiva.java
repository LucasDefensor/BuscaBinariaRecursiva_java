package com.example;

public class git commit -m "first commit" {

    public static int buscaBinaria(int[] array, int elemento, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (array[meio] == elemento) {
            return meio;
        }

        if (array[meio] > elemento) {
            return buscaBinaria(array, elemento, inicio, meio - 1);
        }

        return buscaBinaria(array, elemento, meio + 1, fim);
    }
}