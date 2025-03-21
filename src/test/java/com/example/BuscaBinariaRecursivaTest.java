package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BuscaBinariaRecursivaTest {

    @Test
    public void testBuscaBinaria() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int resultado = BuscaBinariaRecursiva.buscaBinaria(array, 7, 0, array.length - 1);
        assertEquals(3, resultado); // Verifica se o índice do elemento 7 é 3
    }

    @Test
    public void testElementoNaoEncontrado() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int resultado = BuscaBinariaRecursiva.buscaBinaria(array, 10, 0, array.length - 1);
        assertEquals(-1, resultado); // Verifica se o elemento 10 não foi encontrado
    }
}