
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
public class ContaEspacoEVogal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        int contEspaco = 0; int contVogal = 0;
        
        int tamanho = frase.length();
        for(int i=0;i<tamanho;i++){
            if(frase.charAt(i) == ' '){
                contEspaco++;
            }        
        }
        System.out.println("Quantidade espaço: "+ contEspaco);
        
        //contar vogais
        for(int i=0;i<tamanho;i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                contVogal++;
            }        
        }
        
        System.out.println("Quantidade vogais: "+ contVogal);
        
        System.out.println("Media de vogais: "+ (contVogal*(tamanho/100))+"%");
    }
}
