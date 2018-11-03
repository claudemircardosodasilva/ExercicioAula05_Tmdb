package br.usjt.arqsw18.pipoca.model.service;

import java.util.Date;


public class FilmeTMDB {
	

private String overview;
private Double popularity;
private String Poster_Path;
private Date realese_date;
private int [] genre_ids;

	
	private String original_title;
	public String getOriginal_title() {
		return original_title;
	}
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	public String getPoster_Path() {
		return Poster_Path;
	}
	public void setPoster_Path(String poster_Path) {
		Poster_Path = poster_Path;
	}
	public Date getRealese_date() {
		return realese_date;
	}
	public void setRealese_date(Date realese_date) {
		this.realese_date = realese_date;
	}
	public int[] getGenre_ids() {
		return genre_ids;
	}
	public void setGenre_ids(int[] genre_ids) {
		this.genre_ids = genre_ids;
	}
}

	
	
