/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

/**
 *
 * @author Eliomar Santana
 */
public class Triangulo {
    
    public Triangulo(int lado1, int lado2, int lado3){
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    public boolean ehEscaleno(){
        if(lado1 != lado2 && lado3 != lado1)
            return true;
        return false;
    }
    
    public boolean ehIsosceles(){
        if(lado1 == lado2 || lado3 != lado1)
            return true;
        return false;
    }
    
    public boolean ehEquilatero(){
        if(lado1 == lado2 && lado3 == lado1)
            return true;
        return false;
    }

    private int lado1;
    private int lado2;
    private int lado3;
}
