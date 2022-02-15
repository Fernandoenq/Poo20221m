/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe0;
/**
 *
 * @author Fernando
 */
public class Carro {
    
    String modelo;
    int ano;
    float velocidade;
    boolean motor;
    
    //Método contrutor
    public Carro(String mod, int an, float vel, boolean mt){
    
    modelo = mod;
    ano = an;
    velocidade = vel;
    motor = mt;
    }
    //Criação de métodos
    void ligar(){
        motor = true;
        
    }
    
    void desligar(){
        motor = false;
        velocidade = 0;
    }
    
    void acelerar(float x){
        velocidade += x;
    }
    
    void frear(float x){
        if(motor){
            velocidade -= x;
        }
        
    }


    public void mostrar(){
        System.out.println("Modelo: " + modelo + " ano: " + ano + " vel " + velocidade + " motor " + motor);
}

}