package com.knight.estoque.servicos;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.knight.estoque.dao.LivroDAO;
import com.knight.estoque.modelos.Livro;

@WebService
public class ListagemLivros {

	public List<Livro> listarLivros() {
		final LivroDAO livroDAO = new LivroDAO();
		return livroDAO.listaLivros();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/livros", new ListagemLivros());
		
		System.out.println("Serviço iniciado!");
	}
}
