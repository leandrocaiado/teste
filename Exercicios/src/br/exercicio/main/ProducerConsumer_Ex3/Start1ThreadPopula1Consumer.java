package br.exercicio.main.ProducerConsumer_Ex3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import br.exercicio.thread.Consumo1;
import br.exercicio.thread.Consumo2;
import br.exercicio.thread.Consumo3Ex3;
import br.exercicio.thread.Popula;
import br.exercicio.thread.PopulaEx3;

/**
 * @author Crunchify.com
 *
 */

public class Start1ThreadPopula1Consumer {

	
	public static void main(String[] args) throws InterruptedException {

		
		for (int i = 0; i < 5000; i++) {
			

		
		PopulaEx3 p = new PopulaEx3(new Integer(i));
		p.run();
	
		Consumo3Ex3 c = new Consumo3Ex3();
		c.run();
		
		}
		
	}

}