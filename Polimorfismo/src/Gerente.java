/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eliomar Santana
 */
public class Gerente extends Empregado{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public double aumentaSalario() {
        return this.getSalario() + (this.getSalario()*0.15); //To change body of generated methods, choose Tools | Templates.
    }
    
}
