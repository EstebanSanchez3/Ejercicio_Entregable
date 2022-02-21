package com.Ejer_Entrega;

public class InfoPeliculas {

//DECLARACIONES
	private String Título;
	private String Sinopsis;
	private int estreno;
	private String urlImagen;

//COSNTRUCTOR VACIO
	public InfoPeliculas() {
		super();
	}

//CONSTRUCTOR
	public InfoPeliculas(String título, String sinopsis, int estreno, String urlImagen) {
		Título = título;
		Sinopsis = sinopsis;
		this.estreno = estreno;
		this.urlImagen = urlImagen;
	}
//GETTERS Y SETTERS

	public String getTítulo() {
		return Título;
	}

	public void setTítulo(String título) {
		Título = título;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}

	public int getEstreno() {
		return estreno;
	}

	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

}
