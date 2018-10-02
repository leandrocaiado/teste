package br.exercicio.main.ThreadProducer2ConsumerEx2;

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
import br.exercicio.thread.Popula;

/**
 * @author Crunchify.com
 *
 */

public class Start1ThreadPopula2ThreadsConsome {

	public static Map<String, Integer> listaThreads = Collections.synchronizedMap(new HashMap<String, Integer>());

	public static void main(String[] args) throws InterruptedException {

		Popula p = new Popula(listaThreads);
		p.run();
	
		Consumo1 c = new Consumo1(listaThreads);
		c.run();
		Consumo2 c2 = new Consumo2(listaThreads);
		c2.run();
		
		try {
            c.join();
            c2.join();
          
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
	}

}