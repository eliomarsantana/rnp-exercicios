
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
public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario: /n");
        double salario = sc.nextDouble();
        
        if(salario >= 500)
            System.out.println("Salario reajustado: "+ (salario+(salario*0.3)));
        else
            System.out.println("Salario não atende a reajuste");
    }
}
