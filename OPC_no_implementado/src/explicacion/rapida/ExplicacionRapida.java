/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacion.rapida;

/**
 *
 * @author Alejandro Gomez G
 * @Rciardo Muñoz
 */
public class ExplicacionRapida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche [] coches= {
            new Coche("Audi"),
            new Coche("Mercedez"),
            new Coche("Mclaren")
        }; 
        imprimir(coches);
    }
       
    
    public static void imprimir(Coche[] coches){  
        
            for (Coche coche : coches) {
            if(coche.getMarca().equals("Audi")) System.out.println(18000);
            if(coche.getMarca().equals("Mercedez")) System.out.println(25000);
            if(coche.getMarca().equals("Mclaren")) System.out.println(1000000);
        }
    }
    
}
    



