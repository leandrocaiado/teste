package br.exercicio.modelo;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
                public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

				private int id;
                private String name;
                private Date dtNascimento;
                
                public Employee(int id, String name, Date dtNascimento) {
                        this.id = id;
                        this.name = name;
                        this.dtNascimento = dtNascimento;
                }
                
        //      ... 
        }