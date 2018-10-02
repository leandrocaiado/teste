package br.exercicio.thread;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Consumo2 extends Thread {

	Map<String, Integer> listaThreads = null;

	public Consumo2(Map<String, Integer> listaThreads) {
		this.listaThreads = listaThreads;
	}

	public void run() {
		
		
		synchronized(listaThreads) {
			Iterator<String> it =  listaThreads.keySet().iterator();

			 while(it.hasNext()) {
			     Object key=it.next();
			     System.out.println("Consumidor 2: " + listaThreads.get(key));   
			     it.remove();
			 }
		  }
		
		
		
		
	
	}

}