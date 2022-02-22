/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class TestaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int auxnum = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do aluno"));
        String auxnome = JOptionPane.showInputDialog("Informe o nome do aluno");
        
        Aluno obj1 = new Aluno(auxnum, "Fernando", 20, 10, 9);
        
        
        obj1.mostrar();
    
        
    }
    
}
