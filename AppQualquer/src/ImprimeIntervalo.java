/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliomar Santana
 */
public class ImprimeIntervalo {
    public static void main(String[] args) {
        int soma = 0;
        for(int i=200;i<=400;i++) {
            soma = soma + i;
        }
        System.out.println("Soma: "+soma);
    }
}
