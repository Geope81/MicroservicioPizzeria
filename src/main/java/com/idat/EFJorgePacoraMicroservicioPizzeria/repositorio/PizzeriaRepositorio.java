package com.idat.EFJorgePacoraMicroservicioPizzeria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJorgePacoraMicroservicioPizzeria.modelo.Pizzeria;

@Repository
public interface PizzeriaRepositorio extends JpaRepository<Pizzeria, Integer>{

}
