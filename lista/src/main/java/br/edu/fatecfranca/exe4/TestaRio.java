/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.exe4;

/**
 *
 * @author Fernando
 */
public class TestaRio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rio obj1 = new Rio("Tiête", 2, false);
        
        obj1.mostra();
        obj1.chover(2);
        obj1.mostra();
        obj1.ensolarar(1);
        obj1.mostra();
        obj1.limpar();
        obj1.mostra();
        obj1.sujar();
        obj1.mostra();
    }
    
}
