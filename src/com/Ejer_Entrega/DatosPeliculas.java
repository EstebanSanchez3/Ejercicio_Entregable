package com.Ejer_Entrega;

import java.util.ArrayList;

public class DatosPeliculas {
	public ArrayList<InfoPeliculas> getpeliculas() {
		ArrayList<InfoPeliculas> peliculas = new ArrayList<InfoPeliculas>();
		peliculas.add(new InfoPeliculas("Inception", "origen.jpg", 2010,
				"Es una pel�cula de ciencia ficci�n que relata la historia  de un grupo de ladrones que utilizan una m�quina que invade los sue�os para conquistar sus objetivos m�s audaces."));

		return peliculas;
	}
}
