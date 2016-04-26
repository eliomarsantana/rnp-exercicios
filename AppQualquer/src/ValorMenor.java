
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
public class ValorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: /n");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: /n");
        int valor2 = sc.nextInt();
        
        if(valor1 < valor2)
            System.out.println("Menor: "+valor1);
        else
            System.out.println("Menor: "+valor2);
    }
}
