/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe4;

/**
 *
 * @author Fernando
 */
public class Rio {
    String nome;
    float nivel;
    boolean poluido;
    
    public Rio(){
    }
    
    public Rio(String name, float level, boolean poluicao){
        nome = name;
        nivel = level;
        poluido = poluicao;
        
    }
    
    void chover(float x){
        this.nivel += x;
    }
    void ensolarar(float x){
        this.nivel -= x;
    } 
    void limpar(){
        this.poluido = true;
    }
    
    void sujar(){
        this.poluido = false;
    }
    void mostra(){
        if(this.poluido == true){
            System.out.println("O rio " + this.nome + " No momento está com o nível: " + this.nivel + " ele está limpo");
        }   
        else {
            System.out.println("O rio " + this.nome + " No momento está com o nível: " + this.nivel + " ele está poluido");
        }
    }
}
