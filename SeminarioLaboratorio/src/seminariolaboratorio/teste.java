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
public class teste {
    
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * 100);
        }
        
        System.out.print("\nDesordenado\n");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " - ");
        }
        
        int n = vetor.length;
        for(int i = n/2 -1; i >= 0; i--){
            realizarHeapsort(vetor, n, i);
        }
        
        System.out.print("\nSemi Ordenado\n");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " - ");
        }
        
        for(int j = n-1; j > 0; j--){
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;
            
            realizarHeapsort(vetor, j, 0);
        }
        
        System.out.print("\nOrdenado\n");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " - ");
        }
    }
    
    private static void realizarHeapsort(int[] vetor, int n, int i){
        int raiz = i;
        int esquerda = 2*i+1;
        int direita = 2*i+2;
        
        if(esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }
        
        if(direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }
        
        if(raiz != i){
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;
            
            realizarHeapsort(vetor, n, raiz);
        }
    }
}