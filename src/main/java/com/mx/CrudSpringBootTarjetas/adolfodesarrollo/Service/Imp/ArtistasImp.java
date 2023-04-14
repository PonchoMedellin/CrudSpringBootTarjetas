package com.mx.CrudSpringBootTarjetas.adolfodesarrollo.Service.Imp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.CrudSpringBootTarjetas.adolfodesarrollo.Entity.Artistas;
import com.mx.CrudSpringBootTarjetas.adolfodesarrollo.Repository.ArtistasRepository;
import com.mx.CrudSpringBootTarjetas.adolfodesarrollo.Service.IArtistas;
	
@Service
public class ArtistasImp implements IArtistas {
		
	@Autowired
	ArtistasRepository artistasRepository; 
		

	@Override
	public void guardar(Artistas artistas) {
		artistasRepository.save(artistas);	
		
	}

	@Override
	public void editar(Artistas artistas) {
		artistasRepository.save(artistas);
		
	}

	@Override
	public void eliminar(Artistas artistas) {
		artistasRepository.delete(artistas);
		
	}

	@Override
	public List<Artistas> ConsultarArtistas() {
		List<Artistas> listaArtistas = artistasRepository.findAll();
		return listaArtistas;
	}

	@Override
	public Artistas buscarArtistas(Artistas artistas) {
		Artistas artistasbuscar = artistasRepository.findById(artistas.getId()).orElse(artistas);
		return artistasbuscar;
	}

}
