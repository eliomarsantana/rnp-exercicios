
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
public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distância percorrida: /n");
        double deltaS = sc.nextDouble();
        System.out.println("Digite o tempo gasto: /n");
        double deltaT = sc.nextDouble();
        
        System.out.println("A velocidade média é: "+ (deltaS/deltaT));
    }
}
