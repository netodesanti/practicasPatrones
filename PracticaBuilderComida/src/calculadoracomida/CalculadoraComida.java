/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

import calculadoracomida.InformacionComida.ComidaBuilder;

public class CalculadoraComida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InformacionComida porcionOllaDeCarne;
        
        ComidaBuilder builder = new ComidaBuilder("Olla De Carne",240,Medida.ML);
        builder = builder.porciones(2).calorias(350).grasa(40).sodio(50).carbos(10);        
        
        porcionOllaDeCarne = builder.createInfo();
        System.out.println(porcionOllaDeCarne.toString());
    }
    
}
