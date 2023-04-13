package com.mx.CrudSpringBootTarjetas.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudSpringBootTarjetas.Entity.Tarjetas;
import com.mx.CrudSpringBootTarjetas.Repository.TarjetasRepository;
import com.mx.CrudSpringBootTarjetas.Service.ITarjetas;

	@Service
public class TarjetasImp implements ITarjetas{
	
	@Autowired
	TarjetasRepository tarjetasRepository;

	@Override
	public void guardar(Tarjetas tarjetas) {
		tarjetasRepository.save(tarjetas);
		
	}

	@Override
	public void editar(Tarjetas tarjetas) {
		tarjetasRepository.save(tarjetas);
		
	}

	@Override
	public void eliminar(Tarjetas tarjetas) {
		tarjetasRepository.delete(tarjetas);
	}

	@Override
	public List<Tarjetas> ConsultaTarjetas() {
		List<Tarjetas> listaTarjetas = tarjetasRepository.findAll();
		return listaTarjetas;
	}

	@Override
	public Tarjetas buscarTarjetas(Tarjetas tarjetas) {
		Tarjetas tarjetasB = tarjetasRepository.findById(tarjetas.getId()).orElse(tarjetas);
		return tarjetasB;
	}

}
