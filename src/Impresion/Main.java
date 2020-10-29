/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /*!!hay que realizar la clase siempre que se realice un array y demás*/
    public static void main(String[] args) {
        
       /*
       preparaMicroprocesador();
       PlanificadorFCFS.sirve();
       */
    	//Cambio 
    	preparaMicroprocesadorSTF();
        PlanificadorSTF.sirve();
    } 
    
    public static void preparaMicroprocesadorFCFS(){
        ArrayList<Proceso> procesos = new ArrayList<Proceso>();
        
        for (int i=1; i<=5; i++){
        	Proceso pi = new Proceso("P_" + i, ((int) Math.floor(Math.random()*4+1)) * 1000);
            procesos.add(pi);
        }
        
        Collections.shuffle(procesos);
        
        for(Proceso p : procesos){
             PlanificadorFCFS.putProceso(p);               
        } 
    }
    
    private static void preparaMicroprocesadorSTF () {
		for (int i = 1; i <= 5; i++) {
			Proceso pi = new Proceso( "p" + i, ((int) Math.floor(Math.random()*4+1)) * 1000 );
			PlanificadorSTF.put(pi);
		}
	}
    
}
