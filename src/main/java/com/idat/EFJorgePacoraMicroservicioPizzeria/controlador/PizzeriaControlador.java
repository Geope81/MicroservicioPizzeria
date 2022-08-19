package com.idat.EFJorgePacoraMicroservicioPizzeria.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFJorgePacoraMicroservicioPizzeria.modelo.Pizzeria;
import com.idat.EFJorgePacoraMicroservicioPizzeria.servicio.PizzeriaServicio;

@Controller
@RequestMapping("/api/v1/pizzeria")
public class PizzeriaControlador {
	
	@Autowired
	private PizzeriaServicio servicio; 
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizzeria> listarPizzerias() {
		return servicio.listarPizzerias(); 
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizzeria(@RequestBody Pizzeria pizzeria) {
		servicio.guardarPizzerias(pizzeria);
	}

}
