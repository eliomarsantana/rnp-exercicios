
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
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: /n");
        int valor = sc.nextInt();
        
        int fatorial = valor;
        while(valor > 1) {
            fatorial = fatorial*(valor-1);
            valor--;       
        }
        System.out.println("Fatorial: "+ fatorial);
    }
}
