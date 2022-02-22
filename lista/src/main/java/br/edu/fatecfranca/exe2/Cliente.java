/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe2;

/**
 *
 * @author Fernando
 */
public class Cliente {
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;
    
    
    public Cliente(){
    }
    
    public Cliente(int nmrconta, int nmragencia, String name, float sald0){
        numeroConta = nmrconta;
        numeroAgencia = nmragencia;
        nome = name;
        saldo = sald0;
}
    
    void realizarDeposito(float x){
        this.saldo += x;
    }
    
    void realizarSaque(float x){
        this.saldo -= x;
    }
    void retornardados(){
       System.out.println("O numero da conta é: " + this.numeroConta + " do cliente: " +this.nome+ " com o seguinte saldo: " + this.saldo);
        
    }
}


