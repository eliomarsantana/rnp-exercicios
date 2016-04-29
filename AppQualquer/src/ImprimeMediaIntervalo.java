/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliomar Santana
 */
public class ImprimeMediaIntervalo {
    public static void main(String[] args) {
        int soma = 0;
        int cont = 0;
        
        for(int i=500;i<=700;i++) {
            soma = soma + i;
            cont++;
        }
        System.out.println("Media: "+ (soma/cont));
    }
}
