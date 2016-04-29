/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliomar Santana
 */
public class ImprimePares {
    public static void main(String[] args) {
        int soma = 0;
        for(int i=100;i<=500;i++) {
            if((i%2)==0){
                soma = soma + i;   
            }
        }
        System.out.println("Soma dos pares: "+ soma);
    }
}
