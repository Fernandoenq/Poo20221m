/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.exe0;

/**
 *
 * @author Fernando
 */
public class teste {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro obj1 = new Carro("Onix", 2019, 0, false);
        
       
        //chamar os métodos
        obj1.mostrar();
        obj1.ligar();
        obj1.mostrar();
        obj1.acelerar(40);
        obj1.mostrar();
        obj1.frear(10);
        obj1.mostrar();
        
        Carro obj2 = new Carro("Onix", 2019, 0, false);
        
        
        //chamar os métodos
        obj2.mostrar();
        obj2.ligar();
        obj2.mostrar();
        obj2.acelerar(40);
        obj2.mostrar();
        obj2.frear(10);
        obj2.mostrar();
        
    }
    
}
