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
public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        setNome(nome);
        setPeso(peso);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getIMC(){
        return peso/(altura*altura);
    }
    
    public String faixaRisco(){
        String retorno = "";
        if(getIMC() < 20)
            retorno = "Abaixo do peso";
        if(getIMC()>=20 && getIMC()<=25)
            retorno = "normal";
        return retorno;
    }
    
    
}
