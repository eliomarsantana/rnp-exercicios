/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliomar Santana
 */
public class ImprimeImpares {
    public static void main(String[] args) {
        int soma = 0;
        for(int i=300;i<=307;i++) {
            if((i%2) != 0){
                soma = soma +i;
            }
        }
        System.out.println("Imprime impares: " + soma);
    }
}
