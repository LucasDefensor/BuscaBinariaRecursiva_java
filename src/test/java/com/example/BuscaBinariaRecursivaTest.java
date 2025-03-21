package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BuscaBinariaRecursivaTest {

    @Test
    public void testBuscaBinaria_ElementoNoMeio() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int resultado = BuscaBinariaRecursiva.buscaBinaria(array, 7, 0, array.length - 1);
        assertEquals(3, resultado); // Verifica se o índice do elemento 7 é 3
    }

    @Test
    public void testBuscaBinaria_ElementoNoInicio() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int resultado = BuscaBinariaRecursiva.buscaBinaria(array, 1, 0, array.length - 1);
        assertEquals(0, resultado); // Verifica se o índice do elemento 1 é 0
    }

    @Test
    public void testBuscaBinaria_ElementoNoFim() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int resultado = BuscaBinariaRecursiva.buscaBinaria(array, 15, 0, array.length - 1);
        assertEquals(7, resultado); // Verifica se o índice do elemento 15 é 7
    }

    @Test
    public void testBuscaBinaria_ElementoNaoEncontrado() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int resultado = BuscaBinariaRecursiva.buscaBinaria(array, 10, 0, array.length - 1);
        assertEquals(-1, resultado); // Verifica se o elemento 10 não foi encontrado
    }

    @Test
    public void testBuscaBinaria_ArrayVazio() {
        int[] array = {};
        int resultado = BuscaBinariaRecursiva.buscaBinaria(array, 7, 0, array.length - 1);
        assertEquals(-1, resultado); // Verifica se a busca em um array vazio retorna -1
    }
}