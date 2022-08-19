package com.idat.EFJorgePacoraMicroservicioPizzeria.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="detalle_pizzeria")
public class PizzeriaDetalle {
	
	@Id
	private PizzeriaPizzaFK fk = new PizzeriaPizzaFK();

}
