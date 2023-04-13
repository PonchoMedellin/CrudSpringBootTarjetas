package com.mx.CrudSpringBootTarjetas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mx.CrudSpringBootTarjetas.Entity.Tarjetas;
import com.mx.CrudSpringBootTarjetas.Service.Imp.TarjetasImp;

@RestController
@RequestMapping("TarjetasWS")
@CrossOrigin
public class TarjetasController {

	@Autowired
	TarjetasImp tarjetasImp;

	@GetMapping("ConsultaTarjetas")
	public List<Tarjetas> consultarTarjetas() {
		List<Tarjetas> listaTarjetas = tarjetasImp.ConsultaTarjetas();
		return listaTarjetas;

	}

	@PostMapping("guardar")
	public void guardar(@RequestBody Tarjetas tarjetas) {
		tarjetasImp.guardar(tarjetas);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Tarjetas tarjetas) {
		tarjetasImp.editar(tarjetas);
	}

	@PostMapping("eliminar")
	public void eliminar(@RequestBody Tarjetas tarjetas) {
		tarjetasImp.eliminar(tarjetas);
	}

	@PostMapping("BuscarTarjeta")
	public Tarjetas buscarTarjeta(@RequestBody Tarjetas tarjetas) {
		Tarjetas tarjetasB = tarjetasImp.buscarTarjetas(tarjetas);
		return tarjetasB;
	}

}
