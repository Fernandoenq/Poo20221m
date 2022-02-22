/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe0;

import javax.swing.JOptionPane; //importando um pacote para usar uma classe

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
    public Carro(String modelo, int ano, float velocidade, boolean motor){
    
    this.modelo = modelo;
    this.ano = ano;
    this.velocidade = velocidade;
    this.motor = motor;
    // this. faz referencia a variavel do objeto
    }
    //Criação de métodos
    void ligar(){
        this.motor = true;
        //This representa o objeto que chama o método
    }
    
    void desligar(){
        this.motor = false;
        this.velocidade = 0;
    }
    
    void acelerar(float x){
        this.velocidade += x;
    }
    
    void frear(float x){
        if(this.motor){
            this.velocidade -= x;
        }
        
    }


    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Modelo: " + this.modelo + " ano: " + this.ano + " vel " + this.velocidade + " motor " + this.motor);
        //Ele meio que abre uma caixa de dialogo
    }

}