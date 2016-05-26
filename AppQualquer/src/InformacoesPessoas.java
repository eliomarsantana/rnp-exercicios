
import java.util.Scanner;

/**
 *
 * @author Eliomar Santana
 */
public class InformacoesPessoas {
    public static void main(String[] args) {
        Object[][] matriz = new Object[50][3];
        double maior = 0; double menor = 10000;
        int qtdM = 0; double somaA = 0;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<50; i++){
            System.out.println("Digite a altura, idade e sexo da pessoa "+(i+1)+":"); 
           for(int j=0; j<3; j++){
               matriz[i][j] = sc.next();
           } 
        }        
        //maior e menor altura
        for(int i=0; i<50; i++){
            double altura = Double.parseDouble((String)matriz[i][0]);
            if( altura > maior){
                maior = altura;
            }
            if( altura < menor){
                menor = altura;
            }  
        }    
        System.out.println(" ");
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        
        //media altura das mulheres
        for(int i=0; i<50; i++){
            double alt = Double.parseDouble((String)matriz[i][0]);
               if(matriz[i][2].equals("F")){
                   qtdM++;
                   somaA = somaA + alt;
               }           
        }
        System.out.println("Média de idade das mulheres: "+(somaA/qtdM));
        
        for(int i=0; i<50; i++){
            double idade = Integer.parseInt((String)matriz[i][1]);
               if(matriz[i][2].equals("M")){
                   if( idade > maior){
                        maior = idade;
                    }    
               }           
        }
        
        System.out.println("Idade do homem mais velhor: "+ maior);
    }
}
