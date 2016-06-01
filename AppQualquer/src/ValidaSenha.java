
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
public class ValidaSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contNum = 0;
        System.out.println("Digite uma senha: ");
        String senha = sc.nextLine();
        
        int tam = senha.length();
        if((tam > 12) || (tam < 6))
            System.out.println("Digite uma senha acima de 5 e menor que 13 caracteres!");
        
        if(Character.isAlphabetic(senha.charAt(0))==false)
            System.out.println("Inicie a senha com letra!");
                
        for(int i=1; i<tam;i++){
            if(Character.isDigit(senha.charAt(i))==true)
                contNum++;
        }
        if(contNum < 2)
            System.out.println("Sua senha precisa ter 2 números");
        
        
        
    }
}
