package com.Ejer_Entrega;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value = "/")
	public String getPrincipalPage() {
		return "principal.html";
	}

	@RequestMapping(value = "/verinformaticos")
	public String getpaginaPeliculas(Model model) {
		// OBTENER DATOS
		DatosPeliculas gp = new DatosPeliculas();
		ArrayList<InfoPeliculas> peliculas = gp.getpeliculas();
		// METER DATOS
		model.addAttribute("Peliculosass", peliculas);
		// DEVOLVER DATOS
		return "peliculas.html";

	}

}