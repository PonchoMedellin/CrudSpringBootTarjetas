package com.mx.CrudSpringBootTarjetas.DesarrolloMelq.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudSpringBootTarjetas.DesarrolloMelq.Entity.Artistas;
import com.mx.CrudSpringBootTarjetas.DesarrolloMelq.Service.Imp.ArtistasImp;

@RestController
@RequestMapping("ArtistasWS")
@CrossOrigin
public class ArtistasController {

	@Autowired
	ArtistasImp artistasImp;
	
	@GetMapping("consultarArtistas")
	public List<Artistas> consultarArtistas(){
		List<Artistas> listaArtistas = artistasImp.ConsultaArtistas();
		return listaArtistas;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Artistas artista) {
		artistasImp.guardar(artista);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Artistas artista) {
		artistasImp.editar(artista);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Artistas artista) {
		artistasImp.eliminar(artista);
	}
	
	@PostMapping("buscar")
	public Artistas buscar(@RequestBody Artistas artista) {
		Artistas artistaB = artistasImp.buscarArtistas(artista);
		return artistaB;
	}
}
