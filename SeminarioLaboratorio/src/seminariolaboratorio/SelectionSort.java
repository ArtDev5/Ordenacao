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
public class SelectionSort extends Ordenacao{

    @Override
    public int[][] executar(int[] numeros) {
        
        int[][] array = new int[2][];
        
        long timeIn = System.nanoTime();
        
        int n = numeros.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++){
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (numeros[j] < numeros[min_idx])
                    min_idx = j;
            }
            // Swap the found minimum element with the first
            // element
            int temp = numeros[min_idx];
            numeros[min_idx] = numeros[i];
            numeros[i] = temp;
        }
        
        
        long timeFn = System.nanoTime();
        int[] resultado = new int[1];
        resultado[0] = (int) (timeFn-timeIn);
        array[0] = numeros;
        array[1] = resultado;
        return array;
    }
    
}
