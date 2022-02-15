package br.edu.fatecfranca.exe1;

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
        Produto obj1 = new Produto(11, "PCGamer", 3, 5400);
        
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
