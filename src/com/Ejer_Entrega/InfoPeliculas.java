package com.Ejer_Entrega;

public class InfoPeliculas {

//DECLARACIONES
	private String T�tulo;
	private String Sinopsis;
	private int estreno;
	private String urlImagen;

//COSNTRUCTOR VACIO
	public InfoPeliculas() {
		super();
	}

//CONSTRUCTOR
	public InfoPeliculas(String t�tulo, String sinopsis, int estreno, String urlImagen) {
		T�tulo = t�tulo;
		Sinopsis = sinopsis;
		this.estreno = estreno;
		this.urlImagen = urlImagen;
	}
//GETTERS Y SETTERS

	public String getT�tulo() {
		return T�tulo;
	}

	public void setT�tulo(String t�tulo) {
		T�tulo = t�tulo;
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
