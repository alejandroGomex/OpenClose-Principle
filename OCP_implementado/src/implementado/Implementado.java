/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementado;


/**
 *
 * @author Alejandro Gomez G
 * @Rciardo Muñoz
 */
public class Implementado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche [] coches= {
            new Audi(),
            new Renault(),
            new Mercedes()
        }; 
        imprimir(coches);
    };
    
    
    public static void imprimir(Coche[] coches){  
        for (Coche coche : coches) {
            System.out.println(coche.precioMedioCoche());
        }
    }
   
}
        
    
  