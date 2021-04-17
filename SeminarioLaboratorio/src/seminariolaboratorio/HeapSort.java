/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminariolaboratorio;

/**
 *
 * @author TuRaN
 */
public class HeapSort extends Ordenacao {

    @Override
    public int[][] executar(int[] vetor) {
        
        int[][] array = new int[2][];
        
        long timeIn = System.nanoTime();
        
        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            ordenarHeap(vetor, n, i);
        }

        for (int j = n - 1; j > 0; j--) {
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;

            ordenarHeap(vetor, j, 0);
        }
        
        long timeFn = System.nanoTime();
        int[] resultado = new int[1];
        resultado[0] = (int) (timeFn-timeIn);
        array[0] = vetor;
        array[1] = resultado;
        return array;
    }

    public static void ordenarHeap(int[] vetor, int n, int i) {
        int pai = i;
        int filhoEsquerda = 2 * i + 1;
        int filhoDireita = 2 * i + 2;

        if (filhoEsquerda < n && vetor[filhoEsquerda] > vetor[pai]) {
            pai = filhoEsquerda;

        }
        if (filhoDireita < n && vetor[filhoDireita] > vetor[pai]) {
            pai = filhoDireita;

        }
        if (pai != i) {
            int aux = vetor[i];
            vetor[i] = vetor[pai];
            vetor[pai] = aux;

            ordenarHeap(vetor, n, pai);
        }

    }

}
