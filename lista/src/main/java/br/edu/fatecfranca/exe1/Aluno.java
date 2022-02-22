/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Aluno { //classe
    
    int NmrAluno;
    String nome;
    int idade;
    float p1;
    float p2;
    
    public Aluno(){
        
    }
    public Aluno(int numal, String name, int years, float pp1, float pp2){
        this.NmrAluno = numal;
        this.nome = name;
        this.idade = years;
        this.p1 = pp1;
        this.p2 = pp2;
    }
    
    //public double pegarnotas(){
    //   return(p1 + p2);
    //}
    public double notaFinal(){
        return(this.p1 + this.p2) / 2;
        
    }
    
    public String dadosAluno(){
        return String.format("O aluno " + this.nome + " com o numero " + this.NmrAluno + " Tem " + this.idade + " anos e ele foi ");
        
    }
    public void dadosAluno2(){
        JOptionPane.showMessageDialog(null, "O aluno " + this.nome + " com o numero " + this.NmrAluno + " Tem " + this.idade + " anos e ele foi ");
    }
    
    public String passou(){
        double notao = this.notaFinal();
        
        if(notao < 6) {
            return "Aprovado";
        } 
        else if(notao < 6 && notao >= 3){
            return "Recuperação!";
        }
        else {
            return "Reprovado";
        }
    
    //return (this.notaFinal() >= 6) ? "Aprovado" : "Reprovado";
       
    }
    
    
    public void mostrar(){
        //System.out.println("Numeros de alunos: " + NmrAluno + " Nome: " + nome + " idade " + idade + " primeira prova: " + p1 + " segunda prova" + p2);
        System.out.println(this.dadosAluno() + this.passou());
    }
    
}
