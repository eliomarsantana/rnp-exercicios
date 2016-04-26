/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqualquer;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Eliomar Santana
 */
public class AppQualquer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x = 9.997;
        int n = (int) Math.round(x);
        System.out.println(n);
        
        int a = 3; 
        int b = 2;
        System.out.println(Math.pow(a, b));
        System.out.println(18+"Anos");
        String saudacao = "Bem Vindo";
        System.out.println(saudacao.substring(0,3));//escreve bem
        System.out.println(saudacao.charAt(2));//pegando caracter se colocar 3 escreve o espaço
        
        System.out.println(" ");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite uma frase: /n");
        String frase = sc.nextLine();
        System.out.println("Frase digitada: "+frase);
        
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, nome, "Tela de Nome", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
