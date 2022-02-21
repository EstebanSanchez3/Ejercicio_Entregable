package com.Ejer_Entrega;

import java.util.ArrayList;

public class DatosPeliculas {
	public ArrayList<InfoPeliculas> getpeliculas() {
		ArrayList<InfoPeliculas> peliculas = new ArrayList<InfoPeliculas>();
		peliculas.add(new InfoPeliculas("Inception", "origen.jpg", 2010,
				"Es una película de ciencia ficción que relata la historia  de un grupo de ladrones que utilizan una máquina que invade los sueños para conquistar sus objetivos más audaces."));

		return peliculas;
	}
}
