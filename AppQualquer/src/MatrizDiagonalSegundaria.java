/**
 *
 * @author Eliomar Santana
 */
public class MatrizDiagonalSegundaria {
    public static void main(String[] args) {
        int[][] matriz = {{4,5,3,6}, {2,10,3,5}, {7,8,9,6}, {2,9,5,6}};
        
        for (int i=0; i<4; i++) {            
            for (int j=0; j<4; j++) {
               if(i==j)
                   System.out.println("Diagonal principal: "+ matriz[i][j]);
            }
        }
        System.out.println(" ");
        for (int i=0; i<4; i++) {            
            for (int j=0; j<4; j++) {
               if ((i + j) == (4 - 1)) // diagonal secundaria
                    System.out.println("Diagonal secundaria: "+ matriz[i][j]);
            }
        }
        int soma = 0;
        for (int i = 0; i < matriz.length; i ++) {  
            for (int j = 0; j < matriz[i].length; j++) {  
                soma += matriz[i][j];  
            }
        }
        System.out.println("soma dos elementos: "+ soma);
    }
}
