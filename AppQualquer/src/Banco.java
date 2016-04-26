
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
public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: /n");
        double deposito = sc.nextDouble();
        System.out.println("Digite o valor da taxa: /n");
        double percentual = sc.nextDouble();
        
        System.out.println("valor do rendimento: "+ (deposito*(percentual/100)));
        System.out.println("valor final: "+ (deposito+(deposito*(percentual/100))));
    }
}
