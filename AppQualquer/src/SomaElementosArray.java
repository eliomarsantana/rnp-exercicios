/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliomar Santana
 */
public class SomaElementosArray {
    public static void main(String[] args) {
        int[] elementos = {1,2,4,5,7,8,10};
        int tamanho = elementos.length;
        int soma = 0;
        
        for(int i=0;i<tamanho;i++) {
            if((elementos[i]%2) == 0) {
                soma = soma + elementos[i];
            }
        }
        System.out.println("Soma dos pares: "+ soma);
    }
}
