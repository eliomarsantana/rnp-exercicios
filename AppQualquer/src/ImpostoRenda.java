
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
public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário: /n");
        double salario = sc.nextDouble();
        
        System.out.println("Imposto sobre o salário é: "+ (salario*(0.05)));
    }
}
