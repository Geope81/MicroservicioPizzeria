package com.idat.EFJorgePacoraMicroservicioPizzeria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJorgePacoraMicroservicioPizzeria.modelo.PizzeriaDetalle;

@Repository
public interface PizzeriaPizzaRepositorio extends JpaRepository<PizzeriaDetalle,Integer>{

}
