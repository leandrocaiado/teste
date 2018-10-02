package br.exercicio.teste;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.Test;

import br.exercicio.constante.Constantes;
import br.exercicio.modelo.Employee;

public class SerializedComTest {

	

	@Test
	public void testFile() throws IOException, ClassNotFoundException {

		Employee obj = new Employee(1, "Employee " + 1, new Date());
		FileOutputStream arquivoGrav;
		arquivoGrav = new FileOutputStream(Constantes.CAMINHO);
		ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
		objGravar.writeObject(obj);
		objGravar.flush();
		objGravar.close();
		arquivoGrav.flush();
		arquivoGrav.close();

		FileInputStream arquivoLeitura;
		arquivoLeitura = new FileInputStream(Constantes.CAMINHO);
		ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
		System.out.println(objLeitura.readObject());
		objLeitura.close();

		assertTrue(1 == obj.getId());

	}

	@Test
	public void testByteArray() throws IOException, ClassNotFoundException, InterruptedException {
		Employee obj = new Employee(1, "Employee " + 1, new Date());
		
		byte b[] = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = new ObjectOutputStream(bos);
		out.writeObject(obj);
		b = bos.toByteArray();
		out.close();
		bos.close();

		assertTrue(1 == obj.getId());

	}
}