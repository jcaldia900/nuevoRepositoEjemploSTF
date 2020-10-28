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
        ArrayList <Proceso> procesos= new ArrayList<Proceso>();
       
        // TODO code application logic here
        for(int i=0;i<5;i++){
             Proceso pi= new Proceso("P_"+i,(int)Math.floor(Math.random()*4+1)*1000);
             procesos.add(pi);
        }
        Collections.shuffle(procesos);
        int i;
        for(i=0;i<procesos.size();i++){
             PlanificadorFCFS.putProceso(procesos.get(i));
        };
        PlanificadorFCFS.sirve();
        
       
        
    }
    
}
