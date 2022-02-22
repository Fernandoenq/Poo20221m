/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.exe0;

import javax.swing.JOptionPane;

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
        
        
        String auxModelo = JOptionPane.showInputDialog("Informe o modelo");
        int auxano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
        float auxvel = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade"));
        int respostadomotorligado = JOptionPane.showConfirmDialog(null, "O carro esta ligado?");
        //é criado uma variavel para receber a resposta se o carro ta ligado ou não
        //a resposta da caixa retorna em INT e com 2 possiveis valores
        //- JOptionPane.OK_OPTION
        //- JOptionPane.NO_OPTION
        boolean auxMotor = (respostadomotorligado == JOptionPane.OK_OPTION);
        //para transformar a resposta do carro ligado em boolean
        //vamos criar uma variavel boolean
        //seu valor vem de uma pergunta
        //se for OK_OPTION como valor ent será true
        //se nao será false
        Carro obj2 = new Carro(auxModelo, auxano, auxvel, auxMotor);
        
        
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
