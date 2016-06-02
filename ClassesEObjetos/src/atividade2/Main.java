/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.util.Scanner;

/**
 *
 * @author Eliomar Santana
 */
public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Digite as despesas: ");
        cliente.setDespesas(sc.nextDouble());
        
        System.out.println("Cliente "+cliente.getNome()+", suas despesas foram R$"+cliente.getValorASerPago());
    }
}
