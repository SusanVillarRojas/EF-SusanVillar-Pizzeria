package com.idat.EF_SusanVillar_Pizzeria.service;

import java.util.List;

import com.idat.EF_SusanVillar_Pizzeria.modelo.Pizzeria;

public interface PizzeriaService {
	
	List<Pizzeria> listar();
	Pizzeria obtenerId(Integer id);
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);

}
