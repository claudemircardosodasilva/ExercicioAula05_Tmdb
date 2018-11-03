package br.usjt.arqsw18.pipoca.model.service;

import java.util.List;

public class ResultadoTMDB {
	
	private List <FilmeTMDB> results;
	
	public List <FilmeTMDB> getResults (){
		return results;
	}
	
	public void setResults (List <FilmeTMDB> results) {
		this.results = results;
		
	}
}
