/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadecarro;

/**
 *
 * @author Asus
 */
public class FabricaDeCarro {
    
    private static FabricaDeCarro instancia;
    
    private FabricaDeCarro(){
        
    }
    
    public static FabricaDeCarro getInstancia(){
        if(instancia == null)
            instancia = new FabricaDeCarro();
            return instancia;
    }
    public void instance(){
        System.out.println("Objeto unico!");
    }
}
