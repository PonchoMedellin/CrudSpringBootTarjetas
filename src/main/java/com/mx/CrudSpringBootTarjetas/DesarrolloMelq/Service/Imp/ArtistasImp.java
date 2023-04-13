package com.mx.CrudSpringBootTarjetas.DesarrolloMelq.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudSpringBootTarjetas.DesarrolloMelq.Entity.Artistas;
import com.mx.CrudSpringBootTarjetas.DesarrolloMelq.Repository.ArtistasRepository;
import com.mx.CrudSpringBootTarjetas.DesarrolloMelq.Service.IArtistas;

@Service
public class ArtistasImp implements IArtistas{

	@Autowired
	ArtistasRepository artistasRepository;
	
	@Override
	public void guardar(Artistas artista) {
		artistasRepository.save(artista);
		
	}

	@Override
	public void editar(Artistas artista) {
		artistasRepository.save(artista);
		
	}

	@Override
	public void eliminar(Artistas artista) {
		artistasRepository.delete(artista);
		
	}

	@Override
	public List<Artistas> ConsultaArtistas() {
		List<Artistas> listaArtistas = artistasRepository.findAll();
		return listaArtistas;
	}

	@Override
	public Artistas buscarArtistas(Artistas artista) {
		Artistas artistaB = artistasRepository.findById(artista.getId()).orElse(artista);
		return artistaB;
	}

}
