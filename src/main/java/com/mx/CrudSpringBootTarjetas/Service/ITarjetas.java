package com.mx.CrudSpringBootTarjetas.Service;

import java.util.List;

import com.mx.CrudSpringBootTarjetas.Entity.Tarjetas;

public interface ITarjetas {

	public void guardar (Tarjetas tarjetas);
	public void editar (Tarjetas tarjetas);
	public void eliminar  (Tarjetas tarjetas);
	public List<Tarjetas> ConsultaTarjetas ();
	public Tarjetas buscarTarjetas (Tarjetas tarjetas);
}
