/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

/**
 *
 * @author Eliomar Santana
 */
public abstract class Veiculo {
    public double cilindradas;
    public double preco;
    public String combustivel;
    
    public Veiculo(){}

    public Veiculo(double cilindradas, double preco, String combustivel) {
        this.cilindradas = cilindradas;
        this.preco = preco;
        this.combustivel = combustivel;
    }
    
    public abstract void imprimir();
}
