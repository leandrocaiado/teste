package br.exercicio.thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class PopulaEx3 extends Thread {
    Integer obj = null;
	static   List<Integer> listaThreads = new ArrayList() ;
		
	

	
	public PopulaEx3( Integer obj) {
		this.obj = obj;
	}

	public void run() {

		listaThreads.add(obj);

		try {
			System.out.println("Populado com " + obj);
			sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public static List<Integer> getListaThreads() {
		return listaThreads;
	}

	public static void setListaThreads(List<Integer> listaThreads) {
		PopulaEx3.listaThreads = listaThreads;
	}

}
