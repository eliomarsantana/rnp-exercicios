
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
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor de 0 a 10 para saber a tabuada: ");
        int valor = sc.nextInt();
        if(!((valor < 0) || (valor > 10))){
            for(int i = 1; i<=10; i++) {
                System.out.println(valor+"x"+i+"="+(valor*i));
            }
        }else
            System.out.println("Digite valores entre 0 e 10");
    }
}
