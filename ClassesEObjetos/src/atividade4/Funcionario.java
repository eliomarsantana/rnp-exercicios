/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4;

/**
 *
 * @author Eliomar Santana
 */
public class Funcionario {
    
    public Funcionario(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public double adicional(double salarioBase){
        double retorno = 0;
        if(nivel.equals("I"))
            retorno = 0;
        if(nivel.equals("II"))    
            retorno = salarioBase * 0.15;
        if(nivel.equals("III"))
            retorno = salarioBase * 0.20; 
        
        return retorno;
    }
    public double IR(double salarioBruto){
        double retorno = 0;
            if(salarioBruto <= 1499.99)
                retorno =0;
            if(salarioBruto > 1499.99 && salarioBruto <= 1999.99)
                retorno = salarioBruto*0.075;
            if(salarioBruto > 1999.99 && salarioBruto <= 2999.99)
                retorno = salarioBruto*015;
            if(salarioBruto >= 3000)
                retorno = salarioBruto*0.2;
        return retorno;
    }
    
    private String nome;
    private double salarioBase;
    private String nivel;
}
