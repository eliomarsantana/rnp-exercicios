
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eliomar
 */
public class SubstituiLetra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = sc.nextLine();

        int tamanho = frase.length();
        String fm = null;
        for (int i = 0; i < tamanho; i++) {
            if (frase.contains("E")) {
                fm = frase.replace('E', '3');
            }
            if (frase.contains("A")) {
                fm = frase.replace('A', '4');
            }
        }

        System.out.println("Frase modificada: " + fm);
    }
}
