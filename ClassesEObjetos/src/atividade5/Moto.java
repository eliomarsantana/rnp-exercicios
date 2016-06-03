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
public class Moto extends Veiculo{

    private String tipoMotor;
    private String tipoFreio;

    public Moto(String tipoMotor, String tipoFreio, double cilindradas, double preco, String combustivel) {
        super(cilindradas, preco, combustivel);
        this.tipoMotor = tipoMotor;
        this.tipoFreio = tipoFreio;
    }
    
    
    @Override
    public void imprimir() {
        System.out.println("tipo motor: "+tipoMotor);
        System.out.println("cilindradas: "+cilindradas);
    }
    
}
