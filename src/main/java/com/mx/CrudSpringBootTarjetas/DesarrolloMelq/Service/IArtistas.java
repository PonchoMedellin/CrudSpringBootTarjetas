package com.mx.CrudSpringBootTarjetas.DesarrolloMelq.Service;

import java.util.List;

import com.mx.CrudSpringBootTarjetas.DesarrolloMelq.Entity.Artistas;

public interface IArtistas {
	public void guardar (Artistas artista);
	public void editar (Artistas artista);
	public void eliminar  (Artistas artista);
	public List<Artistas> ConsultaArtistas ();
	public Artistas buscarArtistas (Artistas artista);
}
