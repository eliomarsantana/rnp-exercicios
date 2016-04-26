
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
public class Locadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de fitas da locadora: /n");
        int qtdFitas = sc.nextInt();
        System.out.println("Digite o valor do aluguel: /n");
        double valorAluguel = sc.nextDouble();
        
        double faturamentoAnual = (((qtdFitas/3)*valorAluguel)*12);
        double multaValor = valorAluguel * 0.1;
        System.out.println("Faturamento Anual: " +faturamentoAnual);
        System.out.println("Valor ganho com atraso: "+(((qtdFitas/3)*0.1)*multaValor));
    }
}
