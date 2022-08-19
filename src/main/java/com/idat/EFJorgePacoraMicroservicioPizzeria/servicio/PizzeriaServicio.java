package com.idat.EFJorgePacoraMicroservicioPizzeria.servicio;

import java.util.List;

import com.idat.EFJorgePacoraMicroservicioPizzeria.modelo.Pizzeria;

public interface PizzeriaServicio {
	
	public List<Pizzeria> listarPizzerias();
	public void guardarPizzerias(Pizzeria pizzeria);
	void asignarpizzas();

}
