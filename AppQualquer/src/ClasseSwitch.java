
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
public class ClasseSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o valor 2: ");
        int valor2 = sc.nextInt();
        System.out.println(" ");
        System.out.println("Menu: ");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números digitados");
        System.out.println("4 - Divisão do primeiro pelo segundo");
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Média: "+ ((valor1+valor2)/2));
                break;
            case 2:
                if(valor1>valor2)
                    System.out.println("Diferença: "+(valor1-valor2));
                else
                    System.out.println("Diferença: "+(valor2-valor1));
                break;
            case 3:
                System.out.println("Produto: "+ (valor1*valor2));
                break;
            case 4:
                if(valor1 != 0 && valor2 != 0)
                    System.out.println("Divisão: "+ (valor1/valor2));                    
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
