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
public class InsertionSort extends Ordenacao{

    @Override
    public int[][] executar(int[] numeros) {
        int[][] array = new int[2][];
        return this.ordenarInsertion(array, numeros);
        
    }
    private int[][] ordenarInsertion(int[][] array, int[] numeros){
        
        long timeIn = System.nanoTime();
        
        for(int i = 1; i < numeros.length; i++){
            
            int j = i;
            
            while(j > 0 && numeros[j] < numeros[j-1]){
                int aux = numeros[j];
                numeros[j] = numeros[j-1];
                numeros[j-1] = aux;
                j--;
            }
            
        }
        long timeFn = System.nanoTime();
        int[] resultado = new int[1];
        resultado[0] = (int) (timeFn-timeIn);
        array[0] = numeros;
        array[1] = resultado;
        return array;
    }
    
}
