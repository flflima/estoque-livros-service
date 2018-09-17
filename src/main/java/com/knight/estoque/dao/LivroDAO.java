package com.knight.estoque.dao;

import java.util.ArrayList;
import java.util.List;

import com.knight.estoque.modelos.Livro;

public class LivroDAO {

	public List<Livro> listaLivros() {
		// cria um livro
		final Livro livro1 = new Livro();
		final List<String> autores1 = new ArrayList<>();
		autores1.add("João da Silva");
		autores1.add("Maria dos Santos");
		
		livro1.setNome("Testando Muitos Livros");
		livro1.setAnoDePublicacao(2011);
		livro1.setEditora("Editora de Livros");
		livro1.setResumo("Livro de testes");
		livro1.setAutores(autores1);

		// gera lista com os livros
		final List<Livro> livros = new ArrayList<>();
		livros.add(livro1);

		return livros;
	}
}
