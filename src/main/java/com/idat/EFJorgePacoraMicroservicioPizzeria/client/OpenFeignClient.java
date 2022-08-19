package com.idat.EFJorgePacoraMicroservicioPizzeria.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFJorgePacoraMicroservicioPizzeria.dto.PizzaDTO;

@FeignClient(name = "servicio-pizza", url="localhost:8085")
public interface OpenFeignClient {
	
	@GetMapping("/api/v1/pizza/listar")
	public List<PizzaDTO> listadopizzas();

}
