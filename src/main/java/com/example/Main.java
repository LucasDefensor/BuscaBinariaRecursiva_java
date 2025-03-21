package com.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int elemento = 7;
        int indice = BuscaBinariaRecursiva.buscaBinaria(array, elemento, 0, array.length - 1);

        if (indice != -1) {
            System.out.println("Elemento " + elemento + " encontrado no índice: " + indice);
        } else {
            System.out.println("Elemento " + elemento + " não encontrado no array.");
        }
    }
}