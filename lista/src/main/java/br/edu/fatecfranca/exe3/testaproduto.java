package br.edu.fatecfranca.exe3;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class testaproduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe ID"));
        int auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Informe qtde"));
        String auxDescricao = JOptionPane.showInputDialog("Descrição?");
        float auxPreco = Float.parseFloat(JOptionPane.showInputDialog("informe preço"));
        Produto obj1 = new Produto(auxId, auxDescricao, auxQtde, auxPreco);
        
        obj1.mostrar();
        obj1.comprar(3);
        obj1.mostrar();
        obj1.vender(1);
        obj1.mostrar();
        obj1.subir(500);
        obj1.mostrar();
        obj1.descer(1000);
        obj1.mostrar();
        
                
    }
    
}
