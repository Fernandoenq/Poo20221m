package br.edu.fatecfranca.exe1;

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
    public Produto(int ids, String des, int quant, float price){
        id = ids;
        descrição = des;
        qtde = quant;
        preco = price;
    }
    
    void comprar(int x){
        qtde += x;
    }
    
    void vender(int x){
        qtde -= x;
    }
    
    void subir(float x){
        preco += x;
    }
    
    void descer(float x){
        preco -= x;
    }
    
    public void mostrar(){
        System.out.println("Id do produto: " + id + " descrição: " + descrição + " quantidade " + qtde + " preço " + preco);
}
    
    
}
