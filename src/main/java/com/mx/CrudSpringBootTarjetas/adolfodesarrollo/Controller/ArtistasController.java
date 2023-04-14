package com.mx.CrudSpringBootTarjetas.adolfodesarrollo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudSpringBootTarjetas.Entity.Tarjetas;
import com.mx.CrudSpringBootTarjetas.adolfodesarrollo.Entity.Artistas;
import com.mx.CrudSpringBootTarjetas.adolfodesarrollo.Service.Imp.ArtistasImp;

@RestController
@RequestMapping("WSArtistas")
@CrossOrigin
public class ArtistasController {
	
	@Autowired
	ArtistasImp artistasImp;
	
	@GetMapping("ConsultarArtistas")
	public List<Artistas> consultarArtistas(){
		List<Artistas>listaArtista = artistasImp.ConsultarArtistas();
		return listaArtista;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Artistas artistas ) {
		artistasImp.guardar(artistas);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Artistas artistas ) {
		artistasImp.editar(artistas);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Artistas artistas) {
		artistasImp.eliminar(artistas);
	}
	
	@PostMapping("BuscarArtistas")
	public Artistas buscarTarjeta(@RequestBody Artistas artistas) {
		Artistas artistasBuscar = artistasImp.buscarArtistas(artistas);
		return artistasBuscar;
	}

}
