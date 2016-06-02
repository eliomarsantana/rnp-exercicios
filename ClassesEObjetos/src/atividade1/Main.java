/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author Eliomar Santana
 */
public class Main {
    public static void main(String[] args){
        Empregado empregado = new Empregado();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        empregado.setNome(sc.nextLine());
        System.out.println("Digite o salario: ");
        empregado.setSalario(sc.nextDouble());
        
        
        System.out.println("Nome: "+ empregado.getNome());
        System.out.println("Imposto a ser pago: "+ empregado.getIR(empregado.getSalario()));
    }
}
