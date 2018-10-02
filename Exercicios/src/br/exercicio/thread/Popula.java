package br.exercicio.thread;

import java.util.Map;

public class Popula extends Thread {

	Map<String, Integer> listaThreads = null;

	public Popula(Map<String, Integer> listaThreads) {
		this.listaThreads = listaThreads;
	}

	public void run() {

		for (int i = 0; i < 5000; i++)

		{

			listaThreads.put("nome" + i, i);

		}
		try {
			System.out.println("Populado com "+listaThreads.size());
			sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
