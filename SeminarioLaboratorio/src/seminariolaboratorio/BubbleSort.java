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
public class BubbleSort extends Ordenacao{

    @Override
    public int[][] executar(int[] numeros) {
        int valor = numeros.length-1;
        int[][] array = new int[2][];
        return this.ordenarBubble(array, numeros, valor);
    }
    
    private int[][] ordenarBubble(int[][] array, int[] numeros, int valor){
        
        long timeIn = System.nanoTime();
        int quantidade = valor; // variavel criada para contar no tempo, pois
        // a variavel que pega a quantidade de valores está fora do escopo
        
        for(int i = 0; i < quantidade; i++){
            
            if (numeros[i] > numeros[i+1]){
                int aux = numeros[i];
                numeros[i] = numeros[i+1];
                numeros[i+1] = aux;
            }
        }
        if (quantidade > 1){
            ordenarBubble(array, numeros, quantidade-1);
        }
        
        long timeFn = System.nanoTime();
        int[] resultado = new int[1];
        resultado[0] = (int) (timeFn-timeIn);
        array[0] = numeros;
        array[1] = resultado;
        return array;
    }
    
}
