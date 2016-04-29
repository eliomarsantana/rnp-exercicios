
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
public class Emprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario bruto: /n");
        double salario = sc.nextDouble();
        System.out.println("Digite o valor da prestacao: /n");
        double prestacao = sc.nextDouble();
        
        double percentualSalario = salario * 0.25;
        
        if(prestacao > percentualSalario)
            System.out.println("Prestacao ultrapassa 25% do salario bruto");
        else
            System.out.println("Emprestimo pode ser concedido");
    }
}
