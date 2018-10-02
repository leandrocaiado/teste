package br.exercicio.service;

import br.exercicio.modelo.Employee;

public interface ISerializaDesserializa {	
	public long serializa1(Employee obj);
	public long serializa2(Employee obj);
	public void desserializa1(Employee obj);
	public void desserializa2(byte []b);
}
