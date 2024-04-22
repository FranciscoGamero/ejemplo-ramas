package com.salesianostriana.dam.holamundoramas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	String sayHello(Model model) {
		model.addAttribute("mensaje", "¡Hola Mundo!");
		return "index";
	}
}
