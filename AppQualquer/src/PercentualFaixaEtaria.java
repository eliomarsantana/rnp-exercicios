import java.util.Scanner;
/**
 *
 * @author Eliomar Santana
 */
public class PercentualFaixaEtaria {
    public static void main(String[] args) {
        int somaFaixaEtaria1 = 0;
        int somaFaixaEtaria2 = 0;
        int somaFaixaEtaria3 = 0;
        int somaFaixaEtaria4 = 0;
        int somaFaixaEtaria5 = 0;
        
        int[] idades = new int[50];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<=49;i++){
            System.out.println("Digite uma idade "+(i+1)+": ");
            idades[i] = sc.nextInt();
        }
        
        for(int i=0;i<=9;i++){
            if((idades[i]>=0) && (idades[i]<=15)) {
                somaFaixaEtaria1 += idades[i];
            }else if ((idades[i]>=16) && (idades[i]<=30)) {
                somaFaixaEtaria2 += idades[i];
            }else if ((idades[i]>=31) && (idades[i]<=45)) {
                somaFaixaEtaria3 += idades[i];
            }else if ((idades[i]>=46) && (idades[i]<=60)) {
                somaFaixaEtaria4 += idades[i];
            }else if (idades[i]>60){
                somaFaixaEtaria5 += idades[i];
            }else{
                System.out.println("Idade não existe!!!");
            }
        }
        
        System.out.println("Percentual da faixa etária 1: " +(somaFaixaEtaria1 * 0.1) +"%");
        System.out.println("Percentual da faixa etária 2: " +(somaFaixaEtaria2 * 0.1) +"%");
        System.out.println("Percentual da faixa etária 3: " +(somaFaixaEtaria3 * 0.1) +"%");
        System.out.println("Percentual da faixa etária 4: " +(somaFaixaEtaria4 * 0.1) +"%");
        System.out.println("Percentual da faixa etária 5: " +(somaFaixaEtaria5 * 0.1) +"%");
        
    }
}
