
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
public class DivisivelPorCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: /n");
        int numero = sc.nextInt();
        
        if((numero % 5) == 0)
            System.out.println("Divisivel por 5");
        else
            System.out.println("não divisivel por 5");
    }
}
