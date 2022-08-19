package com.idat.EFJorgePacoraMicroservicioPizzeria.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFJorgePacoraMicroservicioPizzeria.client.OpenFeignClient;
import com.idat.EFJorgePacoraMicroservicioPizzeria.dto.PizzaDTO;
import com.idat.EFJorgePacoraMicroservicioPizzeria.modelo.Pizzeria;
import com.idat.EFJorgePacoraMicroservicioPizzeria.modelo.PizzeriaDetalle;
import com.idat.EFJorgePacoraMicroservicioPizzeria.modelo.PizzeriaPizzaFK;
import com.idat.EFJorgePacoraMicroservicioPizzeria.repositorio.PizzeriaPizzaRepositorio;
import com.idat.EFJorgePacoraMicroservicioPizzeria.repositorio.PizzeriaRepositorio;

@Service
public class PizzeriaServicioImpl implements PizzeriaServicio{

	@Autowired
	private PizzeriaRepositorio repositorio;
	
	
	@Autowired
	private PizzeriaPizzaRepositorio repositoryPizzeriapizza;
	
	@Autowired
	private OpenFeignClient feignClient;
	
	
	@Override
	public List<Pizzeria> listarPizzerias() {
		return repositorio.findAll();
	}

	@Override
	public void guardarPizzerias(Pizzeria pizzeria) {
		repositorio.save(pizzeria);
		
	}

	@Override
	public void asignarpizzas() {
		
		}		
		
	}


