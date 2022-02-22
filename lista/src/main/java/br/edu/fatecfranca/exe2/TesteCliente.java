/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.exe2;

/**
 *
 * @author Fernando
 */
public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente obj1 = new Cliente(17, 11, "Fernando", 100);
        
        obj1.realizarDeposito(10000);
        obj1.realizarSaque(300);
        obj1.retornardados();
    }
    
}
