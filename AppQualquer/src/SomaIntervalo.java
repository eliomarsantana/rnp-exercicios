
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliomar Santana
 */
public class SomaIntervalo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor de a: /n");
        int a = sc.nextInt();
        System.out.println("Digite b: /n");
        int b = sc.nextInt();
        
        int soma = 0;
        for(;a<=b;a++) {
            soma = soma + a;
        }
        System.out.println("Soma: "+soma);
    }
}
