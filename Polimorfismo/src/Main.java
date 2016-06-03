/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliomar Santana
 */
public class Main {
    public static void main(String[] args){
        Empregado e = new Empregado("Renato", 100);
        Programador p = new Programador("Esdras", 200);
        Gerente g = new Gerente("Eliomar", 300);
        
        System.out.println(e.getNome()+" recebe "+e.aumentaSalario());
        System.out.println(p.getNome()+" recebe "+p.aumentaSalario());
        System.out.println(g.getNome()+" recebe "+g.aumentaSalario());
    }
}
