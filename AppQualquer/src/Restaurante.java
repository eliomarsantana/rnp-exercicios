
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
public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor da comida: /n");
        double comida = sc.nextDouble();
        System.out.println("Valor da bebida: /n");
        double bebida = sc.nextDouble();
        
        double consumo = comida + bebida;
        
        System.out.println("Valor de consumo sem taxa: " +consumo);
        System.out.println("Valor total com gorjeta: "+ ((consumo)+(consumo*0.1)));
    }
}
