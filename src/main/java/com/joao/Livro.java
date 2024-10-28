package com.joao;

import com.joao.Titulo;

public class Livro {
	Titulo titulo;
	public Livro(int codigo) {
		//inst�ncia um titulo e o associa ao livro
		titulo = new Titulo(codigo);
	}
	public int verPrazo() {
		return titulo.getPrazo();
	}

	
}

