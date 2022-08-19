package com.idat.EFJorgePacoraMicroservicioPizzeria.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class PizzeriaPizzaFK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4019122356884423294L;

	@Column(name="id_pizza", nullable = false, unique = true)
	private Integer idPizza;
	
	@Column(name="id_pizzeria", nullable = false, unique = true)
	private Integer idPizzeria;

}
