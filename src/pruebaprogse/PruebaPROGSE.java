/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaprogse;

/**
 *
 * @author usuario
 */
public class PruebaPROGSE {

    /**
     * @param args the command line arguments
     */
  
        public static void main(String args[]){
        SoyUnico ricardo = SoyUnico.getSingletonInstance("Ricardo Moya");
        SoyUnico ramon = SoyUnico.getSingletonInstance("Ramón Invarato");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());   

}

    }
    

