package br.edu.fatecfranca.exe3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Produto {
    int id;
    String descrição;
    int qtde;
    float preco;
    
    public Produto(){
        
    }
    public Produto(int id, String descrição, int qtde, float proco){
        this.id = id;
        this.descrição = descrição;
        this.qtde = quantidade;
        this.preco = preco;
    }
    
    void comprar(int x){
        this.qtde += x;
    }
    
    void vender(int x){
        this.qtde -= x;
    }
    
    void subir(float x){
        this.preco += x;
    }
    
    void descer(float x){
        this.preco -= x;
    }
    
    public void mostrar(){
        System.out.println(this.preco + "Id do produto: " + this.id + " descrição: " + this.descrição + " quantidade " + this.qtde + " preço ");
}
    
    
}
