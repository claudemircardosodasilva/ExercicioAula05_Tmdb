package br.usjt.arqsw18.pipoca.model.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.usjt.arqsw18.pipoca.model.dao.FilmeDAO;
import br.usjt.arqsw18.pipoca.model.entity.Filme;

@Service
public class FilmeService {
	private FilmeDAO dao;
	private String url =
			"https://api.themoviedb.org/3/movie/popular?api_key=8c842da9d409e34daeb56172abcfe403&language=en-US&page=1";

	@Autowired
	public FilmeService(FilmeDAO fdao) {
		dao = fdao;
	}

	@Transactional
	public void CarregarFilmes () throws IOException{
		RestTemplate rt = new RestTemplate ();
		ResultadoTMDB 	resultado = 
				rt.
				getForObject(url, ResultadoTMDB.class);
		System.out.println(resultado.getResults().get(0).getOriginal_title());
	}

	public Filme buscarFilme(int id) throws IOException {
		return dao.buscarFilme(id);
	}

	@Transactional
	public Filme inserirFilme(Filme filme) throws IOException {
		int id = dao.inserirFilme(filme);
		filme.setId(id);
		return filme;
	}

	@Transactional
	public void excluirFilme(Filme filme) throws IOException {
		dao.removerFilme(filme);
	}

	@Transactional
	public void atualizarFilme(Filme filme) throws IOException {
		dao.atualizarFilme(filme);
	}

	public List<Filme> listarFilmes(String chave) throws IOException {
		return dao.listarFilmes(chave);
	}

	public List<Filme> listarFilmes() throws IOException {
		return dao.listarFilmes();
	}

}
