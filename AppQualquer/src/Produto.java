
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
public class Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: /n");   
        double produto = sc.nextDouble();
        
        System.out.println("Valor de venda: "+ (produto+(produto*0.25)));
        
    }
}
