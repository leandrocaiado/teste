package br.exercicio.main.SerializarDesserializar_Ex1;

import java.util.Date;

import br.exercicio.modelo.Employee;
import br.exercicio.service.SerializareDessserializarService;

public class StartSerializareDesserializar {
	public static void main(String[] args) {
	
		for (int i = 0; i < 5000; i++) {
			// implementação modelo 1 -> serialize / desserialize 1
			long tempoProcessamento1 = new SerializareDessserializarService()
					.serializa1(new Employee(i, "Employee " + i, new Date()));

			// implementação modelo 2 -> serialize / desserialize 2
			long tempoProcessamento2 = new SerializareDessserializarService()
					.serializa2(new Employee(i, "Employee " + i, new Date()));

			System.out.println("Tempo de processamento 1   " + tempoProcessamento1);
			System.out.println("Tempo de processamento 2   " + tempoProcessamento2);
		}
	}
}
