/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlanificadorSTF {
	private static List<Proceso> procesos;
	
	static {
		procesos = new ArrayList<Proceso>();
	}

	public static Proceso get() {
		long inicio, fin;
		Proceso p = null;
		
		try{
			p = procesos.get(0);
			procesos.remove(p);
			inicio = System.currentTimeMillis();
			System.out.println("Hora de inicio del proceso " + p.nombre + ": " + inicio + "." + p.duracion + ".");
			Thread.sleep(p.duracion);
			fin = System.currentTimeMillis();
			System.out.println("Hora de fin del proceso " + p.nombre + ": " + fin + ".");
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		return p;
	}
	
	public static void put(Proceso p) {
		procesos.add(p);
	}
	
	public static void sirve() {
		Collections.sort(procesos, new Comparator<Proceso>() {
			@Override
			public int compare(Proceso p1, Proceso p2) {
				return p1.duracion - p2.duracion;
			} });
		
		while (procesos.size()>0) {
			get();
		}
		
		System.out.println("Planificación sin procesos.");
	}
}

