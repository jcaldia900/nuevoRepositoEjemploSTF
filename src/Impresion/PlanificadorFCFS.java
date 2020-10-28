/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author usuario
 */

public class  PlanificadorFCFS {
   //  Proceso pro = new Proceso("A",2);
   private static Queue<Proceso> queue;
   static{
       queue=new LinkedList<Proceso>();
   }
   public static Proceso get() {
   Proceso aux=queue.poll();
   
    long inicio,fin;
        if(aux!=null){
          try{
            inicio=System.currentTimeMillis();
            System.out.println("****************PROCESO:  "+aux.nombre+"***********************************");
            System.out.println("Hora de inicio: "+inicio);
            Thread.sleep(aux.duracion);
            fin=System.currentTimeMillis();
            System.out.println("Hora de fin: "+fin);
            System.out.println("--> Duración del hilo ("+ aux.duracion+")" +aux.nombre+"||"+(fin-inicio)) ;
            System.out.println("****************FIN PROCESO: "+aux.nombre+"********************************");
          }catch(InterruptedException ex){
              ex.printStackTrace();
          
          } 
        
        }else{
            System.out.println("-----------------------Planificador sin procesos----------------------");
        
        
        }
            
         return aux;
   }
   
 
   public static Proceso putProceso(Proceso aux){
      queue.add(aux);
       return null;
};
   
    static void sirve(){
        while(get()!=null){};
         Queue<Proceso> queue1 = PlanificadorFCFS.queue;
    
    };
    
}
