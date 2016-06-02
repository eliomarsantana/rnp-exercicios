/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

import java.util.Scanner;

/**
 *
 * @author Eliomar Santana
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o lado 1: ");
        int l1 = sc.nextInt();
        System.out.println("Digite o lado 2: ");
        int l2 = sc.nextInt();
        System.out.println("Digite o lado 3: ");
        int l3 = sc.nextInt();
        
        Triangulo t = new Triangulo(l1, l2, l3);
        
        if(t.ehEquilatero())
            System.out.println("Equilátero");
        else if(t.ehIsosceles())
            System.out.println("Isosceles");
        else if(t.ehEscaleno())
            System.out.println("Escaleno");
        
         
    }
}
