package br.exercicio.thread;

import java.util.Iterator;
import java.util.Map;

public class Consumo3Ex3 extends Thread {

	public void run() {	
		
		
		synchronized(PopulaEx3.getListaThreads()) {		
		Iterator<Integer> it =  PopulaEx3.getListaThreads().iterator();
		 while(it.hasNext()) {
		     Object key=it.next();
		     System.out.println("Consumidor 3: " + key);   
		     it.remove();
		 }
	  }}
}
