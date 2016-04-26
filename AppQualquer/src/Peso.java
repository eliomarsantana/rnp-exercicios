
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
public class Peso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite peso atual: /n");
        double pesoAtual = sc.nextDouble();
        System.out.println("Digite peso desejado: /n");
        double pesoDesejado = sc.nextDouble();
        
        double pesoPerdido = pesoAtual - pesoDesejado;
        System.out.println("Porcentagem: "+ ((pesoPerdido/pesoAtual)*100)+"%");
    }
}
