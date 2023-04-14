package com.mx.CrudSpringBootTarjetas.adolfodesarrollo.Service;

import java.util.List;

import com.mx.CrudSpringBootTarjetas.adolfodesarrollo.Entity.Artistas;

public interface IArtistas {
	
	public void guardar (Artistas artistas);
	public void editar (Artistas artistas);
	public void eliminar (Artistas artistas);
	public List<Artistas> ConsultarArtistas();
	public Artistas buscarArtistas (Artistas artistas);
}
